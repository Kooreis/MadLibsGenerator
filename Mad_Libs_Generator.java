```java
import java.util.Scanner;

public class MadLibsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.println("Enter a place: ");
        String place = scanner.nextLine();

        System.out.println("Enter a number: ");
        String number = scanner.nextLine();

        System.out.println("Enter a color: ");
        String color = scanner.nextLine();

        System.out.println("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.println("Enter a food: ");
        String food = scanner.nextLine();

        System.out.println("Enter a profession: ");
        String profession = scanner.nextLine();

        System.out.println("Here is your Mad Libs story: ");
        System.out.println(name + " was a " + profession + " who lived in " + place + ". One day, " + name +
                " was " + verb + " when a " + color + " " + animal + " appeared. The " + animal +
                " was carrying a " + adjective + " " + noun + ". " + name + " decided to make a " + food +
                " out of the " + noun + ". After " + number + " hours, the " + food + " was ready. And they all lived happily ever after!");
    }
}
```