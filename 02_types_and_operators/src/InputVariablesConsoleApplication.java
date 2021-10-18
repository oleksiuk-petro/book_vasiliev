import java.util.Scanner;

public class InputVariablesConsoleApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int now = 2021;
        String name;
        int age;
        double height;
        double mas;

        System.out.print("Ваше ім’я: ");
        name = input.nextLine();

        System.out.print("Ваш вік: ");
        age = input.nextInt();

        System.out.print("Ваш зріст в метрах: ");
        height = input.nextDouble();

        System.out.print("Маса тіла (в кілограмах): ");
        mas = input.nextDouble();

        double bmi = mas / height / height;

        System.out.println("Вас звати " + name + "!");
        System.out.println("Ви народились в " + (now - age) + " році.");
        System.out.printf("Ваш індекс маси тіла: %5.2f\n", bmi);
    }
}
