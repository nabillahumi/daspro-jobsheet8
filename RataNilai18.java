import java.util.Scanner;

public class RataNilai18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNilai;
        int nilaiMhs;
        int rataNilai;

        totalNilai=0;
        rataNilai=0;
        int i,j;
        for (j=1; j<=5; j++) {
            System.out.print("Input Nilai Mahasiswa ke- " +j + '=');
            nilaiMhs=sc.nextInt();
            totalNilai+=nilaiMhs;

            i = 1;
            while (i<=5) {
                totalNilai=0;
                for (j=1; j<=5; j++) {
                    System.out.print("Niai ke- " +j + "=");
                    nilaiMhs = sc.nextInt();
                    totalNilai+=nilaiMhs;
                }
                rataNilai=totalNilai/5;
                i++;
            }
        }
        System.out.println("Rata-rata Nilai Mhasaiswa ke-" +rataNilai + "adalah");
       
    }
}
