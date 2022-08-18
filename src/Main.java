public class Main {
    public static void main(String[] args) {

        Box<Integer,String> box = new Box<>(10,"10");

        System.out.print(Box.met(box));

    }
}