package STU01_面向对象.STU01_2_继承;

public class People {

    /// 将student与teacher类中相同的属性和方法，继承与people类中
    private Integer age2;
    private String name;/*private私有类型，外部无法访问*/
    ///
    protected  Integer age=30;/*protected保护类型，子类可访问*/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println("睡觉");
    }
}
