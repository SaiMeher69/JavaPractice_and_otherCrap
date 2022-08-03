
public class Spaces {
    public static void main(String[] args){
        String spaces = "hello    World";
        String newspaces = spaces.replaceAll("\\s+"," ");
        System.out.println(spaces + "\n" + newspaces);
    }    
}
