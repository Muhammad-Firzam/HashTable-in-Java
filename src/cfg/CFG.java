package cfg;
import java.util.*;
import java.util.Scanner;
 
class CFG {
    public static void main(String args[])
    {
        Scanner input = new Scanner (System.in);
        Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
 
       System.out.println("Enter the Number of total address: ");
       int ad = input.nextInt();
        
       for(int i=0; i < ad; i++){
       System.out.println("Enter the Enrollment Number to Insert: ");
        int en = input.nextInt();
        int index = en%ad; 
        while(h.containsKey(index)){
            System.out.println("COLLIOSION OCCURED !!!");
                index = (index+1)%ad;  
        }
           h.put(index, en);
           System.out.println("Do you want to add again ? \nY OR N");
           char ans = input.next().charAt(0);
           if(ans=='y')
              continue;
           else
               break;
      }   
       //Formattting the HashTable
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(h);
        Set<Integer> keys = tm.keySet();
        Iterator<Integer> itr = keys.iterator();
        while (itr.hasNext()) {
            Integer i = itr.next();
            System.out.println("------------------");
            System.out.println("| "+ i + " = " + tm.get(i)+ " | ");
        }
        System.out.println("------------------");
    }
}