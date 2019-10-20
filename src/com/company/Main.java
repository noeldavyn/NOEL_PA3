package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();

        for (int x = 0; x <= 10; x++) {
            int num1 = randomNumbers.nextInt(10);
            int num2 = randomNumbers.nextInt(10);
            int num3 = 0;

            while (num3 != (num1 * num2)) {
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                num3 = input.nextInt();
                int phraseChoice = randomNumbers.nextInt(4);  // Used for Switch case in phrase selection for correct/incorrect
                if (num3 == num1 * num2)
                    switch (phraseChoice) {
                        case 1: System.out.println("Very Good!");
                            break;
                        case 2: System.out.println("Excellent!");
                            break;
                        case 3: System.out.println("Nice work!");
                            break;
                        case 4: System.out.println("Keep trying!");
                            break;
                }
                else
                    switch (phraseChoice) {
                        case 1: System.out.println("No. Please try again.");
                            break;
                        case 2: System.out.println("Wrong. Try once more.");
                            break;
                        case 3: System.out.println("Don't give up!");
                            break;
                        case 4: System.out.println("No. Keep trying!");
                            break;
                }
            }
            x++;

        }
    }
}