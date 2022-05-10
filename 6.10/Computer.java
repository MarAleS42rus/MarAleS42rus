package ru.skillbox;

public class Computer {
    final String vendor, name;
    private Cpu processor;
    private Ram memory;
    private Storage diskType;
    private Keyboard keyboard;
    private Display display;

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

    public void showParametersComputer() {

    }
}
