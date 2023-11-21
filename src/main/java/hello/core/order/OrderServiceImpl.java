package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

//주문 서비스 구현체
public class OrderServiceImpl implements OrderService{
    //OerderService는 할인은 난 몰라 ! 결과만 나에게 던져줘 => 단일체계원칙
    
    //OerderService는 두개 필요
    //1. 회원을 찾아야함
    //2. 고정 할인 정책
    //
    // private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId); //회원을 찾음
        int discountPrice = discountPolicy.discount(member, itemPrice);

        //주문 만들어서 반환
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
