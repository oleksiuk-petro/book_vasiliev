package SuperAndSubApplication;

class Alpha {

    String name;

    void show() {
        String txt = "Об’єкт класу Alpha\n";
        txt += "Поле name: " + name + "\n";
        for (int k = 1; k <= 20; k++) {
            txt += "-";
        }
        System.out.println(txt);
    }
}
