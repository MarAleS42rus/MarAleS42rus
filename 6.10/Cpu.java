package ru.skillbox;

public class Cpu {
    final double frequency;
    final int cores;
    final CpuBrand brand;
    final double weight;

    public Cpu(double frequency, int cores, CpuBrand brand, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.brand = brand;
        this.weight = weight;
    }

    public String toString() {
        return "Cpu {" +
                " frequency = " + frequency + " MHz " +
                ", cores = " + cores +
                ", brand = '" + brand + '\'' +
                ", weight = " + weight + " g" +
                '}';
    }
}
