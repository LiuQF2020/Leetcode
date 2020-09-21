package Test;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        List<Number> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();


        name.add("icon");
        age.add(18);
        number.add(314);

        getUperNumber(age);
        getUperNumber(number);
    }

    public static void getUperNumber(List<? extends Number> data) {
        System.out.println("data:" + data.get(0));
    }
}
