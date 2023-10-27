package org.example.entities;

import java.math.BigDecimal;

public class Applicant extends User {

    private String admissionLetter;
    private int testScore;
    private String guardianName;
    private String guardianPhoneNo;
    private String guardianEmailAdd;

    public Applicant(String firstName, String lastName, int idNo, BigDecimal dateOfBirth, int age, String gender, String homeAddress, Long contactPhoneNumber, String emailAddress, String nextOfKin, String admissionLetter, int testScore, String guardianName, String guardianPhoneNo, String guardianEmailAdd) {
        super(firstName, lastName, idNo, dateOfBirth, age, gender, homeAddress, contactPhoneNumber, emailAddress, nextOfKin);
        this.admissionLetter = admissionLetter;
        this.testScore = testScore;
        this.guardianName = guardianName;
        this.guardianPhoneNo = guardianPhoneNo;
        this.guardianEmailAdd = guardianEmailAdd;
    }

    public String getAdmissionLetter() {
        return admissionLetter;
    }

    public void setAdmissionLetter(String admissionLetter) {
        this.admissionLetter = admissionLetter;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianPhoneNo() {
        return guardianPhoneNo;
    }

    public void setGuardianPhoneNo(String guardianPhoneNo) {
        this.guardianPhoneNo = guardianPhoneNo;
    }

    public String getGuardianEmailAdd() {
        return guardianEmailAdd;
    }

    public void setGuardianEmailAdd(String guardianEmailAdd) {
        this.guardianEmailAdd = guardianEmailAdd;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "admissionLetter='" + admissionLetter + '\'' +
                ", testScore=" + testScore +
                ", guardianName='" + guardianName + '\'' +
                ", guardianPhoneNo='" + guardianPhoneNo + '\'' +
                ", guardianEmailAdd='" + guardianEmailAdd + '\'' +
                ", contactPhoneNumber=" + contactPhoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                '}';
    }

    public boolean age(int i) {
        int age;
        if (i >= 13) {
            System.out.println("CONGRATULATIONS YOU HAVE BEEN ADMITTED");
        }
        return true;
    }






}