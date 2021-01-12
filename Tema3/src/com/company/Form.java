package com.company;

public class Form {
    private String fname;
    private String lname;
    private Integer age;
    private String gender;
    private String isMarried;
    private String address;


    public Form(String fname, String lname, Integer age, String gender, String isMarried, String address) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.address = address;
    }
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarried() {
        return isMarried;
    }

    public void setMarried(String married) {
        isMarried = married;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "First Name: " + fname + '\'' +
                "Last Name: " + lname + '\'' +
                "Age: " + age +
                "Gender: " + gender + '\'' +
                "Married: " + isMarried +
                "Address: " + address + '\'';
    }

}
