package UsingPackageApplication;

import static javax.swing.JOptionPane.*;

public class UsingPackageDemo {
    public static void main(String[] args) {
        showMessageDialog(null,
            "Статичний імпорт - це зручно!",
            "Пакет mypack",
            WARNING_MESSAGE
        );
    }
}
