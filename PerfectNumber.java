import java.util.*;
class PerfectNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int ans=0,n,i;
    n=sc.nextInt();
   for( i=1;i<n;i++){
  if(n%i==0){
  ans=ans+i; 
}
}
if(n==ans){
  System.out.println("it is a perfect number");
  }
else{
System.out.println("not a perfect number");
  }
}
}
