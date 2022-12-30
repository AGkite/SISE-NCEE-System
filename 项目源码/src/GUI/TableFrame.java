package GUI;

import dbutils.DBHelper;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
/*
* 此类使用JTable以表格形式展示数据库中考生数据
* */
public class TableFrame extends JFrame {
    Vector rowData,columnNames;
    JTable table;
    JScrollPane scrollPane;

    Connection conn = null;
    PreparedStatement stat = null;
    ResultSet rs = null;

    public void ArtsTable(){
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
        //存放列名
        columnNames = new Vector();
        columnNames.add("序号");
        columnNames.add("考号");
        columnNames.add("姓名");
        columnNames.add("性别");
        columnNames.add("高中名称");
        columnNames.add("语文");
        columnNames.add("数学");
        columnNames.add("英语");
        columnNames.add("美术");
        columnNames.add("总分");
        columnNames.add("地区");
        //rowData用来存放行数据
        rowData = new Vector();
        //表格添加内容
        try{
            conn = DBHelper.getConn();
            stat = conn.prepareStatement("SELECT * FROM art ORDER BY total_point DESC;");
            rs = stat.executeQuery();
            while(rs.next()){
                Vector hang = new Vector();
                hang.add(rs.getInt("id"));
                hang.add(rs.getString("exam_num"));
                hang.add(rs.getString("name"));
                hang.add(rs.getString("sex"));
                hang.add(rs.getString("high_school"));
                hang.add(rs.getInt("chinese"));
                hang.add(rs.getInt("math"));
                hang.add(rs.getInt("english"));
                hang.add(rs.getInt("fine_arts"));
                hang.add(rs.getInt("total_point"));
                hang.add(rs.getString("area"));
                //加入到rowData
                rowData.add(hang);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error in Arts Grid View....."+e);
        }finally{
            DBHelper.closeAll(conn,stat,rs);
        }
        table = new JTable(rowData,columnNames);
        scrollPane = new JScrollPane(table);
        add(scrollPane);

        setTitle("艺术生数据表");
        pack();
        setVisible(true);
        setBounds(300, 200, 900, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void ScienceTable(){
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
        //存放列名
        columnNames = new Vector();
        columnNames.add("序号");
        columnNames.add("考号");
        columnNames.add("姓名");
        columnNames.add("性别");
        columnNames.add("高中名称");
        columnNames.add("语文");
        columnNames.add("数学");
        columnNames.add("英语");
        columnNames.add("物理");
        columnNames.add("总分");
        columnNames.add("地区");
        //rowData用来存放行数据
        rowData = new Vector();
        //表格添加内容
        try{
            conn = DBHelper.getConn();
            stat = conn.prepareStatement("SELECT * FROM science ORDER BY total_point DESC;");
            rs = stat.executeQuery();
            while(rs.next()){
                Vector hang = new Vector();
                hang.add(rs.getInt("id"));
                hang.add(rs.getString("exam_num"));
                hang.add(rs.getString("name"));
                hang.add(rs.getString("sex"));
                hang.add(rs.getString("high_school"));
                hang.add(rs.getInt("chinese"));
                hang.add(rs.getInt("math"));
                hang.add(rs.getInt("english"));
                hang.add(rs.getInt("physics"));
                hang.add(rs.getInt("total_point"));
                hang.add(rs.getString("area"));
                //加入到rowData
                rowData.add(hang);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error in Arts Grid View....."+e);
        }finally{
            DBHelper.closeAll(conn,stat,rs);
        }
        table = new JTable(rowData,columnNames);
        scrollPane = new JScrollPane(table);
        add(scrollPane);

        setTitle("理科生数据表");
        pack();
        setVisible(true);
        setBounds(300, 200, 900, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void LiberalTable(){
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
        //存放列名
        columnNames = new Vector();
        columnNames.add("序号");
        columnNames.add("考号");
        columnNames.add("姓名");
        columnNames.add("性别");
        columnNames.add("高中名称");
        columnNames.add("语文");
        columnNames.add("数学");
        columnNames.add("英语");
        columnNames.add("历史");
        columnNames.add("地理");
        columnNames.add("总分");
        columnNames.add("地区");

        //rowData用来存放行数据
        rowData = new Vector();
        //表格添加内容
        try{
            conn = DBHelper.getConn();
            stat = conn.prepareStatement("SELECT * FROM liberal ORDER BY total_point DESC;");
            rs = stat.executeQuery();
            while(rs.next()){
                Vector hang = new Vector();
                hang.add(rs.getInt("id"));
                hang.add(rs.getString("exam_num"));
                hang.add(rs.getString("name"));
                hang.add(rs.getString("sex"));
                hang.add(rs.getString("high_school"));
                hang.add(rs.getInt("chinese"));
                hang.add(rs.getInt("math"));
                hang.add(rs.getInt("english"));
                hang.add(rs.getInt("history"));
                hang.add(rs.getInt("geography"));
                hang.add(rs.getInt("total_point"));
                hang.add(rs.getString("area"));
                //加入到rowData
                rowData.add(hang);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error in Arts Grid View....."+e);
        }finally{
            DBHelper.closeAll(conn,stat,rs);
        }
        table = new JTable(rowData,columnNames);
        scrollPane = new JScrollPane(table);
        add(scrollPane);

        setTitle("艺术生数据表");
        pack();
        setVisible(true);
        setBounds(300, 200, 900, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    //英语符合条件的学生数据表
    public void EnglishTable(){
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
        //存放列名
        columnNames = new Vector();
        columnNames.add("序号");
        columnNames.add("考号");
        columnNames.add("姓名");
        columnNames.add("语文");
        columnNames.add("数学");
        columnNames.add("英语");
        columnNames.add("总分");
        //rowData用来存放行数据
        rowData = new Vector();
        //表格添加内容
        try{
            conn = DBHelper.getConn();
            stat = conn.prepareStatement("SELECT * FROM english ORDER BY total_point DESC;");
            rs = stat.executeQuery();
            while(rs.next()){
                Vector hang = new Vector();
                hang.add(rs.getInt("id"));
                hang.add(rs.getString("exam_num"));
                hang.add(rs.getString("name"));
                hang.add(rs.getInt("chinese"));
                hang.add(rs.getInt("math"));
                hang.add(rs.getInt("english"));
                hang.add(rs.getInt("total_point"));
                //加入到rowData
                rowData.add(hang);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error in Arts Grid View....."+e);
        }finally{
            DBHelper.closeAll(conn,stat,rs);
        }
        table = new JTable(rowData,columnNames);
        scrollPane = new JScrollPane(table);
        add(scrollPane);

        setTitle("英语符合条件学生数据表");
        pack();
        setVisible(true);
        setBounds(300, 200, 900, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void AllStudentTable(){
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
        //存放列名
        columnNames = new Vector();
        columnNames.add("序号");
        columnNames.add("考号");
        columnNames.add("姓名");
        columnNames.add("语文");
        columnNames.add("数学");
        columnNames.add("英语");
        columnNames.add("总分");
        //rowData用来存放行数据
        rowData = new Vector();
        //表格添加内容
        try{
            conn = DBHelper.getConn();
            stat = conn.prepareStatement("SELECT * FROM allstudent ORDER BY total_point DESC;");
            rs = stat.executeQuery();
            while(rs.next()){
                Vector hang = new Vector();
                hang.add(rs.getInt("id"));
                hang.add(rs.getString("exam_num"));
                hang.add(rs.getString("name"));
                hang.add(rs.getInt("chinese"));
                hang.add(rs.getInt("math"));
                hang.add(rs.getInt("english"));
                hang.add(rs.getInt("total_point"));
                //加入到rowData
                rowData.add(hang);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error in Arts Grid View....."+e);
        }finally{
            DBHelper.closeAll(conn,stat,rs);
        }
        table = new JTable(rowData,columnNames);
        scrollPane = new JScrollPane(table);
        add(scrollPane);

        setTitle("所有学生数据表");
        pack();
        setVisible(true);
        setBounds(300, 200, 900, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
