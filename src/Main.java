

public class Main {
    public static void main(String[] args) {
        ConferenceEvent conferenceEvent = new ConferenceEvent("001", "AI Conference", "Paris", "Peng", 50, 2, 25, 40, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);
        ConferenceEvent conference = new ConferenceEvent("C001", "Tech Conference", "Convention Center", "Jane Smith",
                 200, 3,  500.0,  800.0,  1000.0);
        System.out.println(conference);



        MusicConcertEvent concert = new MusicConcertEvent("M001", "Rock Concert", "Stadium", "Mike Johnson",
                10000.0, 500, 1, true, 1500.0);
        System.out.println(concert);
    }
}
