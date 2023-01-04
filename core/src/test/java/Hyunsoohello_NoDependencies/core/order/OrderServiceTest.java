package Hyunsoohello_NoDependencies.core.order;

import Hyunsoohello_NoDependencies.core.member.Grade;
import Hyunsoohello_NoDependencies.core.member.Member;
import Hyunsoohello_NoDependencies.core.member.MemberService;
import Hyunsoohello_NoDependencies.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
       //primitive type은 null을 넣을수 없어서 wrapper타입으로 넣어줌.
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA" , Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscoutPrice()).isEqualTo(1000);


    }

}
