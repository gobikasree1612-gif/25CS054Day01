package com.example.banking.model;

public class User {
    private int userid;
    private String username;
    private String accno;
    private double balance;
    public User(){
        
    }
    public User(int userid,String username,String accno,double balance){
        this.userid = userid;
        this.username = username;
        this.accno = accno;
        this.balance = balance;
    }

    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAccno() {
        return accno;
    }
    public void setAccno(String accno) {
        this.accno = accno;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
