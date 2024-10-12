package Lambda;

public class Main {
    public static void main(String[] args) {

        String name = "bro";
        char symbol = '!';
        MyInterface myInterface = (x, y) -> {
            System.out.println("Hello World!");
            System.out.println("its is a nice day "+x);
        };

        MyInterface myInterface2 = (x,y) -> {
            System.out.println("Hello "+x+y);
        };

        myInterface2.message(name, symbol);
    }
}
