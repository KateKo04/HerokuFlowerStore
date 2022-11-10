package com.example.demo.flower;

import com.example.demo.Item;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@ToString
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Flower extends Item {

    @Id @GeneratedValue
    private int id;

    private double sepalLength;
    private String color;
    private double price;

}

