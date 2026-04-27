import java.util.Scanner;

public class Latihan1{

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int kehadiran;
    int total_nilai;
    int validasi;
    String grade;

    System.out.print("Masukan Jumlah Kehadiran Dalam Satu Semester: ");
    kehadiran = sc.nextInt();

    System.out.print("Masukan Total Nilai: ");
    total_nilai = sc.nextInt();

    //percabangan untuk menentukan kondisi nilai
    if(total_nilai >= 80){
      
      grade = "A";

    } else if(total_nilai >= 70){

      grade = "B";

    } else if(total_nilai >= 60){

      grade = "C";
      
    } else if(total_nilai >= 55){

      grade = "D";

    }else{
      
      grade = "E";

    }

    //proses validasi
    validasi = 21 * 75/100;

    if(kehadiran >= validasi){
      System.out.println("Nilai: " + total_nilai);
      System.out.println("Grade: " + grade);
    } else{
      if(total_nilai >= 55){
        total_nilai = 55;
        grade = "D";
        System.out.println("Nilai: " + total_nilai);
        System.out.println("Grade: " + grade);
      } else{
        System.out.println("Nilai: " + total_nilai);
        System.out.println("Grade: E");
      }

    } 
    
  }
}
