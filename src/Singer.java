public class Singer extends Person {
    private String bandName;

    public Singer(){

    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    @Override
    public String toString() {
        return  " "  + super.personmetod() +   " band name : " +bandName +"\n"+ perlearn() + " \n" + perWalk() + "\n" + perEat() + getName()+"gutariing";

    }
}
