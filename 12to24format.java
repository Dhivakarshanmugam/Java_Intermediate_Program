import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {
   public static void main(String [] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String s=sc.nextLine();
       SimpleDateFormat p = new SimpleDateFormat("hh:mm:ssa");
       SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss");
       Date date = p.parse(s);
       System.out.print(d.format(date));
   }
}
