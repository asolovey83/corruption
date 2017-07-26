package Demo.Corruption;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by asolo on 5/29/2017.
 */
public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter the number of spies you would like to delegate");
        int spyNum = in.nextInt();

        Congress congress = new Congress();
        Comitee comitee = new Comitee(congress, spyNum);
        congress.setData("Activisation", "Methods", "Sources");
        congress.notifyObservers();
        comitee.updateState();
        System.out.println();

        if (comitee.getSpies().size() < 1)
        {
            System.out.println("Unfortunately no spies returned from congress");
        } else {
            System.out.println("Unfortunately only " + comitee.getSpies().size() + " spies weren`t revealed. Please, see the data from them:");
            System.out.println();
            comitee.display();
        }


    }
}
