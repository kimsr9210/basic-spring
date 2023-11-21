package hello.core.member;

public class MemberServiceImpl implements MemberService{
    //회원 서비스 구현체

    //private final MemberRepository memberRepository = new MemoryMemberRepository(); //의존
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) { //생성자
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
       memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
