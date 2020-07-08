package com.designpatterns.filterpattern;

public class Person {

    //Attributes
    private String name; 
    private String gender; 
    private String maritalStatus; 
    
    //Parameterized Contructor
    public Person(String name,String gender,String maritalStatus){ 
        this.name = name; 
        this.gender = gender; 
        this.maritalStatus = maritalStatus; 
    } 
    
    //Getter And Setter's
    public String getName() { 
        return name; 
    } 
    public String getGender() { 
        return gender; 
    } 
    public String getMaritalStatus() { 
        return maritalStatus; 
    }
    
}
