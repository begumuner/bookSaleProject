
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Kargo extends kargoInt {

    @Override
    public void kargo() {
        
             File file=new File("Kargo.txt");
            
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
            
            writer.write("---->Kargo Bilgileri<----");
            writer.write("\n1)Kargo firmasi=Y Kargo ");
            writer.write("\n2)Kargo ulasim zamani=3 is gunu icerisinde");
            writer.write("\n3)Kargo no=59457479 dir");
            
            
            
            
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
    

