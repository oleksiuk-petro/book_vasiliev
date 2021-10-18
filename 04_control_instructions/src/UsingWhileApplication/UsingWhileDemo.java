/*
    Бінарний код числа вводиться користувачем у поле вводу діалогового
    вікна, яке з’являється після запуску виконання програми на виконання.
    Після вводу коду числа з’являється друге діалогове вікно з
    повідомленням, в якому вказано вихідний код і число, якому цей код відповідає.
 */

package UsingWhileApplication;

import javax.swing.JOptionPane;

public class UsingWhileDemo {

    //метод конвертує двійковий код в десятковий
    static int decoder(String code) {
        int n = code.length();
        int s = 0;
        int k = 1;
        int q = 1;
        int a;

        while (k <= n) {
            if (code.charAt(n - k) == '1') {
                a = 1;
            } else {
                a = 0;
            }
            s += a * q;
            q *= 2;
            k++;
        }
        return s; //повертання десяткового числа
    }

    public static void main(String[] args) {
        String input;
        String title = "Розшифрування бінарного коду";

        //діалогове вікно для вводу коду
        input = JOptionPane.showInputDialog(null,
                "Уведіть бінарний код",
                title,
                JOptionPane.QUESTION_MESSAGE
        );

        //якщо користувач не ввів код
        if (input == null) {
            System.exit(0); //завершення виконання програми
        }

        int num = decoder(input);

        String text = "Ви ввели бінарний код: " + input;
        text += "\nКод відповідає числу: " + num;

        //діалогове вікно виводу інформації
        JOptionPane.showMessageDialog(null,
                text,
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }
}
