public class NotTriangleException extends Exception{
    private String Reason;
    public NotTriangleException(Triangle temp){
        this.Reason=temp.getX()+" and "+temp.getY()+" and "+temp.getZ()+" can not form a triangle";
    }

    public String getReason() {
        return Reason;
    }
}
