package GUI;

import DAO.impl.StudentDaoImpl;
import beans.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindFrame {
    JButton button;
    JLabel title;
    JLabel exam_num;
    JLabel name;
    JTextField exam_numT;
    JTextField nameT;
    JTextArea screen;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;

    public FindFrame(){
        //样式
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //加载图片
        ImageIcon icon=new ImageIcon("images/9.jpg");
        //Image im=new Image(icon);
        //将图片放入label中
        JLabel label=new JLabel(icon);

        //设置label的大小
        label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());

        JFrame frame=new JFrame();

        //获取窗口的第二层，将label放入
        frame.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));

        //获取frame的顶层容器,并设置为透明
        JPanel j=(JPanel)frame.getContentPane();
        j.setOpaque(false);

        frame.setTitle("查找考生");
        frame.setBounds(300,200,600,420);
        frame.setLayout(new GridLayout(5,1));

        Color color = new Color(0xFFFFFFFF, true);
        Font font = new Font("华文行楷",Font.PLAIN,30);
        title = new JLabel("查找考生");
        title.setFont(font);
        exam_num = new JLabel("考生号：");
        exam_num.setForeground(color);
        exam_numT = new JTextField(10);
        name = new JLabel("  姓名：");
        name.setForeground(color);
        nameT = new JTextField(10);
        button = new JButton("确定");
        button.setPreferredSize(new Dimension(80,40));
        //button颜色
        button.setBackground(new Color(0xD2A0EF));
        screen = new JTextArea();

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        //必须设置为透明的。否则看不到图片
        p1.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        p4.setOpaque(false);

        p1.add(title);
        p2.add(exam_num);
        p2.add(exam_numT);
        p3.add(name);
        p3.add(nameT);
        p4.add(button);


        frame.add(p1);
        frame.add(screen);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //事件监听
        button.addActionListener(new FindAction(this));
    }
}
class FindAction implements ActionListener {
    private FindFrame findFrame;
    public FindAction(FindFrame findFrame){
        this.findFrame = findFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == findFrame.button){//实现根据考号和姓名查找学生信息
            String exam_num = findFrame.exam_numT.getText();
            String name = findFrame.nameT.getText();
            //调用StudentDaoImpl类，将数据库中数据的转换为Student对象
            StudentDaoImpl impl = new StudentDaoImpl();
            Student student = impl.findStudentById(exam_num);

            if(student == null |exam_num.equals("")|name.equals("")){
                JOptionPane.showMessageDialog(null,"输入错误，请重新输入！");
            }else{
                //判断输入的考号和姓名是否对应
                if(name.equals(student.getName()) && exam_num.equals(student.getExam_num())){
                    String str = "序号\t考号\t姓名\t语文\t数学\t英语\t总分\n";
                    findFrame.screen.setText(str+student.getId()+"\t"+student.getExam_num()+"\t"+student.getName()+"\t"+student.getChinese()+"\t"+
                            student.getMath()+"\t"+student.getEnglish()+"\t"+student.getTotal_point());
                }else{
                    JOptionPane.showMessageDialog(null,"该考生不存在！");
                }
            }
        }
    }
}
