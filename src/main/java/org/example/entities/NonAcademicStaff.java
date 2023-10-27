package org.example.entities;

import java.math.BigDecimal;

public class NonAcademicStaff extends Staff{
    private String ContractList;
    private String roles;

    public NonAcademicStaff(String firstName, String lastName, int idNo, BigDecimal dateOfBirth, int age, String gender, String homeAddress, Long contactPhoneNumber, String emailAddress, String nextOfKin, int staffId, String staffQualification, String role, String contractList, String roles) {
        super(firstName, lastName, idNo, dateOfBirth, age, gender, homeAddress, contactPhoneNumber, emailAddress, nextOfKin, staffId, staffQualification, role);
        ContractList = contractList;
        this.roles = roles;

    }

    public String getContractList() {
        return ContractList;
    }

    public void setContractList(String contractList) {
        ContractList = contractList;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "NonAcademicStaff{" +
                "ContractList='" + ContractList + '\'' +
                ", roles='" + roles + '\'' +
                ", contactPhoneNumber=" + contactPhoneNumber +
                ", emailAddress='" + emailAddress + '\'' +
                ", nextOfKin='" + nextOfKin + '\'' +
                '}';
    }
}
