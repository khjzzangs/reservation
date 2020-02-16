package kr.han.toy.reservation.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
@Getter
@NoArgsConstructor
@Builder
public class Customer {

    @Id
    private int cust_id;
    @Column(name = "PWD", nullable = false)
    private String pwd
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "AGE", nullable = false)
    private int age;
    @Column(name = "PHONE", nullable = false)
    private String phone;

}
