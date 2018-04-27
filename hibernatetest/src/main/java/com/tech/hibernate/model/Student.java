package com.tech.hibernate.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author xxx_xx
 * @date 2018/4/28
 */

@Entity
@Table(name = "student")
public class Student {

    @GenericGenerator(name = "ge", strategy = "native")
    @Id
    @GeneratedValue(generator = "ge")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
