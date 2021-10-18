import javax.swing.JOptionPane;

public class InputDialogDemo {
    public static void main(String[] args) {
        String text;
        text = JOptionPane.showInputDialog("Уведіть текст");
        JOptionPane.showMessageDialog(
                null,
                "Ви ввели такий текст:\n" + text);
    }
}
