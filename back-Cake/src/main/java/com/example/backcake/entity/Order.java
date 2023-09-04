package com.example.backcake.entity;
import com.example.backcake.entity.Client;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client")
    private Client client;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cake_type")
    private CakeType cakeType;
    @Column(name = "weight", nullable = false)
    private Float weight;
    @Column(name = "date", columnDefinition = "DATE")
    private Date date;
}


