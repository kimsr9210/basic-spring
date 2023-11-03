package hello.core.member;

public interface MemberRepository {
    //회원저장소 인터페이스
    void save(Member memver); //회원저장
    Member findById(Long memberId); //회원아이디 찾는 기능

}
