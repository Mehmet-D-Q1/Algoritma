package algoritm;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            System.out.println(areBalancedSymbols(input));
            if(areBalancedSymbols(input)){
                System.out.println("Balanced");
            }
            else {
                System.out.println("Unbalanced");
            }
        }
    }

    public static boolean areBalancedSymbols(String symbols) {
        Stack<Character> stackSymbols = new Stack<Character>();
        char[] charElement = symbols.toCharArray();
        for (int i = 0; i < charElement.length; i++) {
            if (charElement[i] == '(' || charElement[i] == '{' || charElement[i] == '[') {
                stackSymbols.push(charElement[i]); //Add top of the stackSymbols

            } else {
                if (stackSymbols.isEmpty()) { //we checked because user can entered "}{" symbol at first. if it was, stackSymbols would be empty.
                    return false;
                } else {
                    if (charElement[i] == ')' && stackSymbols.peek() == '(' && !stackSymbols.isEmpty()) {
                        stackSymbols.pop();
                        continue;
                    } else if (charElement[i] == '}' && stackSymbols.peek() == '{' && !stackSymbols.isEmpty()) {
                        stackSymbols.pop();
                        continue;
                    } else if (charElement[i] == ']' && stackSymbols.peek() == '[' && !stackSymbols.isEmpty()) {
                        stackSymbols.pop();
                        continue;
                    } else {
                        return false;
                    }
                }


            }

        }

        return stackSymbols.isEmpty(); //it means that deleted all stackSymbols elements so that is balanced state



    }
}
