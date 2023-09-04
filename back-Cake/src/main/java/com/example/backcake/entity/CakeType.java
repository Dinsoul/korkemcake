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
@Table(name = "caketypes")
public class CakeType implements Serializable {
    @Id
    @Column(name = "cake_name", nullable = false)
    private String cakeName;
}
