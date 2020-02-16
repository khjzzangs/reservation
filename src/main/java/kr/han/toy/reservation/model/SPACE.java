package kr.han.toy.reservation.model;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "SPACE")
@Getter
@NoArgsConstructor
public class SPACE {

    @Id
    private int spaceId;
    @Column(name= "NAME", nullable = false)
    private String name;
    @Column(name= "MIN", nullable = false)
    private int min;
    @Column(name= "MAX", nullable = false)
    private int max;
    @Column(name= "PRICE", nullable = false)
    private int price;
    @Column(name= "CAT_A", nullable = false)
    private String catA;
    @Column(name= "ETC", nullable = false)
    private String etc;
    @Column(name= "CREATED", nullable = false, updatable = false)
    private Date created;
    @Column(name= "UPDATE", nullable = false, updatable = true)
    private Date updated;

}
