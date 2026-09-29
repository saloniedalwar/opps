import java.util.*;
class Main {
 public static void main(String[] args) {
  int age = new Scanner(System.in).nextInt();
  try {
   if (age < 18) throw new Exception();
   System.out.println("Eligible to vote.");
  } catch (Exception e) {
   System.out.println("Not eligible to vote.");
  }
 }
}