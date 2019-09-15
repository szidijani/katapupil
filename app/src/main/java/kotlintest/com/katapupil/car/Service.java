package kotlintest.com.katapupil.car;

import java.util.List;

public abstract class Service {

    List<Part> partList;
    List<Work> workList;

    Client client;

    public double workPrice() {
        double sum = 0;

        for(Work work : workList) {
            sum = sum + work.price;
        }

        return sum;
    }

    Service(List<Part> partList, List<Work> workList, Client client) {
        this.partList = partList;
        this.workList = workList;
        this.client = client;
    }
}
