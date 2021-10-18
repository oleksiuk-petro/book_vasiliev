/*
    Для цілого додатнього числа зробити відображення бінарного коду.
 */

package UsingDoWhileApplication;

import javax.swing.*;

public class UsingDoWhileDemo {

    static String coder(int number) {
        String s = ""; //текстова змінна для двійкового коду
        int n = number; //десяткове число

        //цикл робить кодування в двійковий код
        do {
            System.out.println(s);
            s = (n % 2) + s; //додавання до рядка зліва
            n /= 2; //зменшення десяткового числа в два рази
        } while (n != 0);

        return s;
    }

    public static void main(String[] args) {
        String input;
        String title = "Розрахунок бінарного коду";

        //діалогове вікно
        input = JOptionPane.showInputDialog(null,
                "Уведіть ціле число",
                title,
                JOptionPane.QUESTION_MESSAGE
        );

        if (input == null) {
            System.exit(0);
        }

        int num = Integer.parseInt(input);

        String code = coder(num);

        String text = "Ви ввели число: " + num;
        text += "\nБінарний код числа: " + code;

        //діалогове вікно відображає результат роботи програми
        JOptionPane.showMessageDialog(null,
                text,
                title,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
