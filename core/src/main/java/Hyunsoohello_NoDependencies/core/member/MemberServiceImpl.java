package Hyunsoohello_NoDependencies.core.member;

public class MemberServiceImpl implements MemberService{

    //MemberServiceImpl은 추상화와 구체화를 둘다 의존하기 때문에 DIP를 위반하고 있음.
    private final MemberRepository memberRepository = new MemoryMemberRepository();


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {

        return memberRepository.findById(memberId);

    }
}
