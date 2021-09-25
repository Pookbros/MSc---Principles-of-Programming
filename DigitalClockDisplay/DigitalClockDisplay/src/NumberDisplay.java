public class NumberDisplay {
    private int value = 0;
    private int limit;

    public NumberDisplay(int limit){
        this.limit = limit;        
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        if (value >= 0 && value < limit){
            this.value = value;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void tick() {
        value = (value + 1) % limit;
    }

    public String getDisplayValue() {
        if (value < 10) {
            return "0" + value;
        }
        else {
            return "" + value;
        }
    }
}
