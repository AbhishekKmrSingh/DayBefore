import java.util.Scanner;
public class LastDayBeforeNday {
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter Current Day number"); /* 0=sunday, 1=monday, 2= tuesday, 3= wednesday, 4=thursday, 5=friday, 6=saturday*/
        int d=s.nextInt();
         System.out.println("Enter Day-Before number");
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
