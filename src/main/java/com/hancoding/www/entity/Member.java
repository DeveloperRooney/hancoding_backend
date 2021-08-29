package com.hancoding.www.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@ToString(exclude = {"articleList"})
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_idx")
    private Integer idx;

    @Column(name = "member_id")
    private String id;

    @Column(name = "member_pass")
    private String pass;

    @Column(name = "member_nick")
    private String nick;

    @Column(name = "member_mail")
    private String mail;

    @Column(name = "member_regdate")
    private LocalDateTime regdate;

    @Column(name = "member_update")
    private LocalDateTime update;

    @Column(name = "member_deleted")
    private int deleted;
}
