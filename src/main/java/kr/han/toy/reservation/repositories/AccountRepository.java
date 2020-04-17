package kr.han.toy.reservation.repositories;

import kr.han.toy.reservation.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Customer, Integer> {

}
