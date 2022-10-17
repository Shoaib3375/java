package com.example.helloworld.ObjectAndClass;

public class EnumSwitch {
    Day day;
    public void Display(Day day){
        switch (day){
            case SATURDAY:
                System.out.println("it's saturday");
                break;
            case FRIDAY:
                System.out.println("it's Friday");
                break;
            default:
                System.out.println("weekday");
                break;
        }
    }

    public static void main(String[] args) {
        EnumSwitch enumSwitch = new EnumSwitch();
        Day day =Day.SATURDAY;
        enumSwitch.Display(day);
    }

}

