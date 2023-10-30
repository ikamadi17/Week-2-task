package org.example.SchoolServiceImplementation;

import org.example.SchoolService.PricipalService;
import org.example.entities.Applicant;
import org.example.entities.Principal;
import org.example.entities.Student;

import javax.management.relation.Role;

public abstract class PrincipalServiceImpl implements PricipalService {
    public void admitsApplicant(Principal principal, Applicant applicant) {
        if (applicant.getAge() >= 13 && applicant.getAge() <= 18) {
            System.out.println("Student admitted: " + applicant.getLastName());
        }
    }

}