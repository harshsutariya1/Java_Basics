import java.util.*;

class _4areaofcircle{
public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  //area of circle = pi*R*R
  float pi = 3.14f;

  System.out.print("Enter radius: ");
  float R = sc.nextFloat();

  float answere = pi * R * R;
  System.out.print("Radius = ");
  System.out.println(answere);

  
}
}
