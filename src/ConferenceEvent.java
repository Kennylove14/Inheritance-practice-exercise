public class ConferenceEvent extends Event{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    

    public double getBreakfastCost(){
        return breakfastCost;
    }

    public void setBreakfastCost(double breakfastCost) {
        this.breakfastCost = breakfastCost;
    }

    public double getLunchCost() {
        return lunchCost;
    }

    public void setLunchCost(double lunchCost) {
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost() {
        return dinnerCost;
    }

    public void setDinnerCost(double dinnerCost) {
        this.dinnerCost = dinnerCost;
    }
    

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String pointOfContact, 
    double eventCost,int totalEventDays, int totalParticipants, boolean breakfastRequired,double breakfastCost,boolean lunchRequired, double lunchCost,boolean dinnerRequired, double dinnerCost){
        super(eventID, eventName, eventLocation,pointOfContact, eventCost,totalParticipants,totalEventDays);
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
    }
    
    @Override
    public void calculateEventCost(){
        conferenceEventCost = getEventCost() + ((getBreakfastCost() + getLunchCost() + getDinnerCost() * getTotalParticipants()*getTotalEventDays()));
    }



    @Override
    public String toString(){
        String details = super.toString();
        details += "\nConference Event Details: \n" +
                   "Breakfast Required: " + breakfastRequired + "\n" +
                   "Breakfast Cost: " + breakfastCost + "\n" +
                   "Lunch Required: " + lunchRequired + "\n" +
                   "Lunch Cost: " + lunchCost + "\n" +
                   "Dinner Required: " + dinnerRequired + "\n" +
                   "Dinner Cost: " + dinnerCost;
        return details; 
    }
}
