package main.java.homework18;

public class task2 {
    public  static void main(String[] args) {
    double boatHeightCm , boatHeightM, parrotHeight, monkeyHeight, elephantHeight, totalHeight;
    boatHeightCm = 380;
    boatHeightM = boatHeightCm/100;
    parrotHeight = boatHeightM/38;
    monkeyHeight = boatHeightM/5;
    elephantHeight = boatHeightM/2;
    totalHeight = boatHeightM+parrotHeight+monkeyHeight+elephantHeight;
    System.out.println("рост удавчика:" + boatHeightM + "м");
    System.out.println("рост попугайчика:"+ parrotHeight + "м");
    System.out.println("рост обезьянки:" + monkeyHeight + "м");
    System.out.println("рост слоника:" + elephantHeight + "м");
    System.out.println("рост всех вместе:" + totalHeight + "м");
    }
}
