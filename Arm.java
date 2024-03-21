import java.util.*;
class Arm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int num=sc.nextInt();
        int rem,ans=0;
     int x=num;
      while(num!=0) {
       rem=num%10;
       ans= ans + rem*rem*rem;
     num=num/10;
}
  if(ans==x){

  System.out.println("armstrong number");
    }
    else{
     System.out.println("not a armstrong number");
    }
 }
}