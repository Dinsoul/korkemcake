package com.example.backcake.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "clients")
public class Client implements Serializable {
    @Id
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "tel_number", nullable = false)
    private String TelNumber;
}

