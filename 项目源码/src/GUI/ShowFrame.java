package GUI;

import DAO.impl.StudentDaoImpl;

import javax.swing.*;
import java.awt.*;

public class ShowFrame extends JFrame {

    static JTextArea screen;

    public ShowFrame() {
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
        setTitle("考生数据");
        setLayout(new BorderLayout());

        JScrollPane p3 = new JScrollPane();
        screen = new JTextArea();
        p3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        p3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        p3.setViewportView(screen);
        add(p3);

        setVisible(true);
        pack();
        setBounds(300, 200, 900, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void writeScreen() {
        StudentDaoImpl impl = new StudentDaoImpl();
        //深圳地区
        screen.append("深圳地区:\n文科\n");
        screen.append("考号\t姓名\t性别\t中学名称\t语文\t数学\t英语\t历史\t地理\t总分\n");
        screen.append(impl.findLiberalByArea("深圳"));
        screen.append("\n理科\n");
        screen.append("考号\t姓名\t性别\t中学名称\t语文\t数学\t英语\t物理\t总分\n");
        screen.append(impl.findScienceByArea("深圳"));
        screen.append("\n艺术\n");
        screen.append("考号\t姓名\t性别\t中学名称\t语文\t数学\t英语\t美术\t总分\n");
        screen.append(impl.findArtsByArea("深圳"));
        //广州地区
        screen.append("\n\n广州地区:\n文科\n");
        screen.append("考号\t姓名\t性别\t中学名称\t语文\t数学\t英语\t历史\t地理\t总分\n");
        screen.append(impl.findLiberalByArea("广州"));
        screen.append("\n理科\n");
        screen.append("考号\t姓名\t性别\t中学名称\t语文\t数学\t英语\t物理\t总分\n");
        screen.append(impl.findScienceByArea("广州"));
        screen.append("\n艺术\n");
        screen.append("考号\t姓名\t性别\t中学名称\t语文\t数学\t英语\t美术\t总分\n");
        screen.append(impl.findArtsByArea("广州"));

    }
}