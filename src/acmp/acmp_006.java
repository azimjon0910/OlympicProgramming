package acmp;

// Задание №6. Шахматы

import java.util.Scanner;

public class acmp_006 {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      try {
        String move = scn.next("[A-H][1-8]-[A-H][1-8]");
        scn.close();
        System.out.print(checkMove(move));
      } catch (Exception e) {
        System.out.print("ERROR");
      }
      
    }
    
    static String checkMove(String move) {
      char l1 = move.charAt(0);
      int n1 = Integer.valueOf(move.charAt(1));
      char l2 = move.charAt(3);
      int n2 = move.charAt(4);
        
      if ((l2 == l1-1 || l2 == l1+1) &&
          (n2 == n1-2 || n2 == n1+2) ||
          (l2 == l1-2 || l2 == l1+2) &&
          (n2 == n1-1 || n2 == n1+1))
        return "YES";
      else
        return "NO";
    }
}
