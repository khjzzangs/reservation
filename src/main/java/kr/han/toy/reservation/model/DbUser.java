package kr.han.toy.reservation.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "test")
@Getter
@NoArgsConstructor
public class DbUser {


    @Builder
    public DbUser(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "SEQ_TEST")
    @TableGenerator(
            name = "SEQ_TEST"
            , table = "TB_SEQUENCE"
            , pkColumnName = "SEQ_NAME"
            , valueColumnName = "SEQ_VALUE"
            , pkColumnValue = "SEQ_TEST"
            , initialValue = 1
            , allocationSize = 1 )
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
}
