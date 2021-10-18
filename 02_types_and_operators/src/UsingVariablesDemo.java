import javax.swing.JOptionPane;

public class UsingVariablesDemo {
    public static void main(String[] args) {
        int number = 123;
        double x = 32.1;
        char symb = 'A';
        boolean state = true;
        String text = "Використані змінні:\n";
        text = text + "Ціле число: " + number + "\n";
        text = text + "Дійсне число: " + x + "\n";
        text = text + "Символ: " + symb + "\n";
        text = text + "Логічне значення: " + state;
        JOptionPane.showMessageDialog(null,text);
    }
}
