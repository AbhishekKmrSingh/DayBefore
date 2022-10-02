import java.util.Scanner;
public class LastDayBeforeNday {
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        int d=s.nextInt();
        int n= s.nextInt();
        int x=n%7;
        int ans = d-x;
        if(ans>0){
            System.out.println(ans);
        }
        else {
            System.out.println(ans+7);
            }
        }

    }
