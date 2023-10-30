package org.example.ServiceAndServiceImplementation;

import org.example.entities.*;

public interface SchoolServices {
    void admit (Principal principal, Applicant applicant);
    void expel(Principal principal, Student student);
    void teach (Teacher teacher, Student student);
    void counsel(NonAcademicStaff nonAcademicStaff, Student student);


}
