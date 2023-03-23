public class Quiz {
    public static void main(String[] args)
    {

    }

    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/
    public static int numberOfVowels(String inputString)
    {
        int numOfVowels = 0;
        int compare;
        char[] charArray = inputString.toLowerCase().toCharArray();
        for(char currChar : charArray)
        {
            compare = Character.compare(currChar, 'a');
            if(compare == 0)
            {
                numOfVowels++;
            }
            else
            {
                compare = Character.compare(currChar, 'e');
                if(compare == 0)
                {
                    numOfVowels++;
                }
                else
                {
                    compare = Character.compare(currChar, 'i');
                    if(compare == 0)
                    {
                        numOfVowels++;
                    }
                    else
                    {
                        compare = Character.compare(currChar, 'o');
                        if(compare == 0)
                        {
                            numOfVowels++;
                        }
                        else
                        {
                            compare = Character.compare(currChar, 'u');
                            if(compare == 0)
                            {
                                numOfVowels++;
                            }
                        }
                    }
                }
            }
        }

        return numOfVowels;
    }

    /** 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/
    public static int notDivisibleBy235(int number)
    {
        int numNotDivided = 0;
        for (int i = 0; i <= number; i++)
        {
            if(i % 2 != 0)
            {
                if(i % 3 != 0)
                {
                    if(i % 5 != 0)
                    {
                        numNotDivided++;
                    }
                }
            }
        }

        return numNotDivided;
    }


    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/
    public static String camelCaseMe(String inputString)
    {
        StringBuilder newString = new StringBuilder();
        boolean firstCharacterYet = false;
        boolean notAlphabet = false;
        for (int i = 0; i < inputString.length(); i++)
        {
            if((inputString.toLowerCase().charAt(i) >= 97) && (inputString.toLowerCase().charAt(i) <= 122))
            {
                if(!firstCharacterYet && !notAlphabet)
                {
                    firstCharacterYet = true;
                    newString.append(inputString.charAt(i));
                }
                else if(notAlphabet)
                {
                    newString.append(inputString.toUpperCase().charAt(i));
                }
                else
                {
                    newString.append(inputString.toLowerCase().charAt(i));
                }
                notAlphabet = false;
            }
            else
            {
                notAlphabet = true;
            }
        }

        return newString.toString();
    }

}