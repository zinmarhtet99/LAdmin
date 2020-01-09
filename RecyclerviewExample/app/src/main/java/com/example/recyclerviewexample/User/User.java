package com.example.recyclerviewexample.User;

public class User {
    String name,addr,phno,email;


    public User(String name, String addr, String phno, String email) {
        this.name = name;
        this.addr = addr;
        this.phno = phno;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public String getPhno() {
        return phno;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
