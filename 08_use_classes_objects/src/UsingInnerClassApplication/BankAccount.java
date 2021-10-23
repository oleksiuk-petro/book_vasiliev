package UsingInnerClassApplication;

import static javax.swing.JOptionPane.*;

class BankAccount {

    // об’єкт внутрішнього класу
    Person fellow;
    // річна відсоткова ставка
    double rate;

    // конструктор зовнішнього класу
    BankAccount(String name, double money, int time, double r) {
        fellow = new Person(name, money, time);
        rate = r;
    }

    // метод для відображення діалогового вікна з повідомленням
    void show() {
        showMessageDialog(null,
                fellow,
                "Депозит",
                INFORMATION_MESSAGE);
    }

    // внутрішній клас
    class Person {

        String name; // ім’я вкладника
        double money; // початкова сума вкладу
        int time; // час вкладу (років)

        // метод для розрахунку кінцевої суми
        double getMoney() {
            double s = money;
            for (int k = 1; k <= time; k++) {
                s *= (1 + rate / 100);
            }
            // округлення до двох цифр після десяткової крапки
            s = Math.round(s * 100) / 100.0;
            return s;
        }

        @Override
        public String toString() {
            String txt = "Ім’я: " + name + "\n";
            txt += "Початкова сума: " + money + "\n";
            txt += "Відсоткова ставка: " + rate + "\n";
            txt += "Термін (років): " +time + "\n";
            txt += "Кінцева сума: " + getMoney();
            return txt;
        }

        // конуструктор внутрішнього класу
        Person(String txt, double m, int t) {
            name = txt;
            money = m;
            time = t;
        }
    }
}
