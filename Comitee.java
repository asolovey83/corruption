package Demo.Corruption;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asolo on 5/29/2017.
 */
public class Comitee implements Observer {

    private List<Spy> spies;
    public Congress congress;
    int spyNumber;

    public List<Spy> getSpies() {
        return spies;
    }

    public Comitee (Congress congress, int spyNumber)
    {
        this.congress = congress;
        this.spyNumber = spyNumber;
        spies = new ArrayList<>();

        for (int i = 0; i < spyNumber; i++) {
            Spy spy = new Spy(congress);
            spy.registerObserver(this);
            congress.getSpies().add(spy);
        }
    }


    /**
     * This is a crutch because I had to implement Observer here, but couldn`t pass any reasonable paramethers when calling the method.
     * @param aquisition
     * @param methods
     * @param sources
     */
    public void updateState(String aquisition, String methods, String sources)
    {
        this.updateState();
    }


    public void updateState() {
        int i = 0;
        while (i < congress.getSpies().size()) {
            spies.add((Spy) congress.getSpies().get(i));
            i++;
        }
    }

    public void display() {
        int i = 0;
        while (i < spies.size()) {

            System.out.println("Данные про привлечение новых членов: " + spies.get(i).getAquisition());
            System.out.println("Данные про методы отмывания денег: " + spies.get(i).getMethods());
            System.out.println("Данные про источники взяток: " + spies.get(i).getSources());
            System.out.println();
            i++;
        }
    }

}
