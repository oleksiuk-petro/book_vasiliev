/*
    Введене число за допомогою умовного оператора
    перевіряється на парність/непарність,
    після чого з’являється відповідне повідомлення.
 */

package UsingIfApplication;

import javax.swing.*;

public class UsingIfDemo {
    public static void main(String[] args) {
        String input;
        String txt;
        String title;
        int number;

        ImageIcon img; //іконка діалогового вікна

        //вікно з полем вводу
        input = JOptionPane.showInputDialog(null,
                "Уведіть ціле число",
                "Перевірка числа",
                JOptionPane.QUESTION_MESSAGE
        );

        //перевірка, чи виконане введення числа
        if (input == null) {
            JOptionPane.showMessageDialog(null,
                    "Ви не ввели число",
                    "Помилка вводу",
                    JOptionPane.ERROR_MESSAGE
            );
            System.exit(0); //завершення виконання програми
        }

        number = Integer.parseInt(input); //перетворення типів

        if (number % 2 == 0) {
            img = new ImageIcon("D:\\java\\vasiliev\\04_control_instructions\\src\\UsingIfApplication\\even.jpg");
            txt = "Число " + number + " - парне!";
            title = "Парне число";
        } else {
            img = new ImageIcon("D:\\java\\vasiliev\\04_control_instructions\\src\\UsingIfApplication\\odd.png");
            txt = "Число " + number + " - непарне!";
            title = "Непарне число";
        }

        JOptionPane.showMessageDialog(null,
                txt,
                title,
                JOptionPane.PLAIN_MESSAGE,
                img
        );
    }
}
