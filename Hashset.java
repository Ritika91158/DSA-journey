package Hash;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("size of set is: "+set.size());
         
        // print all elemnts in set
        System.out.println(set);
        // search = contain function
        if(set.contains(9)){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }

        // remove function for delete
        set.remove(5);
        if(!set.contains(5)){
            System.out.println("5 is removed");
        }

        // Iterator
        // first we import it 
        Iterator it=set.iterator();
        // hasnext  and next two funtions
        // next next value ko return krta ha and starting me null 
        // ko point kr rha hai 
        // hasnext true return krega agr next value hai agr nhi ha toh false return krega 

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
    
}
