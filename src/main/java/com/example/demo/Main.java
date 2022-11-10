package com.example.demo;

import com.example.demo.flower.Flower;
import com.example.demo.flower.FlowerDiscount;

public class Main {
    public static void main(String[] args) {
        Item flower = new Flower(1, 54, "blue", 100);
        System.out.println(flower.getPrice());
        flower = new FlowerDiscount(flower);
        System.out.println(flower.getPrice());
    }
}
