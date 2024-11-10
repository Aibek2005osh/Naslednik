//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adam Ata : ", " dyikan  ");
        Programmer programmer = new Programmer("Baiel : ", "programist : ", " peaksoft ");
        Dancer dancer = new Dancer("ernist : ", "Dancer", "BTS");
        Singer singer = new Singer("Amir : " , "Singer: ","Кыз бурак ");

        Person[] name = new Person[]{person, programmer,dancer,singer};
        for (Person p : name) {
            System.out.println(p.toString());
        }
    }
}
