package kotlintest.com.katapupil.negyedik;

public class Person {

    String name;
    String address;
    int[] birthDate;

    Person(String name)  {
        this.name = name;
    }
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    Person(String name, int[] birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    Person(String name, String address, int[] birthDate) {
        this.name = name;
        this.address = address;
        this.birthDate = birthDate;
    }

}
