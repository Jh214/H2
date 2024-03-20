/*
package org.example.experiment.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
class Member{
    @Id

    @GeneratedValue(stragy=StranyType.IDENTITY)
    private long id;

    @Column
    private String username; // 로그인시 받는 id값

    @Column
    private String password; // 로그인시 받는 password값
    @Column
    private String email;
    @Column
    private String phone_number;
    @Column
    private String gender;

    @ElementCollection
    @CollectionTable(name="roles",joinColumns=@JoinColumn(name="member_id"))
    @Column(name="role")
    private List<String> hasRole = new ArrayList<>(); // 가지고 있는 권한 정보
}
*/
