
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class EmptyHashSet {
    public static void main(String[] args) {
       HashSet<String> set = new HashSet<String>();
          set.add("Red");
          set.add("Green");
          set.add("Black");
          set.add("White");
          set.add("Pink");
          set.add("Yellow");
    System.out.println("Original Hash Set: " + set);
    set.removeAll(set);
    System.out.println("Hash Set after removing all the elements "+set);   
   }
}
