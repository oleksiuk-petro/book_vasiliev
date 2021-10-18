package ExtendingJOptionPaneApplication;

import javax.swing.*;

public class MyPane extends JOptionPane {

    //статичний метод з двома аргументами
    //для відображення діалогового вікна
    static void showMessage(String txt, String title) {
        //виклик методу з батьківського класу
        showMessageDialog(null,
                txt,
                title,
                PLAIN_MESSAGE,
                new ImageIcon("src/pictures/giraffe.jpg")
        );
    }

    //статичний метод з одним аргументом
    //для відображення діалогового вікна
    static void showMessage(String txt) {
        showMessage(txt, "Повідомлення");
    }

    //статичний метод для відображення вікна з полем уводу
    //для зчитування цілого числа
    static int getInteger(String txt) {
        String res = showInputDialog(null,
                txt,
                "Число (за замовчуванням 10)",
                QUESTION_MESSAGE
        );
        if(res == null) { //натиснута кнопка "Cancel"
            return 10;
        } else {
            return Integer.parseInt(res);
        }
    }
}
