package ru.skillbox;

public class Ram {
    final int size;
    final String type;
    final double weight;

    public Ram(int size, String type, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public String toString() {
        return "Ram {" +
                " size = " + size + " Mb" +
                ", type = " + type + '\'' +
                ", weight = " + weight + " g" +
                '}';
    }
}
