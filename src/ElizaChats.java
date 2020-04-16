import java.util.Scanner;
public class ElizaChats {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String greeting = ("Nice to meet you, Hannah Snow, How has your day been?");
        String welcomemsg = ("Welcome to ElizaChats! My name is Eliza.");
        String question =("Okay, Anything in particular that makes you feel that It has been a splendid day?");
        String lstmsg = ("Okay, Well it has been my pleasure to speak with you. Have a nice day!");


        System.out.print(welcomemsg);
       System.out.print("What is your name? ");

        String name= sc.next();
        sc.nextLine();

        System.out.println("Hannah Snow");
        System.out.println(greeting);
        System.out.println("It has been a splendid day!");
        System.out.println(question);
        System.out.print("Yes, I got a job promotion :)");
        System.out.println(lstmsg);



    }
}
