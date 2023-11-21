package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

//애플리케이션 전체를 설정하고 구성
//애플리케이션에 대한 환경 구성에 대한건 여기서 다함
public class AppConfig { //AppConfig를 통해서 함수를 불러서 사용함

    public MemberService memberService(){
        //생성자 주입 : 생성자를 통해서 객체가 유인스턴스 생성된게 들어감
        //멤버 서비스 인플을 만들고 내가 만든느 멤버 서비스 인플은 메모리 멤버 리포지토리를 사용할 거야  --> 주입
        return new MemberServiceImpl(new MemoryMemberRepository()); //구현체 객체 생성
    }

    public OrderService orderService(){
        //생성자 주입
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}

