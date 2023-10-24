package org.example.entities;

import java.math.BigDecimal;
public class Student {

        private String name;

        public String getName() {
            return name;
        }
        private BigDecimal dateOfBirth;

        public BigDecimal getDateOfBirth() {
            return dateOfBirth;
        }

        private int age;

        public void setAge(int age) {
            this.age = age;
        }
        private String Gender;
        public String getGender() {
            return Gender;
        }
        public String homeAddress;
        public String getHomeAddress() {
            return homeAddress;

        }
        public Long contactPhoneNumber;
        public Long getContactPhoneNumber() {
            return contactPhoneNumber;
        }
        public String emailAddress;
        public String getEmailAddress() {
            return homeAddress;
        }
        public String nextOfKin;
        public String getNextOfKin() {
            return nextOfKin;
        }
}