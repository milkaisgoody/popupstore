package com.westsomsom.finalproject.repository;

import com.westsomsom.finalproject.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//완료
@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
    Member save(Member member);
}
