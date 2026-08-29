public class TextManipulation {

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Java Programming");

        System.out.println("======================================");
        System.out.println("         STRINGBUILDER DEMO");
        System.out.println("======================================");

        System.out.println("\nOriginal String");
        System.out.println("----------------");
        System.out.println(text);

        text.append(" is Easy");

        System.out.println("\nAfter Append");
        System.out.println("-------------");
        System.out.println(text);

        text.insert(5, "Object Oriented ");

        System.out.println("\nAfter Insert");
        System.out.println("------------");
        System.out.println(text);

        text.replace(5, 20, "OOP");

        System.out.println("\nAfter Replace");
        System.out.println("-------------");
        System.out.println(text);

        text.reverse();

        System.out.println("\nAfter Reverse");
        System.out.println("-------------");
        System.out.println(text);
    }
}
