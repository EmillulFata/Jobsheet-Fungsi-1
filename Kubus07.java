import java.util.Scanner;
public class Kubus07 {
  public static double HitungVolume (double sisi) {
    return sisi*sisi*sisi;
   }
   public static double HitungLuasPermukaan (double sisi) {
    return 6*sisi*sisi;
   }
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Input panjang sisi kubus : ");
    double sisi = input.nextDouble();

    double volume = HitungVolume(sisi);
    double luasPermukaan = HitungLuasPermukaan(sisi);

    System.out.println("Sisi Kubus : " + sisi);

    System.out.println("Volume Kubus : " + HitungVolume(sisi));
    System.out.println("Luas Permukaan Kubus :" + HitungLuasPermukaan(sisi));
   }
  }
