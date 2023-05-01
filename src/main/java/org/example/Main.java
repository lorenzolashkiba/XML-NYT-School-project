package org.example;

import org.example.sendEmail.Controller;

import java.util.Scanner;

public class Main {
    private static Controller controller;
    private static Scanner sc;
    private static int choice;
    private static String argument(Scanner sc){
        System.out.println("Choose the theme: Africa\n" +
                "Americas\n" +
                "ArtandDesign\n" +
                "Arts\n" +
                "AsiaPacific\n" +
                "Automobiles\n" +
                "Baseball\n" +
                "Books\n" +
                "Business\n" +
                "Climate\n" +
                "CollegeBasketball\n" +
                "CollegeFootball\n" +
                "Dance\n" +
                "Dealbook\n" +
                "DiningandWine\n" +
                "Economy\n" +
                "Education\n" +
                "EnergyEnvironment\n" +
                "Europe\n" +
                "FashionandStyle\n" +
                "Golf\n" +
                "Health\n" +
                "Hockey\n" +
                "HomePage\n" +
                "Jobs\n" +
                "Lens\n" +
                "MediaandAdvertising\n" +
                "MiddleEast\n" +
                "MostEmailed\n" +
                "MostShared\n" +
                "MostViewed\n" +
                "Movies\n" +
                "Music\n" +
                "NYRegion\n" +
                "Obituaries\n" +
                "PersonalTech\n" +
                "Politics\n" +
                "ProBasketball\n" +
                "ProFootball\n" +
                "RealEstate\n" +
                "Science\n" +
                "SmallBusiness\n" +
                "Soccer\n" +
                "Space\n" +
                "Sports\n" +
                "SundayBookReview\n" +
                "Sunday-Review\n" +
                "Technology\n" +
                "Television\n" +
                "Tennis\n" +
                "Theater\n" +
                "TMagazine\n" +
                "Travel\n" +
                "Upshot\n" +
                "US\n" +
                "Weddings\n" +
                "Well\n" +
                "World\n" +
                "YourMoney");
        System.out.print("Choose one option :");

        String theme =sc.nextLine();
        return theme;
    }
    public static void main(String[] args) {
        controller = new Controller();
        System.out.println("WELCOME BACK ADMIN");
        sc=new Scanner(System.in);
        do {
        System.out.println("Menu: \n 1.Send direct email\n 2.Exit program");
        System.out.print("Choose one option :");

        choice =sc.nextInt();

        switch (choice){
            case 1: {
                System.out.println("Option: \n 1.Use default email\n 2.Add custom email");
                System.out.print("Choose one option :");
                choice =sc.nextInt();
                switch (choice){
                    case 1: {
                        sc.nextLine();
                        String theme = argument(sc);
                        controller.sendDefaultEmail(theme);
                        break;
                    }
                    case 2: {
                        System.out.print("Write the email :");
                        String email = sc.nextLine();
                        email = sc.nextLine();
                        String theme = argument(sc);
                        controller.sendCustomEmail(email,theme);
                        break;
                    }

                }
            }
        }
        }while (choice!=2);

    }


}