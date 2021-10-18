package MoreOverridingApplication;

class Bravo extends Alpha {
    int code;

    @Override
    void show() {
        super.show();
        System.out.println("Числове поле " + code);
    }

    Bravo(String name, int code) {
        super(name);
        this.code = code;
    }
}
