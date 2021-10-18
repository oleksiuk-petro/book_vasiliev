package UsingObjectApplication;

import javax.swing.JOptionPane;

class MyClass {
    int number;
    char symbol;
}

public class UsingObjectDemo {
    public static void main(String[] args) {

        MyClass obj = new MyClass(); //створення об’єкта класу

        obj.number = 100;
        obj.symbol = 'A';

        String text = "Число: " + obj.number +"\n";
        text += "Символ: " + obj.symbol;

        //відображення діалогового вікна
        JOptionPane.showMessageDialog(null, text);
    }
}
