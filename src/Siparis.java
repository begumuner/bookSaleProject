import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Siparis implements SiparisInt
{
    
    static String ad;
    static String soyad;
    static String email;
    static String adres;
    static String kitap;

    @Override
    public void SiparisKaydi() {
        
         try {
            Scanner input =new Scanner(new FileReader("Siparis.txt"));
            
            while(input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }

    @Override
    public void SiparisAlimi() {
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("--->SIPARIS<---");
        
        System.out.println("Sectiginiz kitabin adini giriniz\n");
        kitap=input.nextLine();
        
        System.out.println("Siparis icin asagidaki yerleri doldurunuz.");
        
        System.out.println("Adiniz = ");
        ad=input.nextLine();
        System.out.println("Soyadiniz = ");
        soyad=input.nextLine();
        System.out.println("Email = ");
        email=input.nextLine();
        System.out.println("Adresiniz = ");
        adres=input.nextLine();
        
        
        
        
        File file=new File("Siparis.txt");
            
            if(!file.exists())
            {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            FileWriter writer=null;
            try
            {
            writer=new FileWriter(file,false);
            
            writer.write("\nAd = "+ad);
            writer.write("\nSoyad = "+soyad);
            writer.write("\nEmail = "+email);
            writer.write("\nAdres= "+adres);
            writer.write("\nAlinan kitap= "+kitap);
            
            
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
            
            System.out.println("\n***Siparisiniz alinmistir.Bizi tercih ettiginiz icin tesekkur ederiz***\n");
                             
                             System.out.println("---->SIPARIS OZETI<----");
                             System.out.println("*********************");
                             SiparisKaydi();
                             System.out.println("*********************");
                             
                             System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                             int Say=input.nextInt();
            }

    @Override
    public void yayincilar() {
        File file=new File("Yayincilar.txt");
            
            if(!file.exists())
            {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            FileWriter writer=null;
            try
            {
            writer=new FileWriter(file,false);
            
            writer.write("---->YAYINCILAR<----");
            writer.write("\n1)TÜRKİYE İŞ BANKASI KÜLTÜR YAYINLARI");
            writer.write("\n2)DOĞAN KİTAP");
            writer.write("\n3)PEGASUS YAYINLARI");
            writer.write("\n4)EPSİLON YAYINEVİ");
            writer.write("\n5)BEYAZ BALİNA YAYINLARI");
            writer.write("\n6)TUDEM YAYINEVİ");
            writer.write("\n7)NOBEL YAYIN DAĞITIM");
            writer.write("\n8)METİS YAYINLARI");
            writer.write("\n9) KIRMIZI KEDİ YAYINEVİ");
            
            
            
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
            
            
        try {
            Scanner input =new Scanner(new FileReader(file));
            
            while(input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void kullan() {
        
    }
            
}
            
        
    
    
    

