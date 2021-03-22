package com.practice;

@FunctionalInterface
interface Operate {
   int func(int num1, int num2);
   public String toString();
}
public class LambdaTest {
   public static void main(String[] args) {
      LambdaTest test = new LambdaTest();
      test.getResult();
   }
   public void getResult() {
      Operate op = (num1, num2) -> { // lambda expression
         System.out.println("This hashcode: " + this.hashCode());
         System.out.println("Calling toString(): "+ this.toString());
         return num1 + num2;
      };
      System.out.println("Result is: "+ op.func(10, 7));
   }
   @Override
   public String toString() {
      System.out.println("Super hashcode: " + super.hashCode());
      return Integer.toString(super.hashCode());
   }
}