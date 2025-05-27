package STU02_泛型.STU02_4_泛型的界限;

public class MainTest {
    public static void main(String[] args) {
        Score<Number> score=new Score<>("x1","x2",1);
        Score2<? super Number> score2=new Score2<Object>("x1","x2",1);/*通配符可以定义上下界*/
    }
}
