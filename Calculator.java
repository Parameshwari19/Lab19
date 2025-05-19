import java.util.*;
class Calculator{
  public static void main(String[] args){
    int a=10;
    int b=20;
    char operator='+';
    switch(operator){
      case '+':
        System.out.println(a+b);
        break;
      case '-':
        System.out.println(a-b);
        break;
      case '*':
        System.out.println(a*b);
        break;
      case '/':
        if(b==0){
          System.out.println("/ by 0 is invalid");
        }
        else{
           System.out.println(a/b);
        }
        break;
      default:
         System.out.println("Invalid");
    }
  }
}
  
