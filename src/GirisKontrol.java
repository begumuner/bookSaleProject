
import java.util.Scanner;


public class GirisKontrol extends Giris {
    
      private String ad;
      private String soyad;
      private int sifre;
    
    public void basla()
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("*********YENI SIFRE*********");
        
        System.out.println("Adinizi giriniz");
        ad=input.nextLine();
        
        System.out.println("Soyadinizi giriniz");
        soyad=input.nextLine();
        
        System.out.println("Yeni sifreniz 123456");
        
        
    }
    
}
