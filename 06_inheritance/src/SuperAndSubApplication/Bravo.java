package SuperAndSubApplication;

class Bravo extends Alpha{

    int code;

    @Override
    void show() {
        String txt = "Об’єкт класу Bravo\n";
        txt += "Поле name: " + name + "\n";
        txt += "Поле code: " + code + "\n";
        for (int k = 1; k <= 20; k++) {
            txt += "-";
        }
        System.out.println(txt);
    }
}
