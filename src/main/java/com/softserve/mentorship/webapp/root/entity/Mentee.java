package com.softserve.mentorship.webapp.root.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Mentee")
@Data
public class Mentee implements Serializable {

    @Id
    @GeneratedValue(
            generator = "sequence",
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "sequence",
            allocationSize = 10
    )
    @Column(unique = true, nullable = false)
    private Long id;

    @Column
    private String name;
}
