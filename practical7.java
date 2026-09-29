import java.util.*;
class FirstThread extends Thread {
 public void run() {
  for (int i = 0; i < 3; i++) System.out.println("First Thread");
 }
}
class SecondThread extends Thread {
 public void run() {
  for (int i = 0; i < 3; i++) System.out.println("Second Thread");
 }
}
class Main {
 public static void main(String[] args) throws Exception {
  FirstThread a = new FirstThread();
  SecondThread b = new SecondThread();
  a.start(); a.join();
  b.start(); b.join();
 }
}