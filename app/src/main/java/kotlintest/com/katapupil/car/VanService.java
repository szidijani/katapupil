package kotlintest.com.katapupil.car;

import java.util.List;

class VanService extends Service {

    private static final double NORMAL_CATEGORY_FEE_MULTIPLIER = 1.1;
    private static final double HEAVY_CATEGORY_FEE_MULTIPLIER = 1.3;

    WeightCategory weightCategory;

    @Override
    public double workPrice() {
        double sum = super.workPrice();

        switch (weightCategory) {
            case NORMAL:
                sum = sum * NORMAL_CATEGORY_FEE_MULTIPLIER;
                break;

            case HEAVY:
                sum = sum * HEAVY_CATEGORY_FEE_MULTIPLIER;
                break;
        }

        return sum;
    }

    VanService(List<Part> partList, List<Work> workList, Client client, WeightCategory weightCategory) {
        super(partList, workList, client);
        this.weightCategory = weightCategory;
    }
}
