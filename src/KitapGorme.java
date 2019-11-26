import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KitapGorme extends KitapSirala{
    
   

    public KitapGorme(String kitap, String yazar) {
        super(kitap, yazar);
    }

    KitapGorme() { 
        
    }
    
    
     @Override
    public void KitapList() {
        File file=new File("TumKitaplar.txt");
            
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
            
            writer.write("---->KITAP LISTESI<----");
            writer.write("\n1)Kurk Mantolu Madonna -->Sabahattin Ali ");
            writer.write("\n2)Kucuk Prens --> Antoine De Saint-Exupéry");
            writer.write("\n3)Tutunamayanlar --> Oguz Atay");
            writer.write("\n4)kirmizi Sacli Kadin -->Orhan Pamuk");
            writer.write("\n5)Bir Genc Kizin Gizli Defteri -->Ipek Ongun");
            writer.write("\n6)Donusum --> Franz Kafka");
            writer.write("\n7)Uçurtma Avcısı --> Khaled Hosseini");
            writer.write("\n8)Simyacı --> Paulo Coelho");
            writer.write("\n9)Satranç --> Stefan Zweig");
            writer.write("\n10)Şeker Portakalı --> José Mauro De Vasconcelos");
            writer.write("\n11)Suç ve Ceza --> Dostoyevski");
            writer.write("\n12)Olasılıksız --> Adam Fawer");
            writer.write("\n13)Fareler ve İnsanlar --> John Steinbeck");
           
      
            
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
    public void CokSatanlar() {
        
        File file=new File("CokSatanlar.txt");
            
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
            writer.write("---->COK SATANLAR LISTESI<----");
            writer.write("\n1)Kurk Mantolu Madonna -->Sabahattin Ali ");
            writer.write("\n3)Tutunamayanlar --> Oguz Atay");
            writer.write("\n5)Bir Genc Kizin Gizli Defteri -->Ipek Ongun");
            writer.write("\n7)Uçurtma Avcısı --> Khaled Hosseini");
            writer.write("\n9)Satranç --> Stefan Zweig");
            writer.write("\n11)Suç ve Ceza --> Dostoyevski");
            writer.write("\n12)Olasılıksız --> Adam Fawer");
            
            
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
    public void Indirim() {
        
        
        File file=new File("Indirim.txt");
            
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
            writer.write("---->INDIRIMLI KITAPLARIN LISTESI<----");
            
            writer.write("\n2)Kucuk Prens --> Antoine De Saint-Exupéry");
            writer.write("\n4)kirmizi Sacli Kadin -->Orhan Pamuk");
            writer.write("\n6)Donusum --> Franz Kafka");
            writer.write("\n7)Uçurtma Avcısı --> Khaled Hosseini");
            writer.write("\n8)Simyacı --> Paulo Coelho");
            writer.write("\n9)Satranç --> Stefan Zweig");
            writer.write("\n11)Suç ve Ceza --> Dostoyevski");
            writer.write("\n12)Olasılıksız --> Adam Fawer");
            
            
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
     
    }
    
    

