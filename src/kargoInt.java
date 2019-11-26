
public abstract class kargoInt {
    
    private static String kargoIsmi;
    
    public abstract void kargo();
    
    public static void kargoSayisi(int x)
    {
        
        int count = 0;
        
        if(x==0)
        {
            count++;
            System.out.println("kargo sayisi:"+count+"dir.");
            
        }
        
    }
    
    public static void kargoIsmi(String b)
    {
        if(!b.equals(kargoIsmi))
        {
            System.out.println(b);
        }
        
    }
    
    
}
