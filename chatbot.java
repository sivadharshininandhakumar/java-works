import java.util.Scanner;

public class SimpleChatbot {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hi there! Ask me a question.");
        String userInput = scanner.nextLine();
        
        if (userInput.contains("hello") || userInput.contains("hi")) {
            System.out.println("Hello! How can I help you?");
        } else if (userInput.contains("how are you")) {
            System.out.println("I'm just a bot, but thanks for asking!");
        } else {
            System.out.println("I'm sorry, I don't understand that question.");
        }
        
        scanner.close();
    }
}
