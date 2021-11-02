package ExtendingGenClassApplication;

// підклас з символьним типом замість узагальненого
class Charlie extends Base<Character> {

    // конструктор
    Charlie(Character s) {
        // виклик конструктора суперкласу
        super(s);
    }

    // переозначення методу
    @Override
    void show() {
        System.out.print("Символьне поле: ");
        // виклик версії методу із суперкласу
        super.show();
    }
}