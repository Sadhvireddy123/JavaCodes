import java.util.*;
public class QuadraticRoots{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int disc = b*b - (4*a*c);
float r1,r2;
if(disc >0){
System.out.println("Roots are real and unequal");
  r1 = (float)((-b + Math.sqrt(disc)) / (2*a));
r2 = (float) ((-b - Math.sqrt(disc)) / (2*a));
System.out.println(r1 + " " + r2);
}

else if( disc == 0){
System.out.println("Roots are real and equal");
 r1= -b/(2*a);
r2 = -b/(2*a);
System.out.println(r1 + " " + r2);
}

else{
r1 = -b ;
 r2 = -b;
 float k = (float) (Math.sqrt(-disc));
System.out.printf("(%d+ i%.2f)/%d\n",-b,k,2*a);

System.out.printf("(%d- i%.2f)/%d",-b,k,2*a);
}
}
}


