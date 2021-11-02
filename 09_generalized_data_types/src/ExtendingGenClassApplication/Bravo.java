package ExtendingGenClassApplication;

// підклас з текстовим типом замість узагальненого
class Bravo extends Base<String> {

    // конструктор
    Bravo(String txt) {
        // виклик конструктора суперкласу
        super(txt);
    }

    // переозначення методу
    @Override
    void show() {
        System.out.print("Текстове поле: ");
        // виклик версії методу із суперкласу
        super.show();
    }
}