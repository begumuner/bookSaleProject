import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class KitapSirala 
{
    private String kitap;
    private String yazar;
    
     public KitapSirala( )
     {
         
     }
    public KitapSirala(String kitap,String yazar)
            {
                this.kitap=kitap;
                this.yazar=yazar;
            }
    
    public abstract void KitapList();

    public abstract void CokSatanlar();
    
    public abstract void Indirim();

   
    public String getKitap() {
        return kitap;
    }

    
    public void setKitap(String kitap) {
        this.kitap = kitap;
    }

    
    public String getYazar() {
        return yazar;
    }

    
    public void setYazar(String yazar) {
        this.yazar = yazar;
    }
        
}

