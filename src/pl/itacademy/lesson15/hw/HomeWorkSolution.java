package pl.itacademy.lesson15.hw;

import java.util.List;

public class HomeWorkSolution {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        bookBox.addItem(new Tale());
        bookBox.addItem(new Fantasy());

        Box<Toy> toysBox = new Box<>();
        toysBox.addItem(new Toy());
        toysBox.addItem(new Toy());

        Box<Food> foodBox = new Box<>();
        foodBox.addItem(new Food());
        foodBox.addItem(new Food());
        foodBox.addItem(new Food());

        Shelf<Food> foodShelf = new Shelf<>();
        foodShelf.addBox(foodBox);

        Shelf<Book> bookShelf = new Shelf<>();
        bookShelf.addBox(bookBox);

        GenericShelf genericShelf = new GenericShelf();
        genericShelf.addBox(foodBox);
        genericShelf.addBox(bookBox);
        genericShelf.addBox(toysBox);

        List<Box<?>> boxes = genericShelf.getBoxes();
    }
}
