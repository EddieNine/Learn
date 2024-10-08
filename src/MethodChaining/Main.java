package MethodChaining;

public class Main {
    public static void main(String[] args) {


        String name = "bro";

        //name = name.concat(" code");
        //name = name.toUpperCase();
        //name = name.trim();

        name = name.concat(" code").toUpperCase().trim();

        System.out.println(name);
    }
}
