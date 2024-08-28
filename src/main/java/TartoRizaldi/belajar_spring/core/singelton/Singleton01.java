package TartoRizaldi.belajar_spring.core.singelton;

public class Singleton01 {
    // Satu-satunya instance dari Singleton yang disimpan dalam private static field
    private static Singleton01 instance;

    // Konstruktor privat untuk mencegah pembuatan instance dari luar
    private Singleton01() {
        // Initialization code here
    }

    // Metode publik yang mengembalikan instance tunggal
    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }

}