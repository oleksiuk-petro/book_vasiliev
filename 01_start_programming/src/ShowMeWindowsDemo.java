import javax.swing.JOptionPane;

public class ShowMeWindowsDemo {
    public static void main(String[] args) {
        String title;
        String text;

        title = JOptionPane.showInputDialog(
                null,
                "Ім’я для вікна:",
                "Назва",
                JOptionPane.WARNING_MESSAGE
        );

        text = JOptionPane.showInputDialog(
                null,
                "Текст повідомлення",
                "Зміст",
                JOptionPane.PLAIN_MESSAGE
        );

        JOptionPane.showMessageDialog(
                null,
                text,
                title,
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
