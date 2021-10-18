package UsingListApplication;

import javax.swing.*;

public class UsingListDemo {
    public static void main(String[] args) {
        //текстовий масив з назвами тварин
        String[] txt = {"Вовк", "Лисиця", "Ведмідь", "Єнот"};

        //текстовий масив із назвами файлів
        String[] files = {"wolf.jpg", "fox.jpg", "bear.jpg", "raccoon.jpg"};

        //текстова змінна - шлях до файлів
        String folder = "src/pictures/";

        //повідомлення в діалоговому вікні
        String msg = "Кого показати?";

        //назва діалогового вікна
        String title = "У світі тварин";

        //піктограма діалогового вікна
        ImageIcon img = new ImageIcon(folder + "giraffe.jpg");

        //діалогове вікно з динамічним списком
        String animal = (String) JOptionPane.showInputDialog(null,
                msg,
                title,
                JOptionPane.PLAIN_MESSAGE,
                img,
                txt, //масив, як динамічний список
                txt[0] //за замовчуванням
        );

        //відміна введення
        if (animal == null) {
            System.exit(0);
        }

        //визначення піктограми для відображення в діалоговому вікні
        for (int k = 0; k < txt.length; k++) {
            if (animal.equals(txt[k])) {
                img = new ImageIcon(folder + files[k]);
                break;
            }
        }

        //відображення діалогового вікна з піктограмою
        JOptionPane.showMessageDialog(null,
                img, //картинка замість тексту
                animal, //назва вікна
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
