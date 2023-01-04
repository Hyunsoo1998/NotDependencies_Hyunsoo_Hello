package Hyunsoohello_NoDependencies.core;


import Hyunsoohello_NoDependencies.core.member.*;
import Hyunsoohello_NoDependencies.core.member.Grade;

public class MemberApp {
    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA" , Grade.VIP);
        memberService.join(member);

       Member findMember =  memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}
