package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

//고정 할인 정책 구현체
public class FixDiscountPolicy implements DiscountPolicy{
    
    private int discountFixAmount = 1000; //1000원 할인
    
    @Override
    public int discount(Member member, int price) {
        //enum 타입은 == 을 써야함
        if(member.getGrade() == Grade.VIP){ //VIP면 1000원 할인
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
