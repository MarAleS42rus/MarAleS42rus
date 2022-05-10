package ru.skillbox;

public class Storage {
    final String type;
    final int memorySize;
    final double weight;

    public Storage(String type, int memorySize, double weight) {
        this.type = type;
        this.memorySize = memorySize;
        this.weight = weight;
    }

    public String toString() {
        return "Storage {" +
                " type = " + type + '\'' +
                ", memorySize = " + memorySize + " GB" +
                ", weight = " + weight + " g" +
                '}';
    }
}
