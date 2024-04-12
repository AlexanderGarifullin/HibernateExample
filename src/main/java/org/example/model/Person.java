package org.example.model;


import lombok.*;

import javax.persistence.*;

@ToString
@Entity
@Table(name="Person")
@Getter
@Setter
@NoArgsConstructor
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }


}
