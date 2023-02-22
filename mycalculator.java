// Implement a simple calculator that performs basic arithmetic operations
// (addition, subtraction, multiplication, and division).
// This project will help you understand OOP concepts such as encapsulation,
// inheritance, and polymorphism.
import java.util.*;
class baseclass {
  int a, b;
  baseclass(int a, int b) {
    this.a = a;
    this.b = b;
  }
}

class calculator extends baseclass {
  calculator(int a, int b) {
    super(a, b);
  }
  int add() {
    return a + b;
  }
  int sub() {
    return a - b;
  }
  int mul() {
    return a * b;
  }
  int div() {
    try 
    {
      return a / b;
    }
    catch(Exception e)
    {
      System.out.println("Divided by zero  is not allowed!!"+e);
      return 0;
    }
  }
}

class mycalculator {
  public static void main(String args[]) {
    int a, b;
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("1.Add       2.Subtract      3.Multiply        4.Divide        5.Exit");
      System.out.print("Enter your choice:");
      int ch = sc.nextInt();
      if(ch==5)
      {
        System.out.println("Exited!!");
        System.exit(0);
      }
      System.out.print("Enter the first value:");
      a = sc.nextInt();
      System.out.print("Enter the secound value:");
      b = sc.nextInt();
      calculator cal = new calculator(a, b);
      switch (ch) {
        case 1:
          System.out.println("Answer for Addition is :" + cal.add());
          break;
        case 2:
          System.out.println("Answer for Subtraction is :" + cal.sub());
          break;
        case 3:
          System.out.println("Answer for Multiplication is :" + cal.mul());
          break;
        case 4:
          System.out.println("Answer for Divition is :" + cal.div());
          break;
        default:
          System.out.println("Enter a valid choice!!");
          break;
      }
    }
  }
}