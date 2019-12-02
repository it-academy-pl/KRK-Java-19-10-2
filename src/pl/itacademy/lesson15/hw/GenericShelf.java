package pl.itacademy.lesson15.hw;

import java.util.ArrayList;
import java.util.List;

public class GenericShelf {
    private List<Box<?>> boxes = new ArrayList<>();

    public void addBox(Box<?> box) {
        boxes.add(box);
    }

    public List<Box<?>> getBoxes() {
        return boxes;
    }
}
