package com.example.helloworld;

import lombok.*;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NameModel {
    private Integer id;
    private String firstName;
    private String lastName;
    public String fullName(String firstName, String lastName){
        return firstName.concat(lastName);
    }
}
