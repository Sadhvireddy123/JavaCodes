import java.util.*;
public class Palindrome{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int original =n;
int rev=0;
while(n>0){
int rem = n%10;
rev= rev * 10 + rem;
n /= 10;
}
if(original == rev){
System.out.println("palidrome");
}
else{
System.out.println("Not a palidrome");
}
}
}
