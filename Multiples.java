import java.util.ArrayList;

public class Multiples{
   public static void main(String[] args){
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i = 1; i < 1000; i++){
         if(i % 3 ==0 || i % 5 == 0){
            list.add(i);
         }
      }
      int sum = 0; 
      for(int i = 0; i < list.size(); i++){
         sum = sum + list.get(i);
      }
     System.out.println(sum);
   } 
}