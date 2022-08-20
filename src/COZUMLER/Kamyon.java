package COZUMLER;

public class Kamyon {
    String Model;
    String yakit="benzin";
    double mile;

    public Kamyon() {
    }

    public Kamyon(String model, String yakit, double mile) {
        Model = model;
        this.yakit =yakit;
        this.mile = mile;

    }
}
