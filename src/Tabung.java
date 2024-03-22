import java.util.Scanner;
import java.text.DecimalFormat;

public class Tabung extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jari_jari;

    Tabung(String name) {
        super(name);
    }

    @Override
    public void inputNilai(){
        super.luasPermukaan();
        System.out.print("Input tinggi (cm): ");
        tinggi = scanner.nextDouble();
        System.out.print("Input jari-jari (cm): ");
        jari_jari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * Math.PI * jari_jari * (jari_jari);
        DecimalFormat df = new DecimalFormat("#.##"); // Digunakan untuk format 2 angka dibelakang koma
        String hasilFormatted = df.format(hasil);
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan (cm^2): " + hasilFormatted);
    }

    @Override
    public void volume() {
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        DecimalFormat df = new DecimalFormat("#.##"); // Digunakan untuk format 2 angka dibelakang koma
        String hasilFormatted = df.format(hasil);
        super.volume();
        System.out.println("Hasil volume (cm^3): " + hasilFormatted);
    }
}