package ru.skillbox;

public class Display {
    final double diagonal;
    final String type;
    final double weight;

    public Display(double diagonal, String type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public String toString() {
        return "Display { " +
                "diagonal = " + diagonal + " inches" +
                ", type = " + type + '\'' +
                ", weight = " + weight + " g" +
                '}';
    }
}
