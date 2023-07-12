package hw_5;
import java.util.*;

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Кот " +
                "имя='" + name + '\'' +
                ", возраст=" + age +
                ' ';
    }
}

public class app {

        public static void main(String[] args) {
            Cat cat1 = new Cat("Рыжик", 3);
            Cat cat2 = new Cat("Пыжик", 2);
            Cat cat3 = new Cat("Рыжик", 3); 
            Cat cat4 = new Cat("Васька", 2);
            Cat cat5 = new Cat("Пыжик", 2);
    
            Cat[] catsArray = new Cat[]{cat1, cat2, cat3, cat4, cat5};
    
            Set<Cat> uniqueCatsSet = new LinkedHashSet<>();
            Set<Cat> duplicateCatsSet = new LinkedHashSet<>();
    
            for (Cat cat : catsArray) {
                if (!uniqueCatsSet.add(cat)) {
                    duplicateCatsSet.add(cat);
                }
            }
    
            System.out.println("Количество дубликатов: " + duplicateCatsSet.size());
            System.out.println("Дубликаты: " + duplicateCatsSet);
    
            System.out.println("Уникальные коты: " + uniqueCatsSet);
        }
    }
    
