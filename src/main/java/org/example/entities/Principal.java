package org.example.entities;

import java.math.BigDecimal;
public abstract class Principal extends Staff{
        private String level;
        private String sealedStamp;

        public Principal(String firstName, String lastName, int idNo, BigDecimal dateOfBirth, int age, String gender, String homeAddress, Long contactPhoneNumber, String emailAddress, String nextOfKin, int staffId, String staffQualification, String role, String level, String sealedStamp) {
                super(firstName, lastName, idNo, dateOfBirth, age, gender, homeAddress, contactPhoneNumber, emailAddress, nextOfKin, staffId, staffQualification, role);
                this.level = level;
                this.sealedStamp = sealedStamp;
        }

        public String getLevel() {
                return level;
        }

        public void setLevel(String level) {
                this.level = level;
        }

        public String getSealedStamp() {
                return sealedStamp;
        }

        public void setSealedStamp(String sealedStamp) {
                this.sealedStamp = sealedStamp;
        }

        @Override
        public String toString() {
                return "Principal{" +
                        "level='" + level + '\'' +
                        ", sealedStamp='" + sealedStamp + '\'' +
                        ", contactPhoneNumber=" + contactPhoneNumber +
                        ", emailAddress='" + emailAddress + '\'' +
                        ", nextOfKin='" + nextOfKin + '\'' +
                        '}';
        }
}
