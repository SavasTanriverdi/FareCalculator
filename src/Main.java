import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını başlatma
        Scanner scanner = new Scanner(System.in);

        // Sabit ücret ve kilometre başına ücret
        double baseFare = 10.0; // Sabit taban ücret
        double costPerKm = 2.50; // Kilometre başına ücret

        // Kullanıcıdan mesafe bilgisini alma
        System.out.print("Lütfen seyahat edilen mesafeyi kilometre olarak girin: ");
        double distance = scanner.nextDouble();

        // Toplam ücret hesaplama
        double totalFare = baseFare + (costPerKm * distance);

        // Minimum ücret kontrolü (örneğin, en az 20 TL olmalı)
        if (totalFare < 20.0) {
            totalFare = 20.0;
        }

        // Sonucu gösterme
        System.out.printf("Toplam ödenecek tutar: %.2f TL\n", totalFare);

        // Scanner'ı kapatma
        scanner.close();
    }
}