/// palindrome.java 
//
// fall 2025
// lab4b assignment
//
//  Earl Garner
//
// Use for paindrome.java

public class Palindrome {
    
    public static void main(String[] args) {

        //single call to test
        System.out.println( palindrome("racecar") ); //true
        System.out.println( palindrome("sass") ); //false

        //uncomment to test additional words
        String words[] = { "a", "racecar", "noon", "hannah", "abcba", "abbca", "nope", "ab" };

        for (int i = 0; i < words.length; i++) {

            if (palindrome(words[i]) == true)
                System.out.println( words[i] + " IS a palindrome");
            else
                System.out.println( words[i] + " IS NOT a palindrome");
        }
        
    }// main

    
    // *** use StackCharArray and QueueCharArray here to determine Palindrome
    public static boolean palindrome(String word) {
        StackCharArray Stack = new StackCharArray(word.length());
        QueueCharArray Queue = new QueueCharArray(word.length());

        //assume status is true
        boolean status = true;
        
        for (int i = 0; i < word.length(); i++){
            Stack.push(word.charAt(i));
            Queue.add(word.charAt(i));
        }

        while (!Stack.empty() && status == true){
            if (Stack.top() != Queue.front()){
                status = false;
            } else {
                Stack.pop();
                Queue.remove();
            }

        }

        return status;
        
    }// palindrome method

}//class
