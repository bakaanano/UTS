import java.util.Scanner;

public class orang {
    static double beratOrang, tinggi;

    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.println("Calculator BMI");

        System.out.print("Masukkan berat kamu (kg) : ");
        beratOrang = calc.nextDouble();

        System.out.print("Masukkan tinggi kamu (cm) : ");
        tinggi = calc.nextDouble();

        double tinggiOrang = tinggi / 100;
        double hasil = beratOrang / (tinggiOrang * tinggiOrang);

        System.out.println("Hasil BMI : " + hasil);

        if (hasil <= 18.4) {
            System.out.println("Kurus");
        } else if (hasil >= 18.50 && hasil <= 24.90) {
            System.out.println("Normal");
        } else if (hasil >= 25.0 && hasil <= 39.90) {
            System.out.println("Gemuk");
        } else {
            System.out.println("Obesitas");
        }

        calc.close();
    }
}
