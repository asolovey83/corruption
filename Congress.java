package Demo.Corruption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by asolo on 5/29/2017.
 */
public class Congress implements Observable {

    List<Observer> spies;
    private String aquisition;
    private String methods;
    private String sources;


    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }

    public String getAquisition() {
        return aquisition;
    }

    public void setAquisition(String aquisition) {
        this.aquisition = aquisition;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public Congress()
    {
        spies = new LinkedList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        spies.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        spies.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : spies)
            observer.updateState(aquisition, methods, sources);
    }

    public void setData(String aquisition, String methods, String sources) {
        this.aquisition = aquisition;
        this.methods = methods;
        this.sources = sources;
        notifyObservers();
    }

}
