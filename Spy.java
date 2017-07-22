package Demo.Corruption;

import java.util.List;

/**
 * Created by asolo on 5/29/2017.
 */
public class Spy implements Observer, Observable {

    private Congress congress;
    private Observer comitee;
    private String aquisition;
    private String methods;
    private String sources;

    public String getAquisition() {
        return aquisition;
    }

    public void setAquisition(String aquisition) {
        this.aquisition = aquisition;
    }

    public String getMethods() {
        return methods;
    }

    public void setMethods(String methods) {
        this.methods = methods;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public Congress getCongress() {
        return congress;
    }

    public void setCongress(Congress congress) {
        this.congress = congress;
    }

    public Observer getComitee() {
        return comitee;
    }

    public void setComitee(Observer comitee) {
        this.comitee = comitee;
    }

    public Spy(Congress congress) {
        this.congress = congress;
        congress.registerObserver(this);
    }

    public void updateState(String aquisition, String methods, String sources) {
        this.setAquisition(aquisition);
        this.setMethods(methods);
        this.setSources(sources);
    }

    @Override
    public void registerObserver(Observer o) {
        comitee = o;
    }

    @Override
    public void removeObserver(Observer o) {
        comitee = null;
    }

    @Override
    public void notifyObservers() {
        comitee.updateState(this.congress.getAquisition(), this.congress.getMethods(), this.congress.getSources());
    }

}


