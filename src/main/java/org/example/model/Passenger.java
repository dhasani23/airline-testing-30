package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passenger {

    private int passengerId;
    private boolean adult;
    private String gender;
    private String firstName;
    private String lastName;



    //Create a tostring method to convert the object to string
    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", adult=" + adult +
                ", gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    //Create a toJson method to convert the object to Json String
    public String toJson() {
        return "{" +
                "\"passengerId\":" + passengerId +
                ", \"adult\":" + adult +
                ", \"gender\":\"" + gender + '\"' +
                ", \"firstName\":\"" + firstName + '\"' +
                ", \"lastName\":\"" + lastName + '\"' +
                '}';
    }
}

