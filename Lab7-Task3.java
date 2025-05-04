import java.util.ArrayList;

public class LanguageList {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("Ruby");

        System.out.println("Programming Languages: " + languages);

        languages.set(2, "C#");
        System.out.println("After changing element at index 2: " + languages);

        languages.remove(languages.size() - 1);
        System.out.println("After removing the last element: " + languages);
    }
}
