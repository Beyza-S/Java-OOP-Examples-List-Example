package Immutable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class degistirilebiliricevirme {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    public degistirilebiliricevirme(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies); // Derin kopya
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies); // Değiştirilemez liste döndür
    }
}
