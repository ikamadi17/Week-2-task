package org.example.entities;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {
    @Test
    void validityApplicant() {
        Applicant applicant = new Applicant();
        applicant.setName();
        var Applicant= new Applicant();
        assertTrue(applicant.age(14));
    }
}