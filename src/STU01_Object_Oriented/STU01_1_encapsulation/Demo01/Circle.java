package STU01_Object_Oriented.STU01_1_encapsulation.Demo01;

public class Circle {
    private Integer/**包装类**/ radius;

    public  Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) throws Exception {
        if(radius > 0) {
            this.radius = radius;
        }else{
//            System.out.println("请输入正确的半径数值");
            throw new Exception("请输入正确的的半径数值");
        }
    }

    public void draw() {
        System.out.println("画⚪半径："+this.radius+"的圆");
    }
}
