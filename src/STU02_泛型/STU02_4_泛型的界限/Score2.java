package STU02_泛型.STU02_4_泛型的界限;

public class Score2<T> {/*限定上界，最多继承到Number类，泛型对象和方法只能限定上界*/
    String name;
    String id;
    T value;

    public Score2(String name, String id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public static  <T> T test(){
        return null;
    }
}
