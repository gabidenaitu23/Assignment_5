package com.company;

public class User {
    private String name;
    private int attempt;

    void Travel(){
        System.out.println("traveling along the Amazon rivers");
    }
    void Prepare(){
        System.out.println("follow a diet");
    }

    public User(String name, int attempt) {
        this.name = name;
        this.attempt = attempt;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", attempt=" + attempt +
                '}';
    }
}
