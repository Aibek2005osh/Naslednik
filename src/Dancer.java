public class Dancer extends Person{
    private String groupName;

    public Dancer(){

    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    @Override
    public String toString() {
        return  " "  + super.personmetod() +   " group  name : " +groupName +"\n"+ perlearn() + " \n" + perWalk() + "\n" + perEat() + getName() + "dansering";

    }
}
