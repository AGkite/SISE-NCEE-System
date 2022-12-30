package beans;
//考生总类
public class Student {
    private int id;
    private String exam_num;
    private String name;
    private String sex;
    private String high_school;
    private int chinese;
    private int math;
    private int english;
    private int total_point;
    private String area;

    public Student(){
        super();
    }
    public Student(int id,String exam_num,String name,String sex,String high_school,int chinese,int math,int english,int total_point,String area){
        this.id=id;
        this.exam_num=exam_num;
        this.name=name;
        this.sex=sex;
        this.high_school=high_school;
        this.chinese=chinese;
        this.math=math;
        this.english=english;
        this.total_point=total_point;
        this.area=area;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExam_num() {
        return exam_num;
    }

    public void setExam_num(String exam_num) {
        this.exam_num = exam_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHigh_school() {
        return high_school;
    }

    public void setHigh_school(String high_school) {
        this.high_school = high_school;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getTotal_point() {
        return total_point;
    }

    public void setTotal_point(int total_point) {
        this.total_point = total_point;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
