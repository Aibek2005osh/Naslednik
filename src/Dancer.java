public class Dancer extends Person{
    private String groupName;

    public Dancer(){

    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;


    }
    public  String dancermot (){
        return (getName()+ " byilei alat🕺🏻💃🏻");
    }
    @Override
    public String toString() {
        return  " "  + super.personmetod() +   " GroupName : " +groupName +"\n"+ perlearn() + " \n" + perWalk() + "\n" + perEat() +"\n"+dancermot();

    }
}
