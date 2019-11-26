import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BenimListem extends KitapSirala {

    public BenimListem(String kitap, String yazar) {
        super(kitap, yazar);
    }

    BenimListem() {
        
    }

    @Override
    public void KitapList() {
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

    @Override
    public void CokSatanlar() {
        
         try {
            Scanner input =new Scanner(new FileReader("CokSatanlar.txt"));
            
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
        try {
            Scanner input =new Scanner(new FileReader("Indirim.txt"));
            
            while(input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void MyList()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("*********************");
        System.out.println("Listeye eklemek istediginiz kitabin ismini giriniz");
        String yazi=input.nextLine();
        
        
        File file=new File("MyList.txt");
            
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
            writer=new FileWriter(file,true);
            
            writer.write("\n"+yazi);
            
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
            
            System.out.println("*********************");
            System.out.println("-->Olusturdugunuz listeyi gormek icin 2'ye");
            int giris13=input.nextInt();
            
            if(giris13==2)
            {
                
                try {
                 
                    input = new Scanner(new FileReader("MyList.txt"));
            
            while(input.hasNextLine())
            {
                System.out.println("*********************");
                System.out.println("<---SIZIN LISTENIZ--->\n");
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                System.out.println("*********************");
                
                
            }
            
            
         
         
         
    }

    
    
}
