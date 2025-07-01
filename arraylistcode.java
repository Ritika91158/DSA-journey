package Array;
import java.util.ArrayList;
import java.util.Collections;
class arraylistcode {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();

        // add eleemnt
        list.add(78);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get element by index
        list.get(0); 
        
        // add eleemnt between
        // index,eleemnt
        list.add(0,1);
        System.out.println(list);

        // set elemnt mtlb update krna index,element
        list.set(0,7);
         System.out.println(list);

        // delete element 
        list.remove(2);
         System.out.println(list);

        //  size
        int size=list.size();
         System.out.println(size);

        // iterate loops
        for(int i=0;i<list.size();i++){
             System.out.println(list.get(i));
        }

        // sorting
        Collections.sort(list);
         System.out.println(list);




    }
    
}
