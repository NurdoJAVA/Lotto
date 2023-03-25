import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String theWord = "ZHONY";
        char[] word = theWord.toCharArray();
        String letter = "";
        char[] lengthOfWord = new char[word.length];
        for (int i = 0; i < lengthOfWord.length; i++) {
            lengthOfWord[i] = '_';
        }
        int chance = 3;

        while(chance > 0) {
            System.out.println("\nThis is your word\"YOU HAVE THREE CHANCES TO GUESS  THE WORD\"");
            System.out.println(lengthOfWord);
            System.out.print("Guess the letter: ");
            letter = input.next();

            if (theWord.contains(letter.toLowerCase()) || theWord.contains(letter.toUpperCase())) {
                for (int i = 0; i < theWord.length(); i++) {
                    if (theWord.charAt(i) == letter.toUpperCase().charAt(0)) {
                        lengthOfWord[i] = letter.toUpperCase().charAt(0);
                    }
                }
                System.out.println("Your guess is RIGHT");
                System.out.println("You have "+ chance + "more chances");
            }
            else {
                chance--;
                System.out.println("Your Guess Is WRONG");
                if (chance == 0) {
                    System.out.println("You have no more chance" + "\nThe word was " + theWord);
                    break;
                }else {
                    System.out.println("You have " + chance + " more chances");
                }
            }
        }
    }
}