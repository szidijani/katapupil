package kotlintest.com.katapupil.car;

import java.util.List;

class CarService extends Service {

    private static final double GOLD_MEMBERSHIP_DISCOUNT_MULTIPLIER = 0.9;
    private static final double PLATINA_MEMBERSHIP_DISCOUNT_MULTIPLIER = 0.8;

    @Override
    public double workPrice() {
        double sum = super.workPrice();

        switch (client.membership) {
            case START:
                break;

            case GOLD:
                sum = sum * GOLD_MEMBERSHIP_DISCOUNT_MULTIPLIER;
                break;

            case PLATINA:
                sum = sum * PLATINA_MEMBERSHIP_DISCOUNT_MULTIPLIER;
                break;
        }

        return sum;
    }

    CarService(List<Part> partList, List<Work> workList, Client client) {
        super(partList, workList, client);
    }
}
