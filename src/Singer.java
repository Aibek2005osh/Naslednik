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
    public String singermot(){
        return getName() +" ырдай алат🗣🎶";


    }
    public String singermer2(){
        return getName() + " Гитара черте алат👨‍🎤🎸";
    }
    @Override
    public String toString() {
        return  " "  + super.personmetod() +   " BandName : " +bandName +"\n"+ perlearn() + " \n" + perWalk() + "\n" + perEat() + "\n"+singermot() +"\n"+singermer2();

    }
}
