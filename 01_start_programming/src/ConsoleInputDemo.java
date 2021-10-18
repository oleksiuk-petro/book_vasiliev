import java.util.Scanner;

public class ConsoleInputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String day;
        System.out.print("Який сьогодні день? ");
        day = input.nextLine();

        String month;
        System.out.print("Який сьогодні місяць? ");
        month = input.nextLine();

        String text;
        text = "Сьогодні " + day + ", місяць - " + month;
        System.out.println(text);
    }
}
