package org.launchcode.java.studios.countcharacters;

import java.util.*;

public class CountCharacters {
    public static void main(String[] args) {
       // String sentence ="If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characters = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string:");
        String sentence = input.nextLine().toUpperCase();

        char[] charactersInString = sentence.toCharArray();
        for (int i = 0;i < charactersInString.length; i++) {
            if ( (charactersInString[i] >= 'A' && charactersInString[i] <= 'Z') || (charactersInString[i] >= 'a' && charactersInString[i] <= 'z')) {
                if (characters.containsKey(charactersInString[i])) {
                    int count = characters.get(charactersInString[i]);
                    characters.put(charactersInString[i], count + 1);
                } else {
                    characters.put(charactersInString[i], 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
