
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class ArrayListRetrive {
    public static void main(String[] args) {
  
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("monday");
  list_Strings.add("tuesday");
  list_Strings.add("wednesday");
  list_Strings.add("friday");
  list_Strings.add("saturday");
  System.out.println(list_Strings);
  String element = list_Strings.get(0);
  System.out.println("First element: "+element);
  element = list_Strings.get(2);
  System.out.println("Third element: "+element);
 }
}
