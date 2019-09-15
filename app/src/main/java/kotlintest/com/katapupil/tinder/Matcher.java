package kotlintest.com.katapupil.tinder;

public class Matcher {

    boolean match(Person person1, Person person2) {

        if(Math.abs(person1.getAge() - person2.getAge()) < 5) {
            return true;
        } else {
            return false;
        }


    }
}
