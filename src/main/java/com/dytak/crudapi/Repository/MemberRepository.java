package com.dytak.crudapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dytak.crudapi.Domain.Member;


public interface MemberRepository extends JpaRepository<Member, Long> {


}
