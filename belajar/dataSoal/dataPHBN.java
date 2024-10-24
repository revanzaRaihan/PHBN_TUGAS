package dataSoal;

import java.util.ArrayList;
import java.util.Scanner;

public class dataPHBN {

    Scanner input = new Scanner(System.in);

    ArrayList<String> dataSiswa = new ArrayList<>();
    ArrayList<String> dataKelas = new ArrayList<>();
    ArrayList<String> dataLomba = new ArrayList<>();

    Boolean operator = true;

    public void tambahNama() {
        System.out.println("Tambah data siswa");
        System.out.print("Nama : ");
        String namaSiswa = input.nextLine();
        dataSiswa.add(namaSiswa);
        System.out.print("Kelas : ");
        String kelas = input.nextLine();
        dataKelas.add(kelas);
    }

    public void tambahLomba() {
        System.out.println("Masukan Mata Lomba");
        System.out.print("Mata lomba : ");
        String mataLomba = input.nextLine();
        dataLomba.add(mataLomba);
    }

    public void tampilkanData() {
        System.out.println("1. Data Siswa \n2. Data Lomba\n3. Kembali");
        System.out.print("= ");
        int userInput2 = input.nextInt();
        if (userInput2 == 1) {
            System.out.printf("-----------------------------------%n");
            System.out.printf("|            DATA SISWA           |%n");
            System.out.printf("-----------------------------------%n");
            System.out.printf("| %-20s | %-8s |%n", "NAMA SISWA", "KELAS");
            System.out.printf("-----------------------------------%n");
            for (int i = 0; i < dataSiswa.size(); i++) {
                System.out.printf("| %-20s | %-8s |%n", dataSiswa.get(i), dataKelas.get(i));
                // System.out.print("| Nama Siswa : " + dataSiswa.get(i) + "\t" + "\t| ");
                // System.out.println("Kelas : " + dataKelas.get(i) + "\t" + "|");
            }
            opsiTambahan();
        } else if (userInput2 == 2) {
            System.out.printf("--------------------%n");
            System.out.printf("| %-3s | %-10s |%n", "NO.","MATA LOMBA");
            System.out.printf("--------------------%n");
            for (int i = 0; i < dataLomba.size(); i++) {
                System.out.printf("| %-3s | %-10s |%n", (i+1 + "."), dataLomba.get(i));
            }
            opsiTambahan();
        } else if (userInput2 == 3) {
            operator = true;
        }
    }
    
    public void opsiTambahan() {
        System.out.printf("-----------------------------------%n");
        System.out.println("1. Kembali \n2. Selesai");
        System.out.print("= ");
        int userInput3 = input.nextInt();
        if (userInput3 == 1) {
            operator = true;
        } else if (userInput3 == 2) {
            operator = false;
        } else {
            System.out.printf("-----------------------------------%n");
            System.out.println("Pilihan Takde");
        }
    }
    
    public void tambahData() {
        while (operator) {
            System.out.printf("-----------------------------------%n");
            System.out.println("Pilih Opsi : ");
            System.out.println(
                "1. Tambah Data Siswa \n2. Tambah Mata Lomba \n3. Tampilkan Data Lomba PHBN \n4. Selesai dan Keluar");
                System.out.print("= ");
                int userInput = input.nextInt();
                input.nextLine();
                System.out.printf("-----------------------------------%n");
            if (userInput == 1) {
                tambahNama();
            } else if (userInput == 2) {
                tambahLomba();
            } else if (userInput == 3) {
                tampilkanData();
            } else if (userInput == 4) {
                operator = false;
            } else {
                System.out.println("Pilihan Takde");
                operator = true;
            }
        }
    }
}
