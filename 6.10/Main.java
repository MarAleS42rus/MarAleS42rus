package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Cpu processor = new Cpu(1.0,2,CpuBrand.INTEL, 20.5);
        Ram memory = new Ram(1024,"ddr3",10.5);
        Storage diskType =new Storage("HDD", 500,1000.0);
        Display display = new Display(23.6,"IPS",4800);
        Keyboard keyboard = new Keyboard("Проводная, мембранная",false,250);

        Computer comp1 = new Computer("Acer",
                                      "Aspire",
                                        processor,
                                        memory,
                                        diskType,
                                        keyboard,
                                        display);
        System.out.println(comp1);
        System.out.println("Общая масса компьютера = " + comp1.getTotalWeight() + " кг.");

        Computer comp2 = new Computer("HP", "Pavilion");
        comp2.setProcessor(new Cpu(2.2,4,CpuBrand.AMD,22.1));
        comp2.setMemory(new Ram(2048,"dd3",11));
        comp2.setDiskType(new Storage("SSD",128,60));
        comp2.setDisplay(new Display(19,"IPS",3500));
        comp2.setKeyboard(new Keyboard("Проводая, механическая",true,320));


        System.out.println("Производитель: " + comp2.vendor +"\n"+
                            "Название: " + comp2.name +"\n"+
                            "Процессор: " + comp2.getProcessor() +"\n"+
                            "Оперативная память: " + comp2.getMemory() +"\n"+
                            "Накопитель информации: " + comp2.getDiskType() +"\n"+
                            "Экран: " + comp2.getDisplay() +"\n"+
                            "Клавиатура: " + comp2.getKeyboard());
        System.out.println("Общая масса компьютера = " + comp2.getTotalWeight() + " кг.");




    }
}
