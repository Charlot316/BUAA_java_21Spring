public class NumberRangeException extends Exception{

    private String Reason;
    public NumberRangeException(int num){
        this.Reason=num+" is out of the range between -10 and 10";
    }

    public String getReason() {
        return Reason;
    }
}
