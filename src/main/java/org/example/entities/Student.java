package org.example.entities;

import java.math.BigDecimal;

public class Student extends User {

    private int studId;
    private Long guardianPhoneNumber;
    private String guardianEmailAdd;
    private String admissionDate;


    public Student(String firstName, String lastName, int idNo, BigDecimal dateOfBirth, int age, String gender, String homeAddress, Long contactPhoneNumber, String emailAddress, String nextOfKin, int studId, Long guardianPhoneNumber, String guardianemaolAdd, String admissionDate) {
        super(firstName, lastName, idNo, dateOfBirth, age, gender, homeAddress, contactPhoneNumber, emailAddress, nextOfKin);
        this.studId = studId;
        this.guardianPhoneNumber = guardianPhoneNumber;
        this.guardianEmailAdd = guardianemaolAdd;
        this.admissionDate = admissionDate;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public Long getGuardianPhoneNumber() {
        return guardianPhoneNumber;
    }

    public void setGuardianPhoneNumber(Long guardianPhoneNumber) {
        this.guardianPhoneNumber = guardianPhoneNumber;
    }

    public String getGuardianEmailAdd() {
        return guardianEmailAdd;
    }

    public void setGuardianEmailAdd(String guardianemaolAdd) {
        this.guardianEmailAdd = guardianemaolAdd;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", guardianPhoneNumber=" + guardianPhoneNumber +
                ", guardianemaolAdd='" + guardianEmailAdd + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                ", contactPhoneNumber=" + contactPhoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                '}';
    }
}