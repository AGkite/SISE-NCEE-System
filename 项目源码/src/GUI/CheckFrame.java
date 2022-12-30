package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckFrame {
    JButton art;
    JButton science;
    JButton liberal;
    JButton conform;
    JButton all;
    JButton area;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JPanel p5;
    JPanel p6;
    JPanel p7;
    public CheckFrame(){
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
        ImageIcon icon=new ImageIcon("images/7.jpg");
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

        frame.setTitle("学生类别");
        frame.setBounds(300,200,600,420);
        frame.setLayout(new GridLayout(7,1));

        label = new JLabel("选择学生类别");
        Font font = new Font("华文行楷",Font.PLAIN,30);
        label.setFont(font);
        art = new JButton("艺术生");
        science = new JButton("理科生");
        liberal = new JButton("文科生");
        conform = new JButton("英语优生");
        all = new JButton("所有学生");
        area = new JButton("区域分类");

        art.setPreferredSize(new Dimension(80,40));
        science.setPreferredSize(new Dimension(80,40));
        liberal.setPreferredSize(new Dimension(80,40));
        conform.setPreferredSize(new Dimension(80,40));
        all.setPreferredSize(new Dimension(80,40));
        area.setPreferredSize(new Dimension(80,40));

        Color color = new Color(0xD2A0EF);
        art.setBackground(color);
        science.setBackground(color);
        liberal.setBackground(color);
        conform.setBackground(color);
        all.setBackground(color);
        area.setBackground(color);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();

        //必须设置为透明的。否则看不到图片
        p1.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        p4.setOpaque(false);
        p5.setOpaque(false);
        p6.setOpaque(false);
        p7.setOpaque(false);

        p1.add(label);
        p2.add(science);
        p3.add(liberal);
        p4.add(art);
        p5.add(conform);
        p6.add(all);
        p7.add(area);
        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.add(p5);
        frame.add(p6);
        frame.add(p7);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //事件注册
        science.addActionListener(new CheckAction(this));
        liberal.addActionListener(new CheckAction(this));
        art.addActionListener(new CheckAction(this));
        conform.addActionListener(new CheckAction(this));
        all.addActionListener(new CheckAction(this));
        area.addActionListener(new CheckAction(this));
    }
}
class CheckAction implements ActionListener {
    private CheckFrame checkFrame;
    public CheckAction(CheckFrame checkFrame){
        this.checkFrame = checkFrame;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==checkFrame.science){
            new TableFrame().ScienceTable();
        }else if(e.getSource()==checkFrame.liberal){
            new TableFrame().LiberalTable();
        }else if(e.getSource()==checkFrame.art){
            new TableFrame().ArtsTable();
        }else if(e.getSource()==checkFrame.conform){
            new TableFrame().EnglishTable();
        }else if(e.getSource()==checkFrame.all){
            new TableFrame().AllStudentTable();
        }else if(e.getSource()==checkFrame.area){
            new ShowFrame().writeScreen();
        }
    }
}
