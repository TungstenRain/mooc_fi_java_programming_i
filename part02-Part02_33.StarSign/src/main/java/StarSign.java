/**
 * Part 1: Define a method called printStars that prints the given number of 
 * stars and a line break.
 * 
 * Part 2: Define a method called printSquare(int size) that prints a suitable 
 * square with the help of the printStars method. 
 * 
 * Part 3: Write a method called printRectangle(int width, int height) that 
 * prints the correct rectangle by using the printStars method. 
 * 
 * Part 4: Create a method called printTriangle(int size) that prints a 
 * triangle by using the printStars method. 
 * 
 * 
 * @author frank
 */
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    /**
     * Print the number of given stars
     * @param number int
     */
    public static void printStars(int number) {
        // Loop to count out stars
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    /**
     * Print the number of given stars in a square
     * @param size int
     */
    public static void printSquare(int size) {
        // Loop to print square
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        // Loop to print rectangle
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        // Loop to print triangle
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
