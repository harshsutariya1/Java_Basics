import java.util.*;

class _02input{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your name: ");
    String name = sc.nextLine();  
    //or sc.next(); for only word
    System.out.println(name);

    int number = sc.nextInt();
    System.out.println(number);

    float price = sc.nextFloat();        
    System.out.println(price);

    boolean condition = sc.nextBoolean();
    System.out.println(condition);

    // sc.nextDouble();
    // sc.nextByte();
    // sc.nextShort();
    // sc.nextLong();
}
}
