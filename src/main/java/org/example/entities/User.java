package org.example.entities;

import java.math.BigDecimal;

public class User {
    private String firstName;

    private String lastName;

    private int idNo;

    private BigDecimal dateOfBirth;

    private int age;

    private String Gender;

    private String homeAddress;

    public Long contactPhoneNumber;

    public String emailAddress;

    public String nextOfKin;


    public User(String firstName, String lastName, int idNo, BigDecimal dateOfBirth, int age, String gender, String homeAddress, Long contactPhoneNumber, String emailAddress, String nextOfKin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNo = idNo;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        Gender = gender;
        this.homeAddress = homeAddress;
        this.contactPhoneNumber = contactPhoneNumber;
        this.emailAddress = emailAddress;
        this.nextOfKin = nextOfKin;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public BigDecimal getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(BigDecimal dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(Long contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNo=" + idNo +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", contactPhoneNumber=" + contactPhoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                '}';
    }
}