package midtermexam_versiona_extensioncode;
import java.util.Scanner;
public class TestUserprofile{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in)
        UserProfile c=new UserProfile("", "");
        System.out.println("Enter User ID: ");
        String userId=in.nextLine();
        System.out.println("Available Genre:");
        for (String string : c.genres) {
            System.out.println(string);
        }
        
        System.out.println("Input: ");
        String genre=in.nextLine();
        c.setGenre(genre);
        c.setUserID(userId);
        
        System.out.println("Profile created successfully");
    }
}