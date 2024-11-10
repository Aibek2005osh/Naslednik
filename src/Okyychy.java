import java.time.LocalDate;

public class Okyychy {
    private String name;
    private String sourName;
    private LocalDate age;

    public Okyychy() {


    }

    public Okyychy(String sourName, LocalDate age, String name) {
        this.sourName = sourName;
        this.age = age;
        this.name = name;
    }
}
