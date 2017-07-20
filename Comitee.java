package Demo.Corruption;

import java.util.ArrayList;

/**
 * Created by asolo on 5/29/2017.
 */
public class Comitee implements Observer {

    private Spy spy;

    public Spy getSpy() {
        return spy;
    }

    public void setSpy(Spy spy) {
        this.spy = spy;
    }

    public Comitee(Spy spy)
    {
        this.spy = spy;
        spy.registerObserver(this);
    }

    @Override
    public void updateState(String aquisition, String methods, String sources)
    {
        this.getSpy().getCongress().setAquisition(aquisition);
        this.getSpy().getCongress().setMethods(methods);
        this.getSpy().getCongress().setSources(sources);
        this.display();
    }

    public void display()
    {
        System.out.println("Данные про привлечение новых членов: " + this.getSpy().getCongress().getAquisition());
        System.out.println("Данные про методы отмывания денег: " + this.getSpy().getCongress().getMethods());
        System.out.println("Данные про источники взяток: " + this.getSpy().getCongress().getSources());

    }
}
