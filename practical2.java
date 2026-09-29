import java.util.*;
class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int[] a = {10,20,30,40,50};
  int p = sc.nextInt();
  try {
   System.out.println("Element = " + a[p]);
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Invalid array position.");
  }
 }
}