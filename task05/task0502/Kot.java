package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

public class Kot {

   public int wiek;
    public int waga;
    public int sila;
    public int a = 0;
    public int b = 0;

    public Kot() {
    }

    public boolean walka(Kot innyKot) {
        
       
      
        
         if(this.wiek > innyKot.wiek)
         a++;
         
        else
          b++;
         
         if(this.waga > innyKot.waga)
            a++; 
            
            
         else
          b++;
         
         if(this.sila > innyKot.sila)
        a++;
         
        else
          b++;
         
         
          
          if(a>b)
          return true;
          
          
          else
          return false;
          
       
       
        //tutaj wpisz swój kod
    }

    public static void main(String[] args) {
        Kot kot1 = new Kot();
         Kot kot2 = new Kot();
         
         kot1.waga = 34;
         kot1.wiek = 34;
         kot1.sila = 34;
         
         kot2.waga = 11;
         kot2.wiek = 13;
         kot2.sila = 12;
         
         System.out.println(kot1.walka(kot2));
         System.out.println(kot2.walka(kot1));
         
         
         
         
        
       
    }
    
}
