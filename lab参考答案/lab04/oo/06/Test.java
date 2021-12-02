public class Test {
    public static void main(String args[]){
        Tyre tyre = new Tyre("2.50-21",683);
        Engine engine = new Engine("WS-15",17683);
        Person brother = new Person("JOKER");
        Person sister = new Person("Navi");
        Motorbike mb = new Motorbike(tyre,engine,"MyMotorbike",brother,sister);
        System.out.println(mb.toString());
        sister.say("不像我，我只会⼼疼geigei~");
    }
}
