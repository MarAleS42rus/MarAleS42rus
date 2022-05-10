package ru.skillbox;

public class Computer {
    final String vendor, name;
    private Cpu processor;
    private Ram memory;
    private Storage diskType;
    private Keyboard keyboard;
    private Display display;
    double totalWeight;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Computer(String vendor,
                    String name,
                    Cpu processor,
                    Ram memory,
                    Storage diskType,
                    Keyboard keyboard,
                    Display display) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.memory = memory;
        this.diskType = diskType;
        this.keyboard = keyboard;
        this.display = display;
    }

    public Cpu getProcessor() {
        return processor;
    }

    public void setProcessor(Cpu processor) {
        this.processor = processor;
    }

    public Ram getMemory() {
        return memory;
    }

    public void setMemory(Ram memory) {
        this.memory = memory;
    }

    public Storage getDiskType() {
        return diskType;
    }

    public void setDiskType(Storage diskType) {
        this.diskType = diskType;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public double getTotalWeight() {
        totalWeight = processor.weight + memory.weight + diskType.weight + keyboard.weight + display.weight;
        return totalWeight;
    }
    
    public String toString() {
        return "Computer " + "\n" +
                "vendor: " + vendor + "\n" +
                " name: " + name + "\n" +
                " processor: " + processor + "\n" +
                " memory: " + memory + "\n" +
                " diskType: " + diskType + "\n" +
                " keyboard: " + keyboard + "\n" +
                " display: " + display;
    }

}
