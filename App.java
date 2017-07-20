package Demo.Corruption;

import java.util.ArrayList;

/**
 * Created by asolo on 5/29/2017.
 */
public class App {

    public static void main(String[] args) {

        Congress congress = new Congress();
        congress.setData("Аквизиция", "Методы", "Источники");
        Spy spy = new Spy(congress);
        spy.updateState(congress.getAquisition(), congress.getMethods(), congress.getSources());
        Comitee comitee = new Comitee(spy);
        comitee.updateState(spy.getCongress().getAquisition(), spy.getCongress().getMethods(), spy.getCongress().getSources());

    }
}
