package kz.attractor.java;

import java.util.Comparator;

public class Main_first {

    public static void main(String[] args) throws InterruptedException {

        var cats = Cat.makeCats(10);
        Printer.print(cats);
        Utils.print("What do you want to do?\n\t1 - Sort the list by cat breed\n\t2 - Sort the list by name and age" +
                "\n\t3 - Sort the list by name" +
                "\n\t4 - Sort the list list by age" +
                "\n\t5 - Remove the cats of a given color" +
                "\n\t6 - Remove cats with name length 5\n\t");
        int num = Utils.getNumber(6,1);
        switch (num){
            case 1:
                cats.sort(Comparator.comparing(Cat::getBreed));
                Printer.print(cats);
                break;
            case 2:
                cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));
                Printer.print(cats);
                break;
            case 3:
                cats.sort(Comparator.comparing(Cat::getName));
                Printer.print(cats);
                break;
            case 4:
                cats.sort(Comparator.comparing(Cat::getAge));
                Printer.print(cats);
                break;
            case 5:
                Utils.print("Doo you want to see list of cats?\n\tEnter answer:");
                String str = Utils.getLine();

                if(str.equalsIgnoreCase("Y"))
                    Printer.print(cats);

                Utils.print("Colors:\n");
                Cat.showCatColor();
                int colorNumber = Utils.getNumber(Cat.Color.values().length, 0);
                String color = Utils.getLine();
                cats.removeIf(c -> c.getColor().equals(Cat.Color.values()[colorNumber - 1]));
                Printer.print(cats);
                break;
            case 6:
                System.out.print("Removing.");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".\n");
                Thread.sleep(1000);
                cats.removeIf(c -> c.getName().length() == 5);
                Printer.print(cats);
                break;
            default:
                System.out.println("Very strange...");
                break;
        }
    }


}
