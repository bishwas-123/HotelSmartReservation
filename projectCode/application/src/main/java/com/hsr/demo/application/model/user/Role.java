package com.hsr.demo.application.model.user;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToMany(mappedBy = "rollSet")
    private Set<Account> accountSet;
    private String role;

    public Role(Set<Account> accountSet, String roll) {
        this.accountSet = accountSet;
        this.role = roll;
    }

    public Role() {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void addInAccountSet(Account account){
        this.accountSet.add(account);
    }
    public void removeFromAccountSet(Account account){
        this.accountSet.remove(account);
    }
}
