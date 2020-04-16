package kr.han.toy.reservation.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;



@Getter
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id @Column(name = "CUST_ID")
    private Integer custId;
    @Column(name = "NAME", length = 40 , nullable = false)
    private String name;
    @Column(name = "EMAIL", length = 100, nullable = false)
    private String email;
    @Column(name = "AGE", nullable = false)
    private int age;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "CUST_PW", nullable = false)
    private String custPW;
    @CreatedDate
    @Column(name = "CREATE_DT", nullable = false)
    private LocalDateTime createDt;
    @LastModifiedDate
    @Column(name = "UPDATE_DT", nullable = false)
    private LocalDateTime updateDt;




}
