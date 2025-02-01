package week4JavaCodingProject;

public class Java4CodingProject {

	public static void main(String[] args) {
		 // Step 1: Create an array of int called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // 1.a: Subtract the first element from the last element
        int ageDifference = ages[ages.length - 1] - ages[0];
        System.out.println("Difference between last and first age: " + ageDifference);

        // 1.b: Create a new array of int called ages2
        int[] ages2 = new int[9]; // 9 elements
        // Fill ages2 with some values
        ages2[0] = 5; ages2[1] = 10; ages2[2] = 20; ages2[3] = 65;
        ages2[4] = 1; ages2[5] = 12; ages2[6] = 30; ages2[7] = 100; ages2[8] = 50;

        // 1.b.ii: Subtract the first from the last element in ages2
        int age2Difference = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Difference between last and first age in ages2: " + age2Difference);

        // 1.c: Calculate average age
        double sumAges = 0;
        for (int age : ages) {
            sumAges += age;
        }
        double averageAge = sumAges / ages.length;
        System.out.println("Average age: " + averageAge);

        // Step 2: Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // 2.a: Calculate average number of letters per name
        double sumNameLengths = 0;
        for (String name : names) {
            sumNameLengths += name.length();
        }
        double averageNameLength = sumNameLengths / names.length;
        System.out.println("Average number of letters per name: " + averageNameLength);

        // 2.b: Concatenate names together
        StringBuilder allNames = new StringBuilder();
        for (String name : names) {
            allNames.append(name).append(" ");
        }
        System.out.println("Concatenated names: " + allNames.toString().trim());

        // 3: Access the last element of any array
        int lastElement = ages[ages.length - 1]; // Last element
        System.out.println("Last element of ages: " + lastElement);

        // 4: Access the first element of any array
        int firstElement = ages[0]; // First element
        System.out.println("First element of ages: " + firstElement);

        // 5: Create an array of int called nameLengths
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // 6: Calculate the sum of all elements in nameLengths
        int sumNameLengthsArray = 0;
        for (int length : nameLengths) {
            sumNameLengthsArray += length;
        }
        System.out.println("Sum of name lengths: " + sumNameLengthsArray);

        // 7: Method to concatenate a word n times
        System.out.println("Concatenated word: " + concatenateWord("Hello", 3));

        // 8: Method to return full name
        System.out.println("Full name: " + getFullName("John", "Doe"));

        // 9: Method that checks if sum of array is greater than 100
        int[] someInts = {50, 60, 10};
        System.out.println("Is the sum of the array greater than 100? " + isSumGreaterThan100(someInts));

        // 10: Method to calculate average of an array of double
        double[] someDoubles = {10.5, 20.5, 30.5};
        System.out.println("Average of doubles: " + calculateAverage(someDoubles));

        // 11: Method to compare averages of two arrays
        double[] array1 = {10.0, 20.0};
        double[] array2 = {15.0, 15.0};
        System.out.println("Is the average of array1 greater than array2? " + isAverageGreater(array1, array2));

        // 12: Method to determine if a drink can be bought
        System.out.println("Will buy drink: " + willBuyDrink(true, 15.0));

        // 13: Custom method to count vowels in a string
        String testString = "Hello World";
        System.out.println("Number of vowels in '" + testString + "': " + countVowels(testString));
    }

    // 7: Method to concatenate a word n times
    public static String concatenateWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

    // 8: Method to return full name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9: Method to check if sum of array is greater than 100
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    // 10: Method to calculate average of an array of double
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // 11: Method to compare averages of two arrays
    public static boolean isAverageGreater(double[] array1, double[] array2) {
        return calculateAverage(array1) > calculateAverage(array2);
    }

    // 12: Method to determine if a drink can be bought
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    // 13: Custom method to count vowels in a string
    // This method counts the number of vowels in a given string and returns the count.
    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;

	}

}
