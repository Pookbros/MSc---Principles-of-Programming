public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private char separator = ':';

    public ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
    }

    public void tick(){
        minutes.tick();
        if (minutes.getValue() == 0){
            hours.tick();
        }
    }

    public String getTimeDisplay(){
        return hours.getDisplayValue()
        + separator
        + minutes.getDisplayValue();
    }
}
