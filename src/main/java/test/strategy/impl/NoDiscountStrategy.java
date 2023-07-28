package test.strategy.impl;

import test.strategy.IPromoteStrategy;

public class NoDiscountStrategy implements IPromoteStrategy {
    @Override
    public long calculatePromotedPrice(long price) {
        return price;
    }
}
