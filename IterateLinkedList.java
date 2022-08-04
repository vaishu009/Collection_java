
import java.util.Iterator;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class IterateLinkedList {
    public static void main(String[] args) {
  LinkedList<String> l_list = new LinkedList<String>();
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("White");
          l_list.add("Pink");
          Iterator p = l_list.listIterator(1);
          while (p.hasNext()) {
          System.out.println(p.next());
   }
   }
}
