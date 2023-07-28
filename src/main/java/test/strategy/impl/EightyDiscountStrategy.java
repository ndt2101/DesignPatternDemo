package test.strategy.impl;

import test.strategy.IPromoteStrategy;

public class EightyDiscountStrategy implements IPromoteStrategy {
    @Override
    public long calculatePromotedPrice(long price) {
        return Math.round(price * 0.8);
    }
}
