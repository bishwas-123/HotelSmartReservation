package com.hsr.demo.application.model.user;

import com.hsr.demo.application.model.review.Review;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "info_id")
    private Person info;

    @ManyToMany
    @JoinTable(
            name = "account_roll",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "roll_id")
    )
    private Set<Role> rollSet;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "roll")
//    private AccountRoll roll;
    @NotNull(message = "User name is required")
    private String userName;

    @NotNull(message = "Password is required")
    //@Password
    private String password;

    @NotNull(message = "Email address is required")
    @Email
    private String emailAddress;

    @CreatedDate
    private LocalDate createdDate;

    private Integer reward;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Review review;

    public Account(Person info, Set<Role> rollSet, String userName, String password,
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

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
        this.info = info;
    }

    public Set<Role> getRollSet() {
        return rollSet;
    }

    public void setRollSet(Set<Role> rollSet) {
        this.rollSet = rollSet;
    }

    public void addInRollSet(Role roll){
        this.rollSet.add(roll);
    }

    public void removeFromRollSet(Role roll){
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

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
