package DAO;

import beans.Student;

public interface StudentDao {
    //根据考号查找考生
    Student findStudentById(String exam);
    //带缩进和换行的字符串，显示在文本域中
    String findLiberalByArea(String area);
    String findScienceByArea(String area);
    String findArtsByArea(String area);
    //添加考生
    void addStudent(String exam_num,String name,String chinese,String math,String english,String total_point);
}
