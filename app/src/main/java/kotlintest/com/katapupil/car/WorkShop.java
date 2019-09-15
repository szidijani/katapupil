package kotlintest.com.katapupil.car;

import java.util.List;

class WorkShop {

    List<Dealer> dealerList;

    double computeServicePrice(Service service) {
        double sum = 0;

        for(Part part: service.partList) {
            sum = sum + minPartPrice(part);
        }

        sum = sum + service.workPrice();

        return sum;
    }

    private double minPartPrice(Part part) {
        double minPrice = 0;

        for(Dealer dealer: dealerList) {
            for(PartPrice partPrice: dealer.partPrices) {
                if (part.id.equals(partPrice.partId)) {
                    if (minPrice == 0 || discountForPart(dealer, partPrice) < minPrice) {
                        minPrice = partPrice.price;
                    }
                }
            }
        }

        return minPrice;
    }

    private double discountForPart(Dealer dealer, PartPrice partPrice) {
        switch (dealer.membership) {
            case GOLD:
                return partPrice.price * Dealer.GOLD_MEMBERSHIP_DISCOUNT_MULTIPLIER;

            case PLATINA:
                return partPrice.price * Dealer.PLATINA_MEMBERSHIP_DISCOUNT_MULTIPLIER;

            default:
                return partPrice.price;
        }
    }
}
