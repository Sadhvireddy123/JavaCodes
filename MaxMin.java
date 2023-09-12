import java.util.*;
public class MaxMin{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];
for(int i=0;i<arr.length;i++){
arr[i] = sc.nextInt();
}
int[] ans = maxMin(arr);
System.out.println(Arrays.toString(ans));
}

static int[] maxMin(int[] arr){
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
for(int i=0;i< arr.length ;i++){
 if(arr[i] > max){
 max = arr[i];
 }
 if(arr[i] < min){
 min = arr[i];
 }
 }
 return new int[]{max,min};
 } 
 }
