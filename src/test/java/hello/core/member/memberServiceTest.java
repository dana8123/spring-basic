package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class memberServiceTest {


    MemberService memberService = new MemberServiceImpl();
    @Test
    void  join() {
        // given 어떠한 환경이 주어졌을 때
        Member member = new Member(1L, "memberA", Grade.VIP);
        // when 이렇게 됐을 때
        memberService.join(member);
        Member findMember = memberService.findMember(1l);

        // then 이렇게 돼야한다.
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
