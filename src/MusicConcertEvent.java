
public class MusicConcertEvent extends Event {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                             double eventCost, int totalParticipants, int totalEventDays,
                             boolean merchandiseRequired, double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    @Override
    public double calculateEventCost() {
        double totalCost = calculateEventCost();

        if (merchandiseRequired) {
            totalCost += merchandiseCost;
        }

        return totalCost;
    }

    @Override
    public String toString() {
        String details = super.toString();
        details += "\nMusic Concert Event Details: \n" +
                   "Merchandise Required: " + merchandiseRequired + "\n" +
                   "Merchandise Cost: $" + merchandiseCost;
        return details;
    }

}
