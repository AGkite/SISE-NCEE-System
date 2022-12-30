package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame {
    JLabel label;
    JButton add;
    JButton check;
    JButton find;
    JButton del;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JPanel p5;
    public MenuFrame(){
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
        ImageIcon icon=new ImageIcon("images/4.jpg");
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

        frame.setTitle("SISE高考预录数据信息管理系统");
        frame.setLayout(new GridLayout(5,1));
        frame.setBounds(300,200,600,420);

        Font font = new Font("华文行楷",Font.PLAIN,38);
        label = new JLabel("SISE高考预录数据信息管理系统");
        label.setFont(font);
        add = new JButton("增加");
        del = new JButton("删除");
        check = new JButton("查看");
        find = new JButton("查找");
        //大小
        add.setPreferredSize(new Dimension(80,40));
        del.setPreferredSize(new Dimension(80,40));
        check.setPreferredSize(new Dimension(80,40));
        find.setPreferredSize(new Dimension(80,40));
        //button颜色
        Color color = new Color(0xD2A0EF);
        add.setBackground(color);
        del.setBackground(color);
        check.setBackground(color);
        find.setBackground(color);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();

        //必须设置为透明的。否则看不到图片
        p1.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        p4.setOpaque(false);
        p5.setOpaque(false);

        p1.add(label);
        p2.add(add);
        p3.add(check);
        p4.add(find);
        p5.add(del);
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //事件注册
        add.addActionListener(new MenuAction(this));
        check.addActionListener(new MenuAction(this));
        find.addActionListener(new MenuAction(this));
        del.addActionListener(new MenuAction(this));
    }
}
class MenuAction implements ActionListener {
    //定义MenuFrame类变量和构造方法，联系事件类
    private MenuFrame frame;
    public MenuAction(MenuFrame frame){
        this.frame=frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //增加数据
        if(e.getSource()==frame.add){
            new AddFrame();
        }
        //查看成绩表
        else if(e.getSource()==frame.check){
            new CheckFrame();
        }
        //查找学生
        else if(e.getSource()==frame.find){
            new FindFrame();
        }
        //删除数据
        else if(e.getSource()==frame.del){
            new DropFrame();
        }
    }
}


















