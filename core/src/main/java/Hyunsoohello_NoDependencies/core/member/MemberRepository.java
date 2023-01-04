package Hyunsoohello_NoDependencies.core.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);

}
