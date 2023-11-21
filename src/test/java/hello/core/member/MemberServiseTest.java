package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiseTest {

    MemberService memberService;

    //테스트를 실행하기 전에 무조건 실행
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){
        //given 주어졌을때
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when 이렇게 했을때
        memberService.join(member);
        Member findMember = memberService.findMember(1L); //회원아이디

        //then 이렇게 된다 (검증)
        Assertions.assertThat(member).isEqualTo(findMember); //가입된 회원이랑 조회된 회원이랑 똑같은지
        //join한거랑 찾은거랑 똑같으면 초록색 불 뜸 틀리면 노란색 x가틈 맞으면
    }
}
