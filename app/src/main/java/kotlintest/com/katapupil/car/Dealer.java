package kotlintest.com.katapupil.car;

import java.util.List;

class Dealer {

    public static final double GOLD_MEMBERSHIP_DISCOUNT_MULTIPLIER = 0.9;
    public static final double PLATINA_MEMBERSHIP_DISCOUNT_MULTIPLIER = 0.8;

    List<PartPrice> partPrices;
    Membership membership;

    public Dealer(List<PartPrice> partPrices, Membership membership) {
        this.partPrices = partPrices;
        this.membership = membership;
    }
}
