import java.util.Scanner;

public class TwentyQuestions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play 20 questions. Choose a fast food chain and I will try to guess it!");

        System.out.println("Does it sell burgers (y/n)?");
        String answer = scan.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            // Burger places
            System.out.println("Does it have its own signature sauce (y/n)?");
            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                System.out.println("I guess In-N-Out!");
            } else {
                System.out.println("Is it open 24 hours (y/n)?");
                answer = scan.nextLine();

                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("I guess Jack in the Box!");
                } else {
                    System.out.println("I guess Burger King!");
                }
            }
        } else {
            // Not a burger place
            System.out.println("Do they sell fried chicken (y/n)?");
            answer = scan.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Do they sell different levels of spicy chicken (y/n)?");
                answer = scan.nextLine();

                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("I guess Dave's Hot Chicken!");
                } else {
                    System.out.println("Do they sell bone-in chicken (y/n)?");
                    answer = scan.nextLine();

                    if (answer.equalsIgnoreCase("y")) {
                        System.out.println("I guess Jollibee!");
                    } else {
                        System.out.println("Are they open on Sundays (y/n)?");
                        answer = scan.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            System.out.println("I guess Raising Cane's!");
                        } else {
                            System.out.println("I guess Chick-fil-A!");
                        }
                    }
                }
            } else {
                System.out.println("Do they sell ice cream (y/n)?");
                answer = scan.nextLine();

                if (answer.equalsIgnoreCase("y")) {
                    System.out.println("I guess Cold Stone!");
                } else {
                    System.out.println("Do they sell sandwiches (y/n)?");
                    answer = scan.nextLine();

                    if (answer.equalsIgnoreCase("n")) {
                        System.out.println("I guess Taco Bell!");
                    } else {
                        System.out.println("Is it build your own (y/n)?");
                        answer = scan.nextLine();

                        if (answer.equalsIgnoreCase("y")) {
                            System.out.println("I guess Subway!");
                        } else {
                            System.out.println("I guess Togo's!");
                        }
                    }
                }
            }
        }

        scan.close();
    }
}