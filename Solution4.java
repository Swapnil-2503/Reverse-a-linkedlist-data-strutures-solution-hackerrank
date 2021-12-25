import java.util.*;

public class Solution3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        LinkedList s=new LinkedList<>();
        int[] a=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
               for(int j=i+0;j<a[i]+i;j++){
                   s.add(sc.nextInt());
               }
        }
        int c=0;
        for(int i=0;i<t;i++){
            
            c+=a[i];
            for(int j=c-1;j>=c-a[i];j--){     
            System.out.print(s.get(j));
            System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
