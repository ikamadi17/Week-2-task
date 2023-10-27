package org.example.ServiceAndServiceImplementation;

import org.example.entities.Applicant;
import org.example.entities.Principal;
import org.example.entities.Student;

public interface PricipalService {




    void admit (Principal principal, Applicant applicant);
    void expel(Principal principal, Student student);

    //if (Student.)
    public static void main(String[] args) {
        System.out.println("Pricipal can expel Student");
    }
}

