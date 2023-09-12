import java.util.*;
public class PrimeFactors{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i=2;i<=n;i++){
 if(n%i==0){
 boolean ans = isPrime(i);
 if(ans){
 System.out.println(i);
}
}
}
}
public static boolean isPrime(int num){
int c=2;
while(c*c <=num){
if(num%c==0){
return false;
}
c++;
}
return true;
}
}
