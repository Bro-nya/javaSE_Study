package STU01_Object_Oriented.STU01_1_encapsulation.Demo01;

public class Circle {
    private Integer/**包装类**/ radius;

    public  Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("画⚪半径："+this.radius+"的圆");
    }
}
