package Hyunsoohello_NoDependencies.core.discount;

import Hyunsoohello_NoDependencies.core.member.Grade;
import Hyunsoohello_NoDependencies.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{


    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {

        if(member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        }
        else {
            return 0;
        }

    }
}
