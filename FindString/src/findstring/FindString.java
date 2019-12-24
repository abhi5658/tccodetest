package findstring;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */
public class FindString {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String inputText = sc.nextLine();
//        String searchText = sc.nextLine();
        String inputText = "abrakadabra";
        String searchText = "aka";
        
        int j = 0,i=0;
        int found = 0;
        
        int inputSize = inputText.length();
        int searchSize = searchText.length();
        
        for (i = 0; i < inputSize - searchSize + 1; i++) {//checking till search word can exist till last character in input
            
            if (inputText.charAt(i) == searchText.charAt(0) && 
                    inputText.charAt(i + searchSize - 1) == searchText.charAt(searchSize - 1)) {//checking first and last characters if present at a position

                for (j = 1; j < searchSize - 1; j++) {//checking middle ch's of search string inside  the found part
                    //binary search can be implemented here to check characters
                    if (inputText.charAt(i + j) != searchText.charAt(j))//if anytime character does not match, break
                        break;
                }
            }
            
            if (j == searchSize - 1) {//if after completing loop j has iterated fully then found
                found = 1;
                break;
            }
        }
        if(found == 1)
            System.out.print(""+i);
        else
            System.out.print("-1");
    }
}
