import java.util.Scanner;

public class SuperheroRoster
{
    public static void main(String[] args)
    {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
 
        // Example:
        // String[] heroNames = {...};
        // String[] abilities = {...};
        // int[] powerLevels = {...};

        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat"};
        int[] powerLevels = {85, 90, 80};

        // 2. Print each hero's details using a loop
        // for (int i = 0; i < heroNames.length; i++) { ... }

        for (int i = 0; i < heroNames.length; i++)
        {
            System.out.println(heroNames[i]);
            for (int j = 0; j < abilities.length; j++)
            {
                System.out.println(abilities[j]);
                for (int k = 0; k < powerLevels.length; k++)
                {
                    System.out.println(powerLevels[k]);
                }
            }
        }
        // 3. Call the searchHero method to find a specific hero by name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the hero to search for: ")
        String target = input.nextLine();
        searchHero(heroNames, abilities, powerLevels, target) //target = what wer're trying to find in the searchHero method
        // 4. Calculate and display the average power level by calling calculateAveragePower method
        double avgPL = calculateAveragePower(powerLevels);
        System.out.println("Average Power Level: " + avgPL);

    }
 
    // Method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) 
    {
        // Implement a loop to search for the hero by name
        // If found, print the hero's details
        // If not found, display a message
        for (int i = 0; i < heroNames.length; i++)
        {
            if (heroNames[i].equals(target))
            {
                System.out.println(heroNames[i]);
                System.out.println(abilities[i]);
                System.out.println(powerLevels[i]);
                break;
            }
            else
            {
                System.out.println("Hero not found.")
            }
        }
    }
 
    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) 
    {
        // Implement the calculation for average power level
        // Return the calculated average

        double aPL = 0.0
        for (int i = 0; i < powerLevels.length; i++)
        {
            int tPL += powerLevels[i];
        }

        aPL = tPl / powerLevels.length;
        return aPL; // Placeholder return value
    }
}

class Superhero 
{
    // Declare attributes: name, ability, and powerLevel
    
    // Constructor to initialize name, ability, and powerLevel
 
    // Method: displayHero
    public void displayHero() {
        // Print the hero's name, ability, and power level
    }
}