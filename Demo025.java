 import java.util.Scanner;
    public class Demo25{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a statement: ");
      String statement = sc.nextLine();
      String rs = new StringBuilder(statement).reverse().toString();
      System.out.println("reversed statement:"+rs);
       
    }
}