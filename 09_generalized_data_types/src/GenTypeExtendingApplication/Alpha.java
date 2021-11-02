package GenTypeExtendingApplication;

// підклас суперкласу Base
class Alpha extends Base {

    // цілочислове поле
    int number;

    // конструктор
    Alpha(String txt, int n) {
        // виклик конструктора суперкласу
        super(txt);
        number = n;
    }

    // переозначення методу
    @Override
    void show() {
        // виклик версії методу із суперкласу
        super.show();
        System.out.println("Цілочислове поле: " + number);
    }
}