package kr.han.toy.reservation.repositories;

import kr.han.toy.reservation.model.DbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<DbUser, Integer> {
}
