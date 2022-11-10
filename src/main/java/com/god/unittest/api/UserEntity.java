package com.god.unittest.api;

import javax.persistence.*;

@Entity
@Table(name = "users")
@SequenceGenerator(name = "seq_users_gen", sequenceName = "seq_users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_users_gen")
    private Long id;
    private String name;
    private String addr;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private VipLevel vipLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public VipLevel getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(VipLevel vipLevel) {
        this.vipLevel = vipLevel;
    }
}
