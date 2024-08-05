package observer.youtubeexample;

public class YoutubeSubscriber implements Observer{

    private String name;

    public YoutubeSubscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Hey" + this.name + ", there is a new video on channel");
    }
}
