import java.util.Scanner;

class QuizApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest animal on Earth?",
            "Who wrote 'Harry Potter'?",
            "What is the square root of 64?"
        };
        

        String[][] options = {
            {"1. Paris", "2. London", "3. Berlin", "4. Madrid"},
            {"1. Earth", "2. Mars", "3. Venus", "4. Jupiter"},
            {"1. Elephant", "2. Blue Whale", "3. Giraffe", "4. Shark"},
            {"1. J.R.R. Tolkien", "2. J.K. Rowling", "3. George R.R. Martin", "4. Suzanne Collins"},
            {"1. 6", "2. 7", "3. 8", "4. 9"}
        };
        
        
        int[] correctAnswers = {1, 2, 2, 2, 3}; 
        
        int score = 0;
        
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            
            
            for (String option : options[i]) {
                System.out.println(option);
            }
            
            
            System.out.print("Enter your answer (1/2/3/4): ");
            int userAnswer = scanner.nextInt();
            
            
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is option " + correctAnswers[i] + ".\n");
            }
        }
        
        
        System.out.println("Your final score is: " + score + " out of " + questions.length);
        
        scanner.close();
    }
}
