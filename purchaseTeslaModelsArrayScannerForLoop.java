package CompletedProjects;

import java.util.Scanner;

public class purchaseTeslaModelsArrayScannerForLoop {
    public static void main(String[] args) {

        // Create a program to display a menu of Tesla Cars and their price together. Allow user to see the menu of models
        // and select a car they would like to purchase and display the car name and price

        // what do we need? : Print statement, array to store the car names, array to store car prices
        // logic of for loops to print out what the user wants to select based on their response.
        Scanner scanner = new Scanner(System.in);
        String [] teslaSelection = {"Model 3","Model Y","Model S","Model X","Cybertruck","Roadster"};
        double [] teslaSelectionPrice = {30000, 40000, 50000, 60000, 75000, 100000};
        System.out.println("Welcome to Tesla. We have a couple of models on the lot you can drive away with today.");
        System.out.print("Are you interested in purchasing a tesla today? (yes/no):");
        String userInterestResponseString= scanner.nextLine().trim();
        boolean userInterestResponseConvertBoolean= userInterestResponseString.equalsIgnoreCase("Yes"); // This converts the "yes" that the user responds
        //into a boolean true/false logic while ignoring casing

        if (userInterestResponseConvertBoolean)
        {
            System.out.print ("Sounds like you're interested!");
            System.out.println(" Here is what we have available today and the price for each model: ");
            for (int i =0; i <teslaSelection.length; i++)
            {
                System.out.println((i+1)+ ". "+teslaSelection[i] + " - $"+ teslaSelectionPrice[i]);
            }

            System.out.print("Are you interested in purchasing any of these models? (yes/no): ");
            String userInterestResponse2 = scanner.nextLine().trim();
            userInterestResponseConvertBoolean = userInterestResponse2.equalsIgnoreCase("Yes");

            if (userInterestResponseConvertBoolean)
            {
                System.out.println("Please enter the number of the model you are purchasing today: ");
                int userSelectedModelNumber = scanner.nextInt();

                if (userSelectedModelNumber>=1&&userSelectedModelNumber<=teslaSelection.length)
                {
                    String finalTeslaSelectionModel = teslaSelection[userSelectedModelNumber-1];
                    double finalTeslaSelectedPrice = teslaSelectionPrice[userSelectedModelNumber-1];

                    System.out.println("Congratulations on your " + finalTeslaSelectionModel + "! We know you will love it!");
                    System.out.println("The purchase total of the car is $"+ finalTeslaSelectedPrice);
                } else {
                    System.out.println("Please input a valid number so we know what car you will purchase. Re-attempt purchase.");
                }

            } else
            {
                System.out.println("Sounds like nothing caught your eye. Come back again soon!");
            }




        } else
        {
            System.out.println("Sounds like you're not interested. You're welcome to come again soon! ");
        } scanner.close();


    }
}
