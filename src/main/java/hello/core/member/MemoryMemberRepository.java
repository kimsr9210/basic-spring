package hello.core.member;

import java.util.HashMap;

public class MemoryMemberRepository implements MemberRepository{
    //메모리 회원 저장소 구현체

    //저장소니까 저장해야함
    private static HashMap<Long, Member> store = new HashMap<>();  //*HashMap 은 동시성 이슈가 발생할 수 있다. 이런 경우 ConcurrentHashMap 을 사용해야한다.


    @Override
    public void save(Member member) {
        store.put(member.getId(), member);

    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
