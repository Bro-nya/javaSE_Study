package STU02_泛型.STU02_2_泛型与多态;

public class Main {
    public static void main(String[] args) {
        teat<String> teat=new teat<>();
        teat.test();
    }

    static class teat<E> implements jk<E>{

        @Override
        public E test() {
            return null;
        }
    }
}
