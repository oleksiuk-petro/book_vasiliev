package OverloadingAndOverridingApplication;

class Bravo extends Alpha {

    @Override
    void show() {
        System.out.println("Class Bravo");
    }


    void show(int num) {
        System.out.println("Number " + num);;
    }
}
