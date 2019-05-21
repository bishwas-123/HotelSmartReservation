package com.hsr.demo.application.model.user;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Roll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToMany(mappedBy = "rollSet")
    private Set<Account> accountSet;
    private String roll;

    public Roll(Set<Account> accountSet, String roll) {
        this.accountSet = accountSet;
        this.roll = roll;
    }

    public Roll() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Account> getAccountSet() {
        return accountSet;
    }

    public void setAccountSet(Set<Account> accountSet) {
        this.accountSet = accountSet;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public void addInAccountSet(Account account){
        this.accountSet.add(account);
    }
    public void removeFromAccountSet(Account account){
        this.accountSet.remove(account);
    }
}
