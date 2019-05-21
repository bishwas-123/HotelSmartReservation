package com.hsr.demo.application.model.user;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "info_id")
    private Personal_info info;

    @ManyToMany
    @JoinTable(
            name = "account_roll",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "roll_id")
    )
    private Set<Roll> rollSet;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "roll")
//    private AccountRoll roll;

    private String userName;
    private String password;
    private String emailAddress;
    private LocalDate createdDate;

    private Integer reward;

    public Account(Personal_info info, Set<Roll> rollSet, String userName, String password,
                   String emailAddress) {
        this.info = info;
        this.rollSet = rollSet;
        this.userName = userName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.createdDate = LocalDate.now();
        this.reward = 0;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward){this.reward=reward;}

    public void addReward(Integer reward) {
        this.reward+=reward;
    }

    public void substractReward (Integer reward) {
        this.reward-=reward;
        if(this.reward<0) this.reward=0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Personal_info getInfo() {
        return info;
    }

    public void setInfo(Personal_info info) {
        this.info = info;
    }

    public Set<Roll> getRollSet() {
        return rollSet;
    }

    public void setRollSet(Set<Roll> rollSet) {
        this.rollSet = rollSet;
    }

    public void addInRollSet(Roll roll){
        this.rollSet.add(roll);
    }

    public void removeFromRollSet(Roll roll){
        this.rollSet.remove(roll);
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
