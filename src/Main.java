//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("aibek", "doctor ");
        Dancer dancer = new Dancer("ernist", "dancer", "BTS");
        Singer singer = new Singer("Amir" , "sinner","biz tobu");

        Programmer programmer = new Programmer("Baiel", "programist", " peaksoft ");
        Person[] name = new Person[]{person, programmer,dancer,singer};
        for (Person p : name) {
            System.out.println(p.toString());
        }
    }
}
