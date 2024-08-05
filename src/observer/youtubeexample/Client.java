package observer.youtubeexample;

public class Client {

    public static void main(String[] args) {


        YoutubeChannel youtubeChannel = new YoutubeChannel();

        YoutubeSubscriber youtubeSubscriber1 = new YoutubeSubscriber("Costel");
        YoutubeSubscriber youtubeSubscriber2 = new YoutubeSubscriber("Sorina");
        YoutubeSubscriber youtubeSubscriber3 = new YoutubeSubscriber("Alina");

        youtubeChannel.addObserver(youtubeSubscriber1);
        youtubeChannel.addObserver(youtubeSubscriber2);
        youtubeChannel.addObserver(youtubeSubscriber3);

        youtubeChannel.notifyObservers();


    }
}
