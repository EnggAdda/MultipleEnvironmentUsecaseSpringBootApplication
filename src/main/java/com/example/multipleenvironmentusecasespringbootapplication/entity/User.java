package com.example.multipleenvironmentusecasespringbootapplication.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name  =  "multipleProfile")
@Entity
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id ;
    private String name ;
    private String address ;
}
