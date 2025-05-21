package STU02_泛型.STU02_1_泛型类;

public class Score<T,U> {
    String name;
    U id;
    ///Object 是所有类型的父类。因此就可以存放Integer和String
//    Object value;
    T value;

    public Score(String name, U id, T value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }
}
