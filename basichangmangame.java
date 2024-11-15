import java.util.Scanner;

class Hangman {
    public static void main(String[] args) {
        String[] words = {"java", "programming", "hangman", "developer", "code"};
        String word = words[(int) (Math.random() * words.length)]; 
        StringBuilder guessedWord = new StringBuilder("_".repeat(word.length())); 
        int attempts = 6;
        boolean isWordGuessed = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        System.out.println("You have " + attempts + " attempts to guess the word.");
        System.out.println(guessedWord);

        while (attempts > 0 && !isWordGuessed) {
            System.out.print("Enter a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
               
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                    }
                }
                System.out.println("Correct! " + guessedWord);
            } else {
                
                attempts--;
                System.out.println("Wrong! You have " + attempts + " attempts left.");
            }

            if (guessedWord.toString().equals(word)) {
                isWordGuessed = true;
            }
        }

        if (isWordGuessed) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Game Over! The word was: " + word);
        }

        scanner.close();
    }
}

 