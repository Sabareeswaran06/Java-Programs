import java.util.Scanner;

class VotingSystem {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int numOfCandidates = 3;
        int[] votes = new int[numOfCandidates];
        String[] candidates = {"Alice", "Bob", "Charlie"};
        int totalVoters = 5;  
        System.out.println("Welcome to the voting system!");
        System.out.println("There are " + numOfCandidates + " candidates:");
        for (int i = 0; i < numOfCandidates; i++) {
            System.out.println((i + 1) + ". " + candidates[i]);
        }
        

        for (int i = 1; i <= totalVoters; i++) {
            System.out.println("\nVoter " + i + ":");
            System.out.print("Please enter the number of your chosen candidate (1, 2, or 3): ");
            int vote = scanner.nextInt();
            
            
            if (vote >= 1 && vote <= numOfCandidates) {
                votes[vote - 1]++;  
                System.out.println("Vote registered successfully for " + candidates[vote - 1]);
            } else {
                System.out.println("Invalid vote! Please choose a valid candidate number (1, 2, or 3).");
                i--;  
            }
        }
        
        
        System.out.println("\nVoting Results:");
        for (int i = 0; i < numOfCandidates; i++) {
            System.out.println(candidates[i] + " received " + votes[i] + " votes.");
        }
        int maxVotes = -1;
        String winner = "";
        for (int i = 0; i < numOfCandidates; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winner = candidates[i];
            }
        }
        
        System.out.println("\nThe winner is: " + winner + " with " + maxVotes + " votes!");
        

        scanner.close();
    }
}
