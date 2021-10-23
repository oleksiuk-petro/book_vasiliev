/*
    У цій програмі вираховується сума
    депозиту через деякий час.
 */

package UsingInnerClassApplication;

class UsingInnerClassDemo {

    public static void main(String[] args) {
        // створення об’єкта зовнішнього класу
        BankAccount user = new BankAccount(
                "Іван",
                1000.0,
                5,
                8.0
        );

        // відображення інформації по вкладу
        user.show();
    }
}
