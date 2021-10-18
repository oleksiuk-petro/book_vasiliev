package UsingToStringApplication;

class MyClass {

    String name;
    int code;

    MyClass(String txt, int num) {
        name = txt;
        code = num;
    }

    //переозначення методу toString()
    @Override
    public String toString() {
        String txt = "Об’єкт класу MyClass\n";
        txt += "Поле name: " + name + "\n";
        txt += "Поле code: " + code + "\n";
        for (int k = 1; k <= 21; k++) {
            txt += "-";
        }
        return txt;
    }
}
