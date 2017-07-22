package Demo.Corruption;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by asolo on 5/29/2017.
 */
public class App {

    public static void main(String[] args) {

        Congress congress = new Congress();
        Spy spy = new Spy(congress);
        Comitee comitee = new Comitee(congress, 10);
        congress.setData("Аквизиция", "Методы", "Источники");
        congress.notifyObservers();
        comitee.updateState(null, null, null);
        comitee.display();


    }
}
