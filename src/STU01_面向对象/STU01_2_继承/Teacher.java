package STU01_面向对象.STU01_2_继承;

public class Teacher extends People {
    private String teacherNo;
    ///
    private Integer age=20;

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public void teach(){
        System.out.println("教书");
    }
    /// super可调用父类属性和方法，this就算此类的
    public void showAge(){
        System.out.println(this.age);
        System.out.println(super.age);
    }

}

