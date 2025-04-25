package com.project.exception.repository;

import com.project.exception.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MemberRepository {
    Map<Long, Member> memberDB = new HashMap<Long, Member>();
    Long member_seq = 1L;

    public void save(Member member) {
        memberDB.put(member_seq, member);
        member_seq++;
    }

    public Optional<Member> findByLoginId(String loginId) {
        return memberDB.values().stream()
                       .filter(member -> member.getLoginId().equals(loginId))
                       .findAny();
    }
}
