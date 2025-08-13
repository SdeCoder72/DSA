package If_Else;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price: ");
        int sp = sc.nextInt();

        if(sp > cp) {
            int profit = sp - cp;
            int profitPercentage = profit * 100 / cp;
            System.out.println("Profit : " + profit + " " + profitPercentage + "%");
        }
        else if(cp > sp) {
            int loss = cp - sp;
            int lossPercentage = loss * 100 / cp;
            System.out.println("Loss : " + loss + " " + lossPercentage + "%");
        }
        else{
            System.out.println("No Profit No Loss");
        }

    }
}
