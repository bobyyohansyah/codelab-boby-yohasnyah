import java.util.Scanner;

public class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double tinggi;

    Kubus(String name) {
        super(name);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input tinggi (cm): ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 6 * tinggi * tinggi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan (cm^2): " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.pow(tinggi, 3);
        super.volume();
        System.out.println("Hasil volume (cm^3): " + hasil);
    }
}