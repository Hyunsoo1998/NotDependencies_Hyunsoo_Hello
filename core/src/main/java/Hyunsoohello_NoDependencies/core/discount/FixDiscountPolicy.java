package Hyunsoohello_NoDependencies.core.discount;

import Hyunsoohello_NoDependencies.core.member.Grade;
import Hyunsoohello_NoDependencies.core.member.Member;

public class FixDiscountPolicy implements  DiscountPolicy{

    private int discountFixAmount = 1000; // 1000원 할인.
    @Override
    public int discount(Member member, int price) {

        //enum타입은 == 이 맞음.
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
