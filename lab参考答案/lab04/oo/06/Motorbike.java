public class Motorbike extends Vehicle{
        private Person driver;
        private Person passenger;
        Motorbike(){
                super();
                driver = new Person();
                passenger = new Person();
        }
        Motorbike(Tyre tyre,Engine engine,String name,Person driver,Person passenger){
                super(tyre,engine,name,2);
                this.driver = driver;
                this.passenger = passenger;
        }
        public String toString(){
                return "Motorbike "+super.toString()+"\n\t"+"Driver:\t"+driver.getName()+"\tPassenger:\t"+passenger.getName();
        }

        public Person getDriver() {
                return driver;
        }

        public Person getPassenger() {
                return passenger;
        }

        public void setDriver(Person driver) {
                this.driver = driver;
        }

        public void setPassenger(Person passenger) {
                this.passenger = passenger;
        }
}
