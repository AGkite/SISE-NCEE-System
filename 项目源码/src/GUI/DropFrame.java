package GUI;

import DAO.impl.StudentDaoImpl;
import dbutils.DBHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DropFrame{
    JButton button;
    JLabel label2;
    JTextField exam_num;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    public DropFrame(){
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
        ImageIcon icon=new ImageIcon("images/8.png");
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

        frame.setTitle("删除考生数据");
        frame.setBounds(300,200,600,420);
        frame.setLayout(new GridLayout(3,1));

        Font font = new Font("华文行楷",Font.PLAIN,30);
        button = new JButton("确定");
        button.setPreferredSize(new Dimension(80,40));
        //button颜色
        button.setBackground(new Color(0xD2A0EF));
        label = new JLabel("输入考生号删除该考生");
        label.setFont(font);
        label2 = new JLabel("考生号：");
        exam_num = new JTextField(10);
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        //必须设置为透明的。否则看不到图片
        p1.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);

        p1.add(label);
        p2.add(label2);
        p2.add(exam_num);
        p3.add(button);
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //事件监听
        button.addActionListener(new DropAction(this));
    }
}
class DropAction implements ActionListener{
    private DropFrame dropFrame;
    public DropAction(DropFrame dropFrame){
        this.dropFrame = dropFrame;
    }

    public void actionPerformed(ActionEvent e){
        String text = dropFrame.exam_num.getText();
        if(e.getSource()==dropFrame.button){
            boolean k = false;
            for(int i=0;i<text.length();i++){
                if(!Character.isDigit(text.charAt(i))){
                    k = true;
                }
            }
            if(text.equals("")|k){
                JOptionPane.showMessageDialog(null,"输入错误！请重新输入。");
            }else{
                //调用dropStudent()方法，从数据库中删除考生
                new StudentDaoImpl().dropStudent(text);
            }
        }
    }
}