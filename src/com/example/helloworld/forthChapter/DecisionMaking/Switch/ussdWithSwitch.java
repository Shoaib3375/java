package com.example.helloworld.forthChapter.DecisionMaking.Switch;

import java.util.Scanner;

public class ussdWithSwitch {
    public static void main(String[] args) {
        System.out.println("""
                0. Download MyGp
                1. Balance, Call Rate & FnF
                2. Gp STAR
                3. Internet Pack
                4. Talk Time / Minutes Pack
                5. My offers
                6. Welcome Tune
                """);
        System.out.println("Select an option From (0 to 6) : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        switch (number){
            case 0:
                System.out.println("Downloading My Gp");
                break;
            case 1:
                System.out.println("You don't have sufficient balance, " + "Recharge now");
                break;
            case 2:
                System.out.println("Your sounding privileged!");
                break;
            case 3:
                System.out.println("1 GB at tk 38");
                System.out.println("2 GB at tk 52");
                break;
            case 4:
                System.out.println("you have 100 minute free talktime " + "Use them");
                break;
            case 5:
                System.out.println("you don't have any offer" + "Migrage to another provider!");
                break;
            case 6:
                System.out.println("We are out of service at this moment");
                break;
            default:
                System.out.println(" Your pressed wrong code");
                break;
        }
    }
}
