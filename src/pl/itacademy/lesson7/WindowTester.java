package pl.itacademy.lesson7;

public class WindowTester {
    public static void main(String[] args) {
        Window javaWindow = new Window(10, 30, "White");
        //javaWindow.colour = "White";

        System.out.println("Window colour is: " + javaWindow.colour);

        javaWindow.open();
        if (javaWindow.isOpened()) {
            System.out.println("We checked window - it is opened!");
        } else {
            System.out.println("Whe checked window - it is closed!");
        }

        javaWindow.close();
        if (javaWindow.isOpened()) {
            System.out.println("We checked window - it is opened!");
        } else {
            System.out.println("Whe checked window - it is closed!");
        }

        System.out.println(Window.getNumberOfCreatedWindows());
        Window anotherWindow = new Window(100, 500, "Black");
        System.out.println(Window.getNumberOfCreatedWindows());


        //newer repeat this at home
        {
            int test = 5;
            if (test == 5) {
                System.out.println("aaa");
            }
        }
    }
}
