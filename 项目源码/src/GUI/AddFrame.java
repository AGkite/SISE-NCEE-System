package GUI;

import DAO.impl.StudentDaoImpl;
import dbutils.DBHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddFrame{
    JFrame frame;
    JLabel title;
    JLabel exam_num;
    JLabel name;
    JLabel chinese;
    JLabel math;
    JLabel english;
    JLabel total_point;

    JTextField exam_numT;
    JTextField nameT;
    JTextField chineseT;
    JTextField mathT;
    JTextField englishT;
    JTextField total_pointT;

    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JPanel p5;
    JPanel p6;
    JPanel p7;
    JPanel p8;

    JButton push;
    JButton reset;
    JButton cancel;

    public AddFrame(){
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
        ImageIcon icon=new ImageIcon("images/5.jpg");
        //Image im=new Image(icon);
        //将图片放入label中
        JLabel label=new JLabel(icon);

        //设置label的大小
        label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());

        frame=new JFrame();

        //获取窗口的第二层，将label放入
        frame.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));

        //获取frame的顶层容器,并设置为透明
        JPanel j=(JPanel)frame.getContentPane();
        j.setOpaque(false);

        frame.setTitle("添加考生");
        frame.setLayout(new GridLayout(8,1));
        frame.setBounds(300,200,600,420);


        Font font = new Font("华文行楷",Font.PLAIN,30);
        title = new JLabel("添加考生数据");
        title.setFont(font);

        exam_numT = new JTextField(15);
        nameT = new JTextField(15);
        chineseT = new JTextField(15);
        mathT = new JTextField(15);
        englishT = new JTextField(15);
        total_pointT = new JTextField(15);

        exam_num = new JLabel("考号：");
        name = new JLabel("姓名：");
        chinese = new JLabel("语文：");
        math = new JLabel("数学：");
        english = new JLabel("英语：");
        total_point = new JLabel("总分：");

        push = new JButton("提交");
        reset = new JButton("重置");
        cancel = new JButton("取消");
        //button大小
        push.setPreferredSize(new Dimension(80,40));
        reset.setPreferredSize(new Dimension(80,40));
        cancel.setPreferredSize(new Dimension(80,40));
        //button颜色
        Color color = new Color(0xD2A0EF);
        push.setBackground(color);
        reset.setBackground(color);
        cancel.setBackground(color);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        p8 = new JPanel();
        //必须设置为透明的。否则看不到图片
        p1.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        p4.setOpaque(false);
        p5.setOpaque(false);
        p6.setOpaque(false);
        p7.setOpaque(false);
        p8.setOpaque(false);
        //将按钮、文本框等放入JPanel中
        p1.add(title);
        p2.add(exam_num);
        p2.add(exam_numT);
        p3.add(name);
        p3.add(nameT);
        p4.add(chinese);
        p4.add(chineseT);
        p5.add(math);
        p5.add(mathT);
        p6.add(english);
        p6.add(englishT);
        p7.add(total_point);
        p7.add(total_pointT);
        p8.add(push);
        p8.add(reset);
        p8.add(cancel);
        //将JPanel加入到JFrame中
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);
        frame.add(p6);
        frame.add(p7);
        frame.add(p8);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //事件监听
        push.addActionListener(new AddAction(this));
        reset.addActionListener(new AddAction(this));
        cancel.addActionListener(new AddAction(this));
    }

}

class AddAction implements ActionListener{
    //定义一个AddaddFrame类私有属性，用于联系窗口和事件监听
    private AddFrame addFrame;
    //定义带AddaddFrame类型参数的构造方法，用于传参
    public AddAction (AddFrame addFrame){
        this.addFrame = addFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == addFrame.push){//提交按钮
            //拿到文本框的数据
            String exam_num = addFrame.exam_numT.getText();
            String name = addFrame.nameT.getText();
            String chinese = addFrame.chineseT.getText();
            String math = addFrame.mathT.getText();
            String english = addFrame.englishT.getText();
            String total_point = addFrame.total_pointT.getText();

            if(exam_num.equals("")|name.equals("")|chinese.equals("")|math.equals("")|english.equals("")| total_point.equals("")){
                JOptionPane.showMessageDialog(null,"字段不能为空，输入错误请重新输入！");
            }else{
                //调用addStudent()方法往数据库中插入考生数据
                 new StudentDaoImpl().addStudent(exam_num,name,chinese,math,english,total_point);
                JOptionPane.showMessageDialog(null,"已成功添加考生："+name);
            }
        }else if(e.getSource()==addFrame.reset){//重置按钮
            //重置
            addFrame.exam_numT.setText("");
            addFrame.nameT.setText("");
            addFrame.chineseT.setText("");
            addFrame.mathT.setText("");
            addFrame.englishT.setText("");
            addFrame.total_pointT.setText("");
        }else if(e.getSource()==addFrame.cancel){//取消按钮
            //销毁此窗口
            addFrame.frame.dispose();
        }

    }
}