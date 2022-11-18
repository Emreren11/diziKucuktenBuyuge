
import java.nio.charset.MalformedInputException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String alignment(int[] arr) { // sıralama yapacağımız metotu yazdım. Array.toString komutunda [] kullandığı için kullanmak istemedim
        String array = "";
        for (int i : arr) {
            array += i + " "; // her elemanını array string in içine atıyoruz
        }
        return array; // sıralanmış string değerini gönderiyoruz
    }

    public static void main(String[] args) {

        //Eleman sayısı ve elemanları girilen dizinin elemanlarını küçükten büyüğe sıralıyoruz...

        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = inp.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". Eleman: ");
            numbers[i] = inp.nextInt(); // dizinin i indis numarasına girilen sayıyı atıyoruz
        }
        Arrays.sort(numbers); // küçüktem büyüğe sıralama
        System.out.println("Sıralama: " + alignment(numbers));
    }
}