import java.util.*;
public class Calculator{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
int ans=0;
System.out.println("enter the operator (x or X to exit)");
char op= sc.next().trim().charAt(0);
if(op == '+' || op == '-' || op == '*' || op== '/' || op == '%'){
System.out.println("enter two numbers");
int a = sc.nextInt();
int b = sc.nextInt();
switch(op){
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
if(b!=0){
System.out.println(a/b);
}
else{
System.out.println("b value is invalid");
}
break;

case '%':
System.out.println(a%b);
break;

}
}
else if(op =='x' || op =='X'){
break;
}
else{
System.out.println("invalid operator");
}
}
}
}



