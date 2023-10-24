package org.example.entities;

import java.math.BigDecimal;

public abstract class Staff{
    private String name;
    public String getName() {
        return name;
    }

    private int age;
    public int getAge() {
        return age;
    }

    private String gender;
    public String getGender() {
        return gender;
    }
    private BigDecimal dateOfAppointment;
    public BigDecimal getDateOfAppointment() {
        return dateOfAppointment;
    }

    private int level;
    public int getLevel() {
        return level;
    }
    private String nextOfKin;

    public String getNextOfKin() {
        return nextOfKin;
    }

    private String role;
    public String getRole() {
        return role;
    }


}
