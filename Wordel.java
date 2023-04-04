import java.util.*;
import java.io.*;
class Wordel
{
    public static void main()
    {
        char letter, letter_guess, other_letters; 
        boolean flag = false;
        String word, guess;
        char guess_letters[] = new char[5];
        char correct_letters[] = new char[5];
        char result[] = new char[5];
        String words[] = {"hello", "aubur", "oxide", "lolla", "aoink"};
        Scanner sc = new Scanner(System.in);
        double random = Math.random() * (words.length - 1) + 1;
        word = words[(int)random];
        for(int i = 0; i < 5; i++)
        {
                correct_letters[i] = word.charAt(i);
        }
        for(int i = 1; i <= 6; i++)
        {
            System.out.println("Guess: ");
            guess = sc.next();
            if(guess.length() > 5)
            {
                System.out.println("The word you entered was too long.");
                break;
            }
            for(int j = 0; j < 5; j++)
            {
                flag = false;
                if(guess.charAt(j) == word.charAt(j))
                {
                    result[j] = word.charAt(j);
                }
                else if(guess.charAt(j) != word.charAt(j))
                {
                    for(int k = j+1; k < 5; k++)
                    {
                        if(guess.charAt(k) == word.charAt(k))
                        {
                            flag = true;
                            break;
                        }
                    }
                    if(flag == true)
                    {
                        result[j] = '_';
                    }
                    else if(flag == false)
                    {
                        result[j] = '*';
                    }
                    flag = false;
                }
            }
            for(int q = 0; q < 5; q++)
            {
                System.out.print(result[q]);
            }
            System.out.println();
            if(guess.equals(word))
            {
                System.out.println("Yay!");
                break;
            }
        }
        System.out.println("The correct word is: "+word);
    }
}