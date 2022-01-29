package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
	    double copyCharge = 0.05;
        double copyChargePastFifty = 0.04;

        double discount = 0;
        System.out.println("Enter amount of copies you want to print");
        int numCopies = scanner.nextInt();
        double charge = 0;
        if(numCopies <= 50)
        {
            charge = copyCharge * numCopies;
        }
        else if(numCopies > 50 && numCopies <= 99)
        {
            charge = copyChargePastFifty * numCopies;
        }
        else if (numCopies > 99 && numCopies <= 300)
        {
            /*
            ? discount 5%
             */
            charge = copyChargePastFifty * numCopies;
            discount = charge - (charge * 0.05);

            //System.out.print("test");
        }
        else
        {
            /*
            ! 400 copies
            ? discount 10%
             */
            charge = copyChargePastFifty * numCopies;
            discount = charge - (charge * 0.10);
        }
        System.out.printf("Your charge cost %.2f With discount if applies %.2f",charge,discount);

    }
}
