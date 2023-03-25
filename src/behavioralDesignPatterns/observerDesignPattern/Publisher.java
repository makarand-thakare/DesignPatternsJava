package behavioralDesignPatterns.observerDesignPattern;

import java.util.ArrayList;

public class Publisher {
    ArrayList<Subscriber> subscribedChannelList = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribedChannelList.add(subscriber);
        System.out.println(subscriber.getName() + " has just subscribed.");
    }

    public void publishNewVideo(String videoTitle) {
        System.out.println("\nPublished new video.");
        updateAllSubscribers(videoTitle);
    }

    // Send notifications and update all users
    private void updateAllSubscribers(String videoTitle) {
        System.out.println("Sending notifications");
        for (Subscriber subscriber : subscribedChannelList) {
            subscriber.receiveUpdate(videoTitle);
        }
    }
}
