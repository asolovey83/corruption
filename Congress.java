package Demo.Corruption;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by asolo on 5/29/2017.
 */
public class Congress implements Observable {

    List<Observer> spies;
    private String aquisition;
    private String methods;
    private String sources;

    public List<Observer> getSpies() {
        return spies;
    }

    public void setSpies(List<Observer> spies) {
        this.spies = spies;
    }

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
        spies = new ArrayList<Observer>();
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
        for (Observer observer : spies) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
            switch(randomNum) {
                case 1:
                    observer.updateState(aquisition, methods, sources);
                    break;
                case 2:
                    observer.updateState(null, null, null);
                    break;
                default:
                    observer.updateState(null, null, null);
                    break;
            }
        }
    }

    public void setData(String aquisition, String methods, String sources) {
        this.aquisition = aquisition;
        this.methods = methods;
        this.sources = sources;
        notifyObservers();
    }

}
