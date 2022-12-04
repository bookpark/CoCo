package kfq.coco.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(length = 20)
    @NotNull
    private String nickname;

    @Column(length = 100, unique = true)
    @NotNull
    private String email;

    @Column
    @NotNull
    private String password;

}
