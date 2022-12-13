import java.io.*;
import java.util.*;
import java.util.Arrays;
class Fibon{
    ArrayList<Integer> list=new ArrayList<Integer>();
    int range;
    int t;
    int n1=0,n2=1;
    int n3;
    int r,sum=0,temp; 
    int b; 

Fibon(int r){
    range=r;
    t=0;
    list.add(n1);
    list.add(n2);
}
void palindrome(){
    for(int i=2;i<range;i++){
      n3=n1+n2; 
      if(n3>=range) break;
      list.add(n3);    
      n1=n2;    
      n2=n3; 
      
    }
}
ArrayList<Integer> show(){
    return list;
}
void primeornot(int num){
    
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag)
      System.out.print(num + " is a prime number ");
    else
      System.out.print(num + " is not a prime number ");
}
}
public class Main{
public static void main(String args[]){
    ArrayList<Integer> arr=new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the range:");
    int ran = in.nextInt();
    Fibon ob=new Fibon(ran);
    ob.palindrome();
    arr=ob.show();
    for(int i:arr){
        ob.primeornot(i);
          
          int r,sum=0,temp;    
          int n=i; 
          temp=n;    
          while(n>0){    
           r=n%10;   
           sum=(sum*10)+r;    
           n=n/10;    
          }    
          if(temp==sum)    
           System.out.print("and is a palindrome number\n");    
          else    
           System.out.print("and is not palindrome number\n");    
         
    }
}
}
