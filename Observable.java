package Demo.Corruption;

/**
 * Created by asolo on 7/7/2017.
 */
public interface Observable {

        void registerObserver(Observer o);
        void removeObserver(Observer o);
        void notifyObservers();

}

