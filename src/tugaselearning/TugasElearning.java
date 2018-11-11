package tugaselearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TugasElearning {
    
    private static List<data> databaru = new ArrayList<>();
        
        public static void Utama(){
            int pilih = 0;
            do {
                System.out.println("\nTugas tentang class-object");
                System.out.println("--------------------------");
                System.out.println("1. Input data");
                System.out.println("2. Tampil data");
                System.out.println("3. Sorting data");
                System.out.println("4. Keluar");
                System.out.print("Pilih: ");
                Scanner scan = new Scanner(System.in);
                pilih = scan.nextInt();
                switch (pilih) {
                    case 1:
                        inputData();
                        break;
                    case 2:
                        tampilData();
                        break;
                    case 3:
                        sortingData();
                        break;
                }
            } while (pilih != 4);
        }
        
        private static void inputData(){
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukan nim\t: ");
            String nim = scan.nextLine();
            System.out.print("Masukan nama\t: ");
            String nama = scan.nextLine();
            System.out.print("Masukan ipk\t: ");
            float ipk = scan.nextFloat();
            data dt = new data(nim, nama, ipk);
            databaru.add(dt);
        }
        
        private static void tampilData(){
            if (databaru.isEmpty()){
                System.out.println("Data masih kosong!");
            }
            else{
                System.out.println("-----------------------");
                int i = 1;
                for (data dt : databaru){
                    System.out.println("Data ke-"+i);
                    System.out.println("NIM : "+ dt.getNim());
                    System.out.println("Nama: "+ dt.getNama());
                    System.out.println("IPK : "+ dt.getIpk());
                    i++;
                }
            }
        }

        public static void sortingData(){
            int pilih = 0;
            do
            {
                System.out.println("\nSorting data mahasiswa");
                System.out.println("----------------------");
                System.out.println("1. Sorting by nim");
                System.out.println("2. Sorting by nama");
                System.out.println("3. Sorting by ipk");
                System.out.println("4. Kembali ke awal");
                System.out.print("Pilih : ");
                Scanner scan = new Scanner(System.in);
                pilih = scan.nextInt();
                switch (pilih)
                {
                    case 1:
                        sortingByNIM();
                        break;
                    case 2:
                        sortingByNama();
                        break;
                    case 3:
                        sortingByIPK();
                        break;
                }
            }while (pilih !=4);
        }

        private static void sortingByNIM(){
            if (databaru.isEmpty()){
                System.out.println("Data masih kosong!");
            }
            else{
                Collections.sort(databaru, (data dt1, data dt2) -> dt1.getNim().compareTo(dt2.getNim()));
                System.out.println("--------------------");
                int i = 1;
                for (data dt : databaru){
                    System.out.println("Data ke-"+i);
                    System.out.println("NIM : "+ dt.getNim());
                    System.out.println("Nama: "+ dt.getNama());
                    System.out.println("IPK : "+ dt.getIpk());
                    i++;
                }
            }
        }
        
        private static void sortingByNama(){
            if (databaru.isEmpty()){
                System.out.println("Data masih kosong!");
            }
            else{
                Collections.sort(databaru, (data dt1, data dt2) -> dt1.getNama().compareTo(dt2.getNama()));
                System.out.println("--------------------");
                int i = 1;
                for (data dt : databaru){
                    System.out.println("Data ke-"+i);
                    System.out.println("NIM : "+ dt.getNim());
                    System.out.println("Nama: "+ dt.getNama());
                    System.out.println("IPK : "+ dt.getIpk());
                    i++;
                }
            }
        }
        
        private static void sortingByIPK(){
            if (databaru.isEmpty()){
                System.out.println("Data masih kosong!");
            }
            else{
                Collections.sort(databaru, (data dt1, data dt2) -> {
                    float change1 = dt1.getIpk();
                    float change2 = dt2.getIpk();
                    if (change1 < change2) return -1;
                    if (change1 == change2) return 0;
                    if (change2 > change1) return 1;
                    return 0;
                    }
                );
                System.out.println("--------------------");
                int i = 1;
                for (data dt : databaru){
                    System.out.println("Data ke-"+i);
                    System.out.println("NIM : "+ dt.getNim());
                    System.out.println("Nama: "+ dt.getNama());
                    System.out.println("IPK : "+ dt.getIpk());
                    i++;
                }
            }
        }

    public static void main(String[] args) {
        Utama();
    }
    
}
