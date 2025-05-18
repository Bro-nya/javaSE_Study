package STU01_面向对象.STU01_2_继承;

public class Student extends People {
    private String studentNo;

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public void study(){
        System.out.println("study");
    }
}
