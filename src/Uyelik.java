
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Uyelik implements UyeOlma{
    
    private String ad;
    private String soyad;
    private int sifre;
    
    public Uyelik()
    {
        this.ad=ad;
        this.soyad=soyad;
        this.sifre=sifre;
    }

    @Override
    public void uyelik() {
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("*********YENI UYELIK*********");
        
        System.out.println("Adinizi giriniz");
        setAd(input.nextLine());
        
        System.out.println("Soyadinizi giriniz");
        setSoyad(input.nextLine());
        
        System.out.println("Sifrenizi giriniz");
        setSifre(input.nextInt());
        
        //DOSYA ISLEMLERI
        System.out.println("<<<---------------------------->>>");
        System.out.println("-->Islem tamamlandi.Uye oldugunuz icin tesekkur ederiz..");
        System.out.println("-->Devam etmek icin 2'ye basiniz");
        System.out.println("<<<---------------------------->>>");
        
        int bilgi=input.nextInt();
       
            File file=new File("UyelikBilgi.txt");
            
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
            writer.write("Adiniz= "+getAd() +" Soyadiniz= "+getSoyad()+" Sifreniz= "+getSifre());
            
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
        
    

    @Override
    public void sartlar() {
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("*********************\n");
        System.out.println("<---SİTE KULLANIM ŞARTLARI--->\n" +
"Lütfen sitemizi kullanmadan evvel bu ‘site kullanım şartları’nı dikkatlice okuyunuz\nBu alışveriş sitesini kullanan ve alışveriş yapan müşterilerimiz\naşağıdaki şartları kabul etmiş varsayılmaktadır:\n" +
"Sitemizdeki web sayfaları ve ona bağlı tüm sayfalar (‘site’) adresindeki x firmasının (Firma) malıdır ve onun tarafından işletilir. Sizler (‘Kullanıcı’) sitede sunulan tüm hizmetleri\nkullanırken "+
"aşağıdaki şartlara tabi olduğunuzu, sitedeki hizmetten yararlanmakla ve kullanmaya devam etmekle; Bağlı olduğunuz yasalara göre sözleşme imzalama hakkına, yetkisine ve hukuki ehliyetine sahip ve \n"+
"18 yaşın üzerinde olduğunuzu, bu sözleşmeyi okuduğunuzu, anladığınızı ve sözleşmede yazan şartlarla bağlı olduğunuzu kabul etmiş sayılırsınız.\n"+
"İşbu sözleşme taraflara sözleşme konusu site ile ilgili hak ve yükümlülükler yükler ve taraflar işbu sözleşmeyi kabul ettiklerinde bahsi geçen hak ve yükümlülükleri eksiksiz, doğru, zamanında, \nişbu sözleşmede talep edilen şartlar dâhilinde yerine getireceklerini beyan ederler.\n");
   
        
        System.out.println("-->Uye olmak icin 1'e");
        System.out.println("-->Anasayfaya donmek icin 2'ye basiniz.");
        
       
        
  }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the sifre
     */
    public int getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(int sifre) {
        this.sifre = sifre;
    }
    
}
