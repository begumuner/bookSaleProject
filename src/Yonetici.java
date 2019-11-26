
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Yonetici extends Uyelik{
    
    //overload 
    
    private int telno;
    private String kullaniciAdi;
    Uyelik u2=new Uyelik();
    
    Yonetici()
    {
        super();
        this.kullaniciAdi=kullaniciAdi;
    }
    
    Yonetici(int telno)
    {
        super();
        this.kullaniciAdi=kullaniciAdi;
        this.telno=telno;
    }

    @Override
    public void uyelik() {
        Scanner input=new Scanner(System.in);
        
        System.out.println("*********YENI UYELIK*********");
        
        System.out.println("Adinizi giriniz");
        String ad=input.nextLine();
        u2.setAd(ad);
        
        System.out.println("Soyadinizi giriniz");
        String soyad=input.nextLine();
        u2.setSoyad(soyad);
        
        System.out.println("Sifrenizi giriniz");
        int sifre=input.nextInt();
        u2.setSifre(sifre);
        
        //DOSYA ISLEMLERI
        System.out.println("<<<---------------------------->>>");
        System.out.println("-->Islem tamamlandi.Uye oldugunuz icin tesekkur ederiz..");
        System.out.println("-->Devam etmek icin 2'ye basiniz");
        System.out.println("<<<---------------------------->>>");
        
        int bilgi=input.nextInt();
       
            File file=new File("UyelikBilgi.txt");
            
           FileWriter writer=null;
            try
            {
            writer=new FileWriter(file,true);
            writer.write("Adiniz= "+ad +" Soyadiniz= "+soyad+" Sifreniz= "+sifre);
            
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            if(writer !=null)
            {
                
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                        
            }
            
               
    }


    
    
    

    
}
