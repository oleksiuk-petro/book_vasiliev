import javax.swing.JOptionPane;

public class InputDoubleVariablesApplication {
    public static void main(String[] args) {
        double mass;
        double height;
        double bmi;
        String result;

        result = JOptionPane.showInputDialog("Ваш зріст у метрах?");
        height = Double.parseDouble(result);

        result = JOptionPane.showInputDialog("Ваша вага в кілограмах?");
        mass = Double.parseDouble(result);

        bmi = mass / height / height;

        bmi = Math.round(bmi * 100) / 100.0;

        JOptionPane.showMessageDialog(null,
                "Індекс маси тіла: " + bmi);
    }
}
