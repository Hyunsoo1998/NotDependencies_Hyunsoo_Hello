package Hyunsoohello_NoDependencies.core;


import Hyunsoohello_NoDependencies.core.member.Grade;
import Hyunsoohello_NoDependencies.core.member.Member;
import Hyunsoohello_NoDependencies.core.member.MemberService;
import Hyunsoohello_NoDependencies.core.member.MemberServiceImpl;
import Hyunsoohello_NoDependencies.core.order.Order;
import Hyunsoohello_NoDependencies.core.order.OrderService;
import Hyunsoohello_NoDependencies.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member=new Member(memberId, "memberA" , Grade.VIP);
        memberService.join(member);

        Order order =  orderService.createOrder(memberId, "itemA" , 10000);

        System.out.println("order = " + order);


    }
}
