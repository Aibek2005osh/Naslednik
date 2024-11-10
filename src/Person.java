public class Person {
    private String name;
    private String designation;


    public Person() {

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String perlearn() {
        return name + " bilim alat  ";

    }

    public String perWalk() {
        return (name + " basa alat ");

    }

    public String perEat() {
        return (name + " tamaktanat ");
    }

    public String personmetod() {
        return "name : " + name + " designation : " + designation;
    }


    public String toString() {
        return  personmetod() +"\n"+ perlearn() + " \n" + perWalk() + "\n" + perEat();
    }
}
