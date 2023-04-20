import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    boolean dentroTienda = false;
    int i = 0;
    
    Map<String, String> map = new HashMap<>();
    
    map.put("Nike", "NoSize");
    map.put("New Balance", "NoSize");
    map.put("Hunder Armor", "NoSize");
    map.put("Adidas", "ItsSize");
    
    Set<Map.Entry<String, String>> set = map.entrySet();
    
    List<Map.Entry<String, String>> list = new ArrayList<>(set);
    
    if(dentroTienda == false){
      System.out.println("Entrando a la tienda...");
      dentroTienda = true;
    }
    if(dentroTienda == true){
      
      System.out.println("Dentro de la tienda");
      System.out.println("Elegiendo marca de zapato...");
      System.out.println("Hemos elegido primero la marca " + list.get(i).getKey());
      
    }
  
    for (i = 0; i < list.size(); i++) {
      if(list.get(i).getValue() == "NoSize"){
        System.out.println("la marca " + list.get(i).getKey() + " no tiene tu talla, probemos con otra marca");
      }
      if (list.get(i).getValue() == "ItsSize") {
        System.out.println(list.get(i).getKey() + " tiene de nuestra talla");
        System.out.println("Compraremos los zapatos de la marca " + list.get(i).getKey());
      }
  
    } 
  }
}
