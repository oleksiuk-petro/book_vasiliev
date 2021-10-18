package UsingMultiIfApplication;

import javax.swing.*;

public class UsingMultiIfDemo {
    public static void main(String[] args) {

        ImageIcon img;
        String animal;
        String file = "D:\\java\\vasiliev\\04_control_instructions\\src\\UsingMultiIfApplication\\pictures\\";

        String wolf = "Вовк";
        String fox = "Лисиця";
        String bear = "Ведмідь";
        String raccoon = "Єнот";

        //зчитування назви тварини
        animal = JOptionPane.showInputDialog(null,
                wolf + ", " + fox + " або " + bear + "?",
                "Вкажіть назву тварини",
                JOptionPane.QUESTION_MESSAGE
        );

        if (animal == null) {
            System.exit(0); //завершеня роботи програми
        } else if (animal.equalsIgnoreCase(wolf)) {
            file += "wolf.jpg";
            animal = wolf;
        } else if (animal.equalsIgnoreCase(fox)) {
            file += "fox.jpg";
            animal = fox;
        } else if (animal.equalsIgnoreCase(bear)) {
            file += "bear.jpg";
            animal = bear;
        } else {
            file += "raccoon.jpg";
            animal = raccoon;
        }

        //створення об’єкту піктограми
        img = new ImageIcon(file);

        JOptionPane.showMessageDialog(null,
                img,
                animal,
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
