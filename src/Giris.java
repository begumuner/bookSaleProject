
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Giris implements SiparisInt  {
    
      private String ad;
      private String soyad;
      private int sifre;
      private String kitap;
      private String yazar;
      
      Giris()
      {
          
      }
              
    
    public void basla()
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("*********GIRIS*********");
        
        System.out.println("Adinizi giriniz");
        ad=input.nextLine();
        
        System.out.println("Soyadinizi giriniz");
        soyad=input.nextLine();
        
        System.out.println("Sifrenizi giriniz");
        sifre=input.nextInt();
        
    }
    
    public void Next()
    {
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("*********************\n");
        System.out.println("<---Giris Yapilmistir--->");
        System.out.println("*********************\n");
        String B="1)Satis islemlerini goruntuleme\n"+
                 "2)Yeni Kitap ekleme\n";
                
                System.out.println(B);
                int giris3=input.nextInt();
                
                switch(giris3)
                {
                    case 1:
                        System.out.println("*********************");
                        System.out.println("<---Siparis kayitlari--->\n");
                        SiparisKaydi();
                        System.out.println("*********************");
                        System.out.println("Anasayfaya donmek icin 1'e basin.");
                        int sayi13=input.nextInt();
                        break;
                        
                    case 2:
                        
                        yardim();
                        break;
                         
                         
                }
    }

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
        
        File file=new File("TumKitaplar.txt");
        FileWriter writer=null;
            try
            {
            writer=new FileWriter(file,true);
            
            writer.write("\n14)"+getKitap()+"---> "+getYazar()+"\n");
            
            
            
            
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
    
    void Kitap()
    {
         try {
            Scanner input =new Scanner(new FileReader("TumKitaplar.txt"));
            
            while(input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the kitap
     */
    public String getKitap() {
        return kitap;
    }

    /**
     * @param kitap the kitap to set
     */
    public void setKitap(String kitap) {
        this.kitap = kitap;
    }

    /**
     * @return the yazar
     */
    public String getYazar() {
        return yazar;
    }

    /**
     * @param yazar the yazar to set
     */
    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public void yardim()
    {
             Scanner input=new Scanner(System.in);
             System.out.println("*********************");
                         System.out.println("<---YENI URUN EKLEME--->\n");
                         System.out.println("Eklemek istediginiz kitabin adini girin.");
                         kitap=input.nextLine();
                         
                         
                         System.out.println("Eklemek istediginiz kitabin yazarini girin.");
                         yazar=input.nextLine();
                          
                         SiparisAlimi();
                          
                         System.out.println("Kitap listesini gormek icin 1'e.");
                         System.out.println("Cikmak icin 2'ye basin.");
                         int ayi34=input.nextInt();
                         
                         if(ayi34==1)
                         {
                              System.out.println("*********************");
                             Kitap();
                             System.out.println("*********************");
                             System.out.println("Cikmak icin 2'ye basin.");
                             int sayi34=input.nextInt();
                              
                         }
                         
                         
    }

    @Override
    public void yayincilar() {
        
    }

    @Override
    public void kullan() {
     
               
    }
    
}
