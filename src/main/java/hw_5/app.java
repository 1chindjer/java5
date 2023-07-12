package hw_5;
import java.util.*;


public class app {
    private final Map<String, List<String>> directory;

    public app() {
        this.directory = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (directory.containsKey(lastName)) {
            List<String> phones = directory.get(lastName);
            if (!phones.contains(phoneNumber)) {
                phones.add(phoneNumber);
            }
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            directory.put(lastName, phones);
        }
    }

    public List<String> get(String lastName) {
        return directory.get(lastName);
    }

    public static void main(String[] args) {
        app app = new app();
        app.add("Петров", "123335456789");
        app.add("Иванов", "98763254321");
        app.add("Петров", "121224");

        System.out.println("Петров номер: " + app.get("Петров"));
        System.out.println("Иванов номер: " + app.get("Иванов"));
    }
}
