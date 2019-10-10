package kotlintest.com.katapupil.gyakorlas;

import java.util.ArrayList;
import java.util.List;

public class GyakorlasFeladat {

    public static void main(String[] args) {
        Duck kiskacsa = new Duck();
        Plane hidroplan = new Plane();


        List<Flyable> flyables = new ArrayList<>();

        flyables.add(kiskacsa);
        flyables.add(hidroplan);

        for (Flyable flyable: flyables) {
            flyable.fly();
        }
    }

}
