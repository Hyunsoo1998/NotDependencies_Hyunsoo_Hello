package Hyunsoohello_NoDependencies.core.order;

import Hyunsoohello_NoDependencies.core.discount.DiscountPolicy;
import Hyunsoohello_NoDependencies.core.discount.FixDiscountPolicy;
import Hyunsoohello_NoDependencies.core.member.Member;
import Hyunsoohello_NoDependencies.core.member.MemberRepository;
import Hyunsoohello_NoDependencies.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy  = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice=  discountPolicy.discount(member, itemPrice);

        return new Order(memberId , itemName, itemPrice, discountPrice);

    }
}
