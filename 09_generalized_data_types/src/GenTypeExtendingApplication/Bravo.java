package GenTypeExtendingApplication;

// підклас суперкласу Alpha
class Bravo extends Alpha {

    // символьне поле
    char symbol;

    // конструктор
    Bravo(String txt, int n, char s) {
        super(txt, n);
        symbol = s;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Символьне поле: " + symbol);
    }
}