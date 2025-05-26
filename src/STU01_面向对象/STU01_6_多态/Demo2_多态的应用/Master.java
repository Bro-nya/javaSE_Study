package STU01_面向对象.STU01_6_多态.Demo2_多态的应用;

public class Master {
    /// 抽象父类或接口作为方法的参数
    public void feed(Pet pet){
        pet.eat();
    }
    //调用Dog，Cat独有方法
    public void play(Pet pet){
        if(pet instanceof Dog){
            Dog dog = (Dog)pet;
            dog.playdisk();
        }else if(pet instanceof Cat){
            Cat cat = (Cat)pet;
            cat.playball();
        }
    }

    /// 抽象父类或者方法作为方法的返回类型
    public Pet getPet(int type){
        Pet pet = null;
        if(type == 1){
            pet=new Dog();
        }else if(type == 2){
            pet=new Cat();
        }
        return pet;
    }
}
