package ExtendingGenClassApplication;

// підклас з цілочисловим типом замість узагальненого
class Alpha extends Base<Integer> {

    // конструктор
    Alpha(Integer n) {
        // виклик конструктора суперкласу
        super(n);
    }

    // переозначення методу
    @Override
    void show() {
        System.out.print("Цілочислове поле: ");
        // виклик версії методу із суперкласу
        super.show();
    }
}