package org.example.entities;

import java.math.BigDecimal;

public abstract class Teacher extends Staff {
    private String role;
    private BigDecimal salary;
    private String MaritalStatus;
    private String rankLvl;


    public Teacher(String firstName, String lastName, int idNo, BigDecimal dateOfBirth, int age, String gender, String homeAddress, Long contactPhoneNumber, String emailAddress, String nextOfKin, int staffId, String staffQualification, String role, String role1, BigDecimal salary, String maritalStatus, String rankLvl) {
        super(firstName, lastName, idNo, dateOfBirth, age, gender, homeAddress, contactPhoneNumber, emailAddress, nextOfKin, staffId, staffQualification, role);
        this.role = role1;
        this.salary = salary;
        MaritalStatus = maritalStatus;
        this.rankLvl = rankLvl;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
        this.role = role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getMaritalStatus() {
        return MaritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        MaritalStatus = maritalStatus;
    }

    public String getRankLvl() {
        return rankLvl;
    }

    public void setRankLvl(String rankLvl) {
        this.rankLvl = rankLvl;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "role='" + role + '\'' +
                ", salary=" + salary +
                ", MaritalStatus='" + MaritalStatus + '\'' +
                ", rankLvl='" + rankLvl + '\'' +
                ", contactPhoneNumber=" + contactPhoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                '}';
    }
}