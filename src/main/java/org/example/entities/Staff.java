package org.example.entities;

import java.math.BigDecimal;

public abstract class Staff extends User{

    private int staffId;
    private String staffQualification;
    private String role;


    public Staff(String firstName, String lastName, int idNo, BigDecimal dateOfBirth, int age, String gender, String homeAddress, Long contactPhoneNumber, String emailAddress, String nextOfKin, int staffId, String staffQualification, String role) {
        super(firstName, lastName, idNo, dateOfBirth, age, gender, homeAddress, contactPhoneNumber, emailAddress, nextOfKin);
        this.staffId = staffId;
        this.staffQualification = staffQualification;
        this.role = role;
    }




    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffQualification() {
        return staffQualification;
    }

    public void setStaffQualification(String staffQualification) {
        this.staffQualification = staffQualification;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffQualification='" + staffQualification + '\'' +
                ", role='" + role + '\'' +
                ", contactPhoneNumber=" + contactPhoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                '}';
    }
}
