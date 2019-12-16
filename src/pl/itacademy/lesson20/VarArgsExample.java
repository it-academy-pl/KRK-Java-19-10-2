package pl.itacademy.lesson20;

public class VarArgsExample {
    public static void main(String[] args) {
        print("test");
        print("test", "java");
        print("test", "java", "more");
    }

    private static void print(String... text) {
        for (String s : text) {
            System.out.println(s);
        }
    }

}
