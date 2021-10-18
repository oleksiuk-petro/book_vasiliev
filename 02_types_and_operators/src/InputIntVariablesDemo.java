import javax.swing.JOptionPane;

public class InputIntVariablesDemo {
    public static void main(String[] args) {
        int age;
        int year;
        int birth;

        String result;

        result = JOptionPane.showInputDialog("Який зараз рік?");
        year = Integer.parseInt(result); //перетворення тексту в ціле число

        result = JOptionPane.showInputDialog("Скільки вам років?");
        age = Integer.parseInt(result);

        birth = year - age;

        JOptionPane.showMessageDialog(null,
                "Ви народились в " + birth + " році!");
    }
}
