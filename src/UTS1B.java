import java.util.Scanner;

public class UTS1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jenis suhu
        System.out.print("Masukkan jenis suhu (Fahrenheit/Reamur): ");
        String jenisSuhu = input.nextLine();

        // Input nilai suhu Celcius
        System.out.print("Masukkan nilai suhu Celcius: ");
        double suhuCelcius = input.nextDouble();

        // Hitung konversi
        double hasilKonversi = 0;

        if (jenisSuhu.equalsIgnoreCase("Fahrenheit")) {
            hasilKonversi = (suhuCelcius * 9/5) + 32;
        } else if (jenisSuhu.equalsIgnoreCase("Reamur")) {
            hasilKonversi = suhuCelcius * 4/5;
        } else {
            System.out.println("Jenis suhu tidak valid.");
            System.exit(1);
        }

        // Validasi kelipatan 2 dan 5
        boolean kelipatanDua = (hasilKonversi % 2 == 0);
        boolean kelipatanLima = (hasilKonversi % 5 == 0);

        // Tampilkan hasil konversi dan status kelipatan
        System.out.println("Hasil konversi ke " + jenisSuhu + ": " + hasilKonversi);
        System.out.println("Status kelipatan 2: " + kelipatanDua);
        System.out.println("Status kelipatan 5: " + kelipatanLima);

        input.close();
    }
}
