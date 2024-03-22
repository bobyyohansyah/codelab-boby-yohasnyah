import java.util.Scanner;

public class Balok extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double panjang;
    private double lebar;
    private double tinggi;


    Balok(String name) {
        super(name);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Masukkan Panjang (cm): ");
        panjang = scanner.nextDouble();
        System.out.print("Masukkan Lebar (cm): ");
        lebar = scanner.nextDouble();
        System.out.print("Masukkan Tinggi (cm): ");
        tinggi = scanner.nextDouble();

    }

    @Override
    public void luasPermukaan(){
        double hasil = 2 * ((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan (cm^2): " + hasil);
    }

    @Override
    public void volume(){
        double hasil = panjang * lebar * tinggi;
        super.volume();
        System.out.println("Hasil volume (cm^3): " + hasil);
    }
}