package pl.itacademy.lesson20;

import java.lang.annotation.Repeatable;

@Repeatable(Schedule.class)
public @interface Lesson {
    String date();

    String time();
}
