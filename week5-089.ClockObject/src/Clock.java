public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(23);
        hours.setValue(hoursAtBeginning);
        
        this.minutes = new BoundedCounter(59);
        minutes.setValue(minutesAtBeginning);
        
        this.seconds = new BoundedCounter(59);
        seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        if(seconds.getValue() == 59) {
            seconds.next();
            if(minutes.getValue() == 59) {
                minutes.next();
                hours.next();
            } else 
                minutes.next();             
        } else 
            seconds.next();
    }
    
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
