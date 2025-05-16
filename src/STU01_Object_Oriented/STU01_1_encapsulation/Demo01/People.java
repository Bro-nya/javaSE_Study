package STU01_Object_Oriented.STU01_1_encapsulation.Demo01;

public class People {
    /// private:私有权限
    private  String name;
    private  int age;

    /// 右键生成get。set方法,即可外部访问
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
