package test;

public class NoDiscountStrategy implements IPromoteStrategy {
    @Override
    public long calculatePromotedPrice(long price) {
        return price;
    }
}
