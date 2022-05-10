package ru.skillbox;

public class Cpu {
    final double frequency;
    final int cores;
    final String brand;
    final double weight;

    public Cpu(double frequency, int cores, String brand, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.brand = brand;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
