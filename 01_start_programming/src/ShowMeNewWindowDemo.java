import javax.swing.JOptionPane;

public class ShowMeNewWindowDemo {
    public static void main(String[] args) {
        String title = "Повідомлення";
        String text = "Продовжуємо вивчати Java";
        JOptionPane.showMessageDialog(
                null,
                text,
                title,
                JOptionPane.WARNING_MESSAGE
        );
    }
}
