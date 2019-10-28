package pl.itacademy.lesson7;

public class Window {
    int width;
    int height;
    String colour;
    boolean opened;

    static int numberOfCreatedWindows;

    Window(int width, int height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
        opened = false;
        numberOfCreatedWindows++;
    }

    void open() {
        opened = true;
        System.out.println("The window has been opened!");
    }

    void close() {
        opened = false;
        System.out.println("The window has been closed!");
    }

    boolean isOpened() {
        return opened;
    }

    static int getNumberOfCreatedWindows() {
        return numberOfCreatedWindows;
    }

}
