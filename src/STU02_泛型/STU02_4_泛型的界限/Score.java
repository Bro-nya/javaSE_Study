package STU02_泛型.STU02_4_泛型的界限;

public class Score<T extends Number> {/*限定上界，最多继承到Number类*/
    String name;
    String id;
    T value;

    public Score(String name, String id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public static  <T> T test(){
        return null;
    }
}
