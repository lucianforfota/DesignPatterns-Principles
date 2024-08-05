package observer.youtubeexample;

public interface Observable {

    void addObserver(Observer observer);

    void removeObserver (Observer observer);

    void notifyObservers();
}
