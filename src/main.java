
import java.util.*;
import java.io.*;

public class main {
    
    public static void Kontrol(Giris g) //POLIMORFIZM ICIN FONK
    {
        g.basla();
    }
    
    public static void main(String [] args)
    {
   
        Scanner input=new Scanner(System.in);
        
        System.out.println("*******************************************");   
        System.out.println("<---KITAP SATIS SAYFAMIZA HOSGELDINIZ--->");
        System.out.println("******************************************\n");   
        
        System.out.println("->Kullanici girisi icin 1'e ");
   
        System.out.println("->Yonetici girisi icin 2'ye ");
        
        System.out.println("->Kargo takibi icin 3'e basiniz.");
        int giris=input.nextInt();
        
        Uyelik u=new Uyelik();
        KitapGorme k=new KitapGorme();
         BenimListem my=new BenimListem();
        Siparis s=new Siparis();
        Yonetici yonetici=new Yonetici();
        Kargo kargo=new Kargo();
        
        
        
        switch(giris)
        {
            case 1:
                
                while(true)
                {
                    
                System.out.println("*********************\n");    
                
                String A="1)Uyelik olusturma\n"+
                        "2)Kitaplari gorme\n"+
                        "3)Siparis olusturma\n"+
                        "4)Kitap listeni olusturma\n"+
                        "5)Cikis yapmak icin\n"+
                        "\n"+
                        "Yapmak istediginiz islemi seciniz\n"+
                        "*********************";
                
                
                System.out.println(A);
                int giris2=input.nextInt();
                
                switch(giris2)
                {
                    case 1:
                        
                        System.out.println("*********************");
                        System.out.println("-->Uyelik sartlarini gormek icin 1'e");
                        System.out.println("-->Uyelik olusturmak icin 2'ye basiniz.");
                        System.out.println("*********************");
                        
                        int sartlar=input.nextInt();
                        
                         if(sartlar==1)
                         {
                             u.sartlar();
                             
                             System.out.println("*********************");
                             int devam=input.nextInt();
        
                               if(devam==1)
                                 {
                                    u.uyelik();
                                 }
                         }
                         else
                                 {
                                     u.uyelik();
                                 }
                         break;
                        
                    case 2:
                        
                         System.out.println("*********************");
                         System.out.println("-->Tum kitaplari gormek icin 1'e");
                         System.out.println("-->Cok satanlari gormek icin 2'ye");
                         System.out.println("-->Indirimli kitaplari gormek icin 3'e");
                         System.out.println("-->Yayincilari gormek icin 4'e");
                         System.out.println("-->Anasayfaya donmek icin 5'e basiniz");
                         System.out.println("*********************");
                         
                         int kitap=input.nextInt();
                         
                         switch(kitap)
                         {
                             
                             case 1:
                                 
                                 System.out.println("*********************");
                                 k.KitapList();
                                 System.out.println("*********************");
                                 
                                 System.out.println("-->Cok satanlari gormek icin 1'e");
                                 System.out.println("-->Indirimli kitaplari gormek icin 2'ye");
                                 System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                 int giris5=input.nextInt();
                                 
                                 
                                 switch(giris5)
                                 {
                                     case 1:
                                         System.out.println("*********************");
                                         k.CokSatanlar();
                                         System.out.println("*********************");
                                         System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                         int giris6=input.nextInt();
                                         break;
                                         
                                     case 2:
                                         System.out.println("*********************");
                                         k.Indirim();
                                         System.out.println("*********************");
                                         System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                         int giris7=input.nextInt();
                                         break;
                                 }
                                 
                                 break;
                                 
                             case 2:
                                 
                                         System.out.println("*********************");
                                         k.CokSatanlar();
                                         System.out.println("*********************");
                                         System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                         int giris9=input.nextInt();
                                         break;
                             case 3:
                                 
                                         System.out.println("*********************");
                                         k.Indirim();
                                         System.out.println("*********************");
                                         System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                         int giris8=input.nextInt();
                                         break;
                             case 4:
                                 
                                  System.out.println("*********************");
                                  s.yayincilar();
                                  System.out.println("*********************");
                                  System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                         int giris0=input.nextInt();
                                         break;
                             case 5:
                                 break;
                                 
                         }
                        
                    case 3:
                        
                             System.out.println("Siparis olusturmak icin asagidakilerden faydalanabilirsiniz.-->");
                             System.out.println("*********************");
                             System.out.println("-->Tum kitaplari gormek icin 1'e");
                             System.out.println("-->Cok satanlari gormek icin 2'ye");
                             System.out.println("-->Indirimli kitaplari gormek icin 3'e");
                             System.out.println("-->Anasayfaya donmek icin 4'e basiniz");
                             System.out.println("*********************");
                             
                             System.out.println("-->Siparis vermek icin 5'e basiniz.");
                             int giris123=input.nextInt();
                             
                             switch(giris123)
                             {
                                 case 1:
                                     
                                         System.out.println("*********************");
                                         k.KitapList();
                                         System.out.println("*********************");
                                         System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                         System.out.println("-->Siparis vermek icin 5'e basiniz.");
                                         int giris1234=input.nextInt();
                                         
                                         if(giris1234==5)
                                         {
                                             s.SiparisAlimi();
                                         }
                                         break;
                                     
                                 case 2:
                                     
                                         System.out.println("*********************");
                                         k.CokSatanlar();
                                         System.out.println("*********************");
                                         System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                          System.out.println("-->Siparis vermek icin 5'e basiniz.");
                                         int giris125=input.nextInt();
                                         
                                         if(giris125==5)
                                         {
                                             s.SiparisAlimi();
                                         }
                                         break;
                                 case 3:
                                     
                                         System.out.println("*********************");
                                         k.Indirim();
                                         System.out.println("*********************");
                                         System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                          System.out.println("-->Siparis vermek icin 5'e basiniz.");
                                         int giris127=input.nextInt();
                                         
                                         if(giris127==5)
                                         {
                                             s.SiparisAlimi();
                                         }
                                         break;
                                 case 4:
                                     break;
                                     
                                 case 5:
                                     
                                     s.SiparisAlimi();
                              
                             }
                             
                        
                        break;
                    case 4:
                            System.out.println("---->KENDI KITAP LISTENI OLUSTUR<----");
                            System.out.println("-->Kendi kitap listeni olustururken asagidakilerden faydalanabilirsin.");
                    
                             System.out.println("*********************");
                             System.out.println("-->Tum kitaplari gormek icin 1'e");
                             System.out.println("-->Cok satanlari gormek icin 2'ye");
                             System.out.println("-->Indirimli kitaplari gormek icin 3'e");
                             System.out.println("-->Anasayfaya donmek icin 4'e basiniz");
                             System.out.println("*********************");
                             
                             System.out.println("-->Kendi kitap listeni olusturmak icin 5'e basiniz");
                             
                             int giris10=input.nextInt();
                             
                             switch(giris10)
                             {
                                 case 1:
                                     
                                     System.out.println("*********************");
                                     my.KitapList();
                                     System.out.println("*********************");
                                     
                                      System.out.println("-->Cok satanlari gormek icin 1'e");
                                      System.out.println("-->Indirimli kitaplari gormek icin 2'ye");
                                      System.out.println("-->Anasayfaya donmek icin 3'e");
                                      System.out.println("-->Kendi kitap listeni olusturmak icin 4'e basiniz");
                                      int giris5=input.nextInt();
                                      
                                 
                                 
                                 switch(giris5)
                                 {
                                     case 1:
                                         System.out.println("*********************");
                                         my.CokSatanlar();
                                         System.out.println("*********************");
                                         System.out.println("-->Anasayfaya donmek icin 3'e basiniz");
                                         int giris6=input.nextInt();
                                         break;
                                         
                                     case 2:
                                         System.out.println("*********************");
                                         my.Indirim();
                                         System.out.println("*********************");
                                         System.out.println("-->Anasayfaya donmek icin 3'e basiniz.");
                                         int giris7=input.nextInt();
                                         break;
                                     case 4:
                                         my.MyList();
                                 }
                                 
                                 break;
                                     
                                 case 2:
                                     
                                     System.out.println("*********************");
                                     my.CokSatanlar();
                                     System.out.println("*********************");
                                     
                                     System.out.println("-->Anasayfaya donmek icin 3'e ");
                                     System.out.println("-->Kendi kitap listeni olusturmak icin 4'e basiniz.");
                                     int giris21=input.nextInt();
                                     
                                     if(giris21==4)
                                     {
                                         my.MyList();
                                     }
                                     
                                     break;
                                     
                                 case 3:
                                     
                                     System.out.println("*********************");
                                     my.Indirim();
                                     System.out.println("*********************");
                                     
                                     System.out.println("-->Anasayfaya donmek icin 3'e");
                                     System.out.println("-->Kendi kitap listeni olusturmak icin 4'e basiniz.");
                                     int giris12=input.nextInt();
                                     
                                     if(giris12==4)
                                     {
                                         my.MyList();
                                     }
                                     
                                     
                                     break;
                                     
                                 case 4:
                                     break;
                                     
                                 case 5:
                                 {
                                     my.MyList();
                                     System.out.println("-->Anasayfaya donmek icin 3'e basin.");
                                     int sayi=input.nextInt();
                                 }
                              break;
                            }
                             
                        
                    case 5:
                        
                        System.out.println("*********************\n");
                        System.out.println("Bizi ziyaret ettiginiz icin tesekkur ederiz.\n");
                        System.out.println("*********************");
                        
                       
                       return ;
                       
                }
                
                
                }
                
            case 2:
                
                while(true)
                {
                    
                System.out.println("*********************\n");    
                String A="1)Uyelik olusturma\n"+
                         "2)Giris(uye iseniz)\n"+
                         "3)Cikis yapmak icin"+
                         "\n"+
                         "Yapmak istediginiz islemi seciniz\n"+
                         "*********************";
                
                System.out.println(A);
                int giris41=input.nextInt();
                
                switch(giris41)
                {
                    case 1:
                        
                        System.out.println("*********************");
                        System.out.println("-->Uyelik sartlarini gormek icin 1'e");
                        System.out.println("-->Uyelik olusturmak icin 2'ye basiniz.");
                        System.out.println("*********************");
                        
                        int sartlar2=input.nextInt();
                        if(sartlar2==1)
                        {
                            yonetici.sartlar();
                            
                              System.out.println("*********************");
                              int devam2=input.nextInt();
        
                               if(devam2==1)
                               {
                                   
                                   System.out.println("*********UYELIK OLUSTURMA*********");
                                 System.out.println("Kolay sifre belirlemek icin 1'e");
                                 System.out.println("Kolay sifre belirlemek istemiyorsaniz icin 2'ye basin.");
                                  int sayi7=input.nextInt();
                            
                            if(sayi7==1)
                            {
                                System.out.println("Kolay sifre belirleyin(3 rakamli)");
                                int tel=input.nextInt();
                                
                                Yonetici y=new Yonetici(tel);
                                yonetici.uyelik();
                                
                             
                            }
                            else
                            {
                            yonetici.uyelik();
                               
                        }
                               }
                            
                        }
                        else if(sartlar2==2)
                        {
                            System.out.println("*********UYELIK OLUSTURMA*********");
                                 System.out.println("Kolay sifre belirlemek icin 1'e");
                                 System.out.println("Kolay sifre belirlemek istemiyorsaniz icin 2'ye basin.");
                            int sayi7=input.nextInt();
                            
                            if(sayi7==1)
                            {
                                System.out.println("Kolay sifre belirleyin(3 rakamli)");
                                int tel=input.nextInt();
                                
                                Yonetici y=new Yonetici(tel);
                                yonetici.uyelik();
                                
                             
                            }
                            else
                            {
                            yonetici.uyelik();
                            
                        }
                        }
                        break;
                        
                    case 2:
                        
                         System.out.println("*************GIRIS*************");
                         System.out.println("-->Giris icin 1'e");
                         System.out.println("-->Sifrenizi unuttuysaniz 2'ye basin.");
                         int sifre1=input.nextInt();
                         
                         if(sifre1==1)
                         {
                             Giris giris1=new Giris();
                             Kontrol(giris1);
                             giris1.Next();
                       }
                         else if(sifre1==2)
                         {
                             //POLIMORFIZM
                             Giris giris1=new Giris();
                             GirisKontrol kontrol1=new GirisKontrol();
                             Giris giris2=new GirisKontrol();
                             Kontrol(giris2);
                             
                              System.out.println("Yeni Sifrenizi kaydetmek icin 1'e basin.");
                              int sayi19=input.nextInt();
                              if(sayi19==1)
                              {
                                  giris1.Next();
                              }
                         }
                         
                         
                        break;
                    case 3:
                        System.out.println("*********************\n");
                        System.out.println("Bizi ziyaret ettiginiz icin tesekkur ederiz.\n");
                        System.out.println("*********************");
                        
                       
                       return ;
                        
                }
                
                
                
                
               
            
        }
            case 3:
                 System.out.println("*********************");
                 System.out.println("--->KARGO ISLEMLERI<---.\n");
                 System.out.println("*********************");
                 kargo.kargo();
                 break;
    
    }
    
    }
}
