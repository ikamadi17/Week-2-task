package org.example.ServiceAndServiceImplementation;

public abstract class PrincipalServiceImpl implements PricipalService {
    public void admits() {
        System.out.println("admits Applicant");
    }
    public void expels(){
        System.out.println("expels Students");
    }
}
