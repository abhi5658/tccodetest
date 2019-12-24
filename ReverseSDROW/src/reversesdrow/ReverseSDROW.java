package reversesdrow;

/**
 *
 * @author Abhishek
 */
public class ReverseSDROW {

    public static void main(String[] args) {
        
        String inputString = "This is a sTring";
        
        int sizeOfInputString = inputString.length();
        char currentCharacter;
        String reverseString = "", currentWord = "";
        
        for (int i = 0; i < sizeOfInputString; i++) {
            currentCharacter = inputString.charAt(i);
            
            if (currentCharacter == ' ') {//delimiter space
                reverseString += currentWord + currentCharacter;//add the current reversed word to old reversed string
                currentWord = "";
            } else {
                currentWord = currentCharacter + currentWord;//or just keep making the reverse word
            }
        }
        reverseString += currentWord;//adding the final word
        System.out.println(""+reverseString);
    }
}
