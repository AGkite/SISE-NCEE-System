package DAO.impl;

import DAO.StudentDao;
import beans.Arts;
import beans.Liberal;
import beans.Science;
import beans.Student;
import dbutils.DBHelper;

import javax.swing.*;
import java.sql.*;

public class StudentDaoImpl implements StudentDao {
    //用于FindFrame类，根据考号查找学生
    public Student findStudentById(String exam) {
        if (exam == null) {
            return null;
        }
        Student student = new Student();
        Connection conn = DBHelper.getConn();
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = conn.prepareStatement("select * from allstudent where exam_num='" + exam + "';");
            rs = stat.executeQuery();
            while (rs.next()) {
                student.setId(rs.getInt("id"));
                student.setExam_num(rs.getString("exam_num"));
                student.setName(rs.getString("name"));
                student.setChinese(rs.getInt("chinese"));
                student.setMath(rs.getInt("math"));
                student.setEnglish(rs.getInt("english"));
                student.setTotal_point(rs.getInt("total_point"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBHelper.closeAll(conn, stat, rs);
        }
        if (student.getExam_num() == null) {
            return null;
        } else {
            return student;
        }
    }

    //用于ShowFrame类，返回带缩进和换行的字符串，显示在文本域中
    public String findLiberalByArea(String area) {

        Connection conn = DBHelper.getConn();
        PreparedStatement stat = null;
        ResultSet rs = null;
        String str = "";

        try {
            stat = conn.prepareStatement("select * from liberal where area='" + area + "';");
            rs = stat.executeQuery();
            while (rs.next()) {
                str += rs.getString("exam_num") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("sex") + "\t" +
                        rs.getString("high_school") + "\t" +
                        rs.getInt("chinese") + "\t" +
                        rs.getInt("math") + "\t" +
                        rs.getInt("english") + "\t" +
                        rs.getInt("history") + "\t" +
                        rs.getInt("geography") + "\t" +
                        rs.getInt("total_point") + "\n";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBHelper.closeAll(conn, stat, rs);
        }
        return str;
    }

    public String findScienceByArea(String area) {

        Connection conn = DBHelper.getConn();
        PreparedStatement stat = null;
        ResultSet rs = null;
        String str = "";

        try {
            stat = conn.prepareStatement("select * from science where area='" + area + "';");
            rs = stat.executeQuery();
            while (rs.next()) {
                str += rs.getString("exam_num") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("sex") + "\t" +
                        rs.getString("high_school") + "\t" +
                        rs.getInt("chinese") + "\t" +
                        rs.getInt("math") + "\t" +
                        rs.getInt("english") + "\t" +
                        rs.getInt("physics") + "\t" +
                        rs.getInt("total_point") + "\n";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBHelper.closeAll(conn, stat, rs);
        }
        return str;
    }

    public String findArtsByArea(String area) {

        Connection conn = DBHelper.getConn();
        PreparedStatement stat = null;
        ResultSet rs = null;
        String str = "";

        try {
            stat = conn.prepareStatement("select * from art where area='" + area + "';");
            rs = stat.executeQuery();
            while (rs.next()) {
                str += rs.getString("exam_num") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("sex") + "\t" +
                        rs.getString("high_school") + "\t" +
                        rs.getInt("chinese") + "\t" +
                        rs.getInt("math") + "\t" +
                        rs.getInt("english") + "\t" +
                        rs.getInt("fine_arts") + "\t" +
                        rs.getInt("total_point") + "\n";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBHelper.closeAll(conn, stat, rs);
        }
        return str;
    }

    //添加考生到allstudent表
    public void addStudent(String exam_num, String name, String chinese, String math, String english, String total_point) {
        //调用DBHelper类连接数据库
        Connection conn = DBHelper.getConn();
        //插入学生数据到数据库
        String sql = "INSERT allstudent (exam_num,name,chinese,math,english,total_point) " +
                "VALUES('" + exam_num + "','" + name + "','" + chinese + "','" + math + "','" + english + "','" + total_point + "');";
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = conn.prepareStatement(sql);
            stat.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            DBHelper.closeAll(conn, stat, rs);
        }
    }

    //用于DropFrame类，根据用户输入的考生号删除考生数据
    public void dropStudent(String text){
        int [] a = new int[4];//接收executeBatch返回的int型数组
        Connection conn = DBHelper.getConn();
        Statement stat = null;
        // 定义sql 语句
        String sqlArt = "delete from art where exam_num='"+text+"';";
        String sqlScience = "delete from science where exam_num='"+text+"';";
        String sqlLiberal = "delete from liberal where exam_num='"+text+"';";
        String sqlAllStudent = "delete from allstudent where exam_num='"+text+"';";
        try{
            stat = conn.createStatement();
            // 添加批处理sql
            stat.addBatch(sqlArt);
            stat.addBatch(sqlScience);
            stat.addBatch(sqlLiberal);
            stat.addBatch(sqlAllStudent);
            // 执行批处理sql
            a = stat.executeBatch();
            //stat.executeBatch();
            stat.clearBatch();
        }catch(SQLException ex ){
            ex.printStackTrace();
        }finally{
            try {
                conn.close();
                assert stat != null;
                stat.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        /*
         * 根据executeBatch返回的int型数组判断是否成功更改数据表
         * a[] = 1代表对数据表更改了一行
         * */
        if(a[0]==1||a[1]==1||a[2]==1|a[3]==1){
            JOptionPane.showMessageDialog(null,"删除考生成功。");
        }else {
            JOptionPane.showMessageDialog(null,"删除失败，考生不存在。");
        }
    }
}