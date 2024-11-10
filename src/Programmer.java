public class Programmer extends Person {
    private String companyName;

    public Programmer() {

    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String prog() {
        return  super.getName() + " kod jaza alat";
    }

    @Override
    public String toString() {
        return  " "  + super.personmetod() +   " compapyName : " +companyName +"\n"+ perlearn() + " \n" + perWalk() + "\n" + perEat() + prog();

    }
}
