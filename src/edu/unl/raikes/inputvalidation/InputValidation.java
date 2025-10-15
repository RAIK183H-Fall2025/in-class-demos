package edu.unl.raikes.inputvalidation;

import java.util.Scanner;

/**
 * Library class of functions that perform text-based input validation. Input is read from Scanner objects, which are
 * not stored and must be passed into each function.
 */
public class InputValidation {
    /**
     * The string to add after the prompt, so the cursor moves forward some number of spaces.
     */
    private static final String AFTER_PROMPT_SPACE = " ";

    /**
     * Determines whether a given String is made up entirely of digits with an optional '-' in the first position.
     * 
     * @param  s the string whose parse-ability is in question
     * @return   true if s is made up entirely of digits, with an optional '-' in the first position, false otherwise
     */
    public static boolean canParseInt(String s) {
        // handle empty strings or strings with a single '-' and no digit
        boolean emptyString = s.length() == 0;
        boolean dashOnly = "-".equals(s);
        if (emptyString || dashOnly) {
            return false;
        }

        // check every char of s
        for (int i = 0; i < s.length(); i++) {
            // is this character a digit or a negative sign? if not, we cannot parse. return false.
            boolean isDigit = Character.isDigit(s.charAt(i));
            boolean isNegative = i == 0 && s.charAt(i) == '-';
            if (!isDigit && !isNegative) {
                return false;
            }
        }

        // every digit must either be a - or a digit, so it can be considered an int.
        return true;
    }

    /**
     * Determines whether a given String is made up entirely of digits with an optional '-' in the first position and a
     * '.'.
     * 
     * @param  s the string whose parse-ability is in question
     * @return   true if s is made up entirely of digits, with an optional '-' in the first position and a '.', false
     *           otherwise.
     */
    public static boolean canParseDouble(String s) {
        // handle empty strings or strings with a single '-' and no digit
        boolean emptyString = s.length() == 0;
        boolean dashOnly = "-".equals(s);
        if (emptyString || dashOnly) {
            return false;
        }

        // check every char of s
        for (int i = 0; i < s.length(); i++) {
            // is this character a digit or a negative sign? if not, we cannot parse. return false.
            boolean isDigitOrPeriod = Character.isDigit(s.charAt(i)) || '.' == (s.charAt(i));
            boolean isNegative = i == 0 && s.charAt(i) == '-';
            if (!isDigitOrPeriod && !isNegative) {
                return false;
            }
        }

        // every digit must either be a - or a digit, so it can be considered an int.
        return true;
    }

    /**
     * Determines whether a given String is only one character'.
     * 
     * @param  s the string whose parse-ability is in question
     * @return   true if s is one character, false otherwise
     */
    public static boolean canParseChar(String s) {
     // handle empty strings or strings with a single '-' and no digit
        boolean lengthOne = s.length() == 1;
        if (lengthOne) {
            return true;
        }

        
        return false;
    }

    /**
     * Prompts a user for an integer value and ensures that the user provides viable input. Caller must provide the
     * initial user prompt message (e.g., "Please enter an integer.") and the user re-prompt message (e.g., "That wasn't
     * an integer. Please try again.").
     * 
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided int
     */
    public static int queryInt(Scanner scnr, String promptMessage, String repromptMessage) {

        System.out.print(promptMessage + AFTER_PROMPT_SPACE);
        String response = scnr.nextLine();

        while (!canParseInt(response)) {
            System.out.print(repromptMessage + AFTER_PROMPT_SPACE);
            response = scnr.nextLine();
        }

        int queriedInt = Integer.parseInt(response);

        return queriedInt;
    }
    
    
    
    public static int queryPosInt(Scanner scnr, String promptMessage, String repromptMessage) {

        System.out.print(promptMessage + AFTER_PROMPT_SPACE);
        String response = scnr.nextLine();

        while (!canParseInt(response) && Integer.parseInt(response) >= 0) {
            System.out.print(repromptMessage + AFTER_PROMPT_SPACE);
            response = scnr.nextLine();
        }

        int queriedInt = Integer.parseInt(response);

        return queriedInt;
    }
    
    

    /**
     * Requests an integer from the console user. Prompts a user for an integer value and ensures that the user provides
     * viable input. Caller must provide the initial user prompt message (e.g., "Please enter an integer.") and the user
     * re-prompt message (e.g., "That wasn't an integer. Please try again."). Additionally, this function ensures that
     * the user's int is included in an array of acceptable values. If their input is not in the list, the user will be
     * reprompted.
     * 
     * @param  options         The list of acceptable int values (any user inputted int not in this list will be
     *                         rejected)
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided int
     */
    public static int queryIntFromOptions(int[] options, Scanner scnr, String promptMessage, String repromptMessage) {
        // get an int from the user
        int queriedInt = queryInt(scnr, promptMessage, repromptMessage);

        // now we have an int, but is it one of the ints in our options array?
        while (!valueIsInArray(options, queriedInt)) {
            // we want both messages to be the re-prompt message, since every prompt from this point is a reprompt
            queriedInt = queryInt(scnr, repromptMessage, repromptMessage);
        }

        return queriedInt;
    }

    /**
     * Prompts a user for an double value and ensures that the user provides viable input. Caller must provide the
     * initial user prompt message (e.g., "Please enter an double.") and the user re-prompt message (e.g., "That wasn't
     * an double. Please try again.").
     * 
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided double
     */
    public static double queryDouble(Scanner scnr, String promptMessage, String repromptMessage) {
        
        System.out.print(promptMessage + AFTER_PROMPT_SPACE);
        String response = scnr.nextLine();

        while (!canParseDouble(response)) {
            System.out.print(repromptMessage + AFTER_PROMPT_SPACE);
            response = scnr.nextLine();
        }

        double queriedDouble = Double.parseDouble(response);

        return queriedDouble;
        
       
    }

    /**
     * Requests an double from the console user. Prompts a user for an double value and ensures that the user provides
     * viable input. Caller must provide the initial user prompt message (e.g., "Please enter an double.") and the user
     * re-prompt message (e.g., "That wasn't an double. Please try again."). Additionally, this function ensures that
     * the user's double is included in an array of acceptable values. If their input is not in the list, the user will be
     * reprompted.
     * 
     * @param  options         The list of acceptable double values (any user inputted double not in this list will be
     *                         rejected)
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided double
     */
    public static double queryDoubleFromOptions(double[] options, Scanner scnr, String promptMessage,
            String repromptMessage) {
     // get an double from the user
        double queriedDouble = queryDouble(scnr, promptMessage, repromptMessage);

        // now we have an double, but is it one of the double in our options array?
        while (!valueIsInArray(options, queriedDouble)) {
            // we want both messages to be the re-prompt message, since every prompt from this point is a reprompt
            queriedDouble = queryDouble(scnr, repromptMessage, repromptMessage);
        }

        return queriedDouble;
    }

    /**
     * Prompts a user for an char value and ensures that the user provides viable input. Caller must provide the
     * initial user prompt message (e.g., "Please enter an char.") and the user re-prompt message (e.g., "That wasn't
     * an char. Please try again.").
     * 
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided char
     */
    public static char queryChar(Scanner scnr, String promptMessage, String repromptMessage) {
        System.out.print(promptMessage + AFTER_PROMPT_SPACE);
        String response = scnr.nextLine();

        while (!canParseChar(response)) {
            System.out.print(repromptMessage + AFTER_PROMPT_SPACE);
            response = scnr.nextLine();
        }

        char queriedChar = response.charAt(0);

        return queriedChar;
    }

    /**
     * Requests an char from the console user. Prompts a user for an char value and ensures that the user provides
     * viable input. Caller must provide the initial user prompt message (e.g., "Please enter an char.") and the user
     * re-prompt message (e.g., "That wasn't an char. Please try again."). Additionally, this function ensures that
     * the user's char is included in an array of acceptable values. If their input is not in the list, the user will be
     * reprompted.
     * 
     * @param  options         The list of acceptable char values (any user inputted char not in this list will be
     *                         rejected)
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided char
     */
    public static char queryCharFromOptions(char[] options, Scanner scnr, String promptMessage,
            String repromptMessage) {
     
        char queriedChar = queryChar(scnr, promptMessage, repromptMessage);

        // now we have an int, but is it one of the ints in our options array?
        while (!valueIsInArray(options, queriedChar)) {
            // we want both messages to be the re-prompt message, since every prompt from this point is a reprompt
            queriedChar = queryChar(scnr, repromptMessage, repromptMessage);
        }

        return queriedChar;
    }

    /**
     * Prompts a user for an String value and ensures that the user provides viable input. Caller must provide the
     * initial user prompt message (e.g., "Please enter an string.") and the user re-prompt message (e.g., "That wasn't
     * an string. Please try again.").
     * 
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided string
     */
    public static String queryString(Scanner scnr, String promptMessage, String repromptMessage) {
        System.out.print(promptMessage + AFTER_PROMPT_SPACE);
        String response = scnr.nextLine();

       

        String queriedString = response;

        return queriedString;
    }

    /**
     * Requests an string from the console user. Prompts a user for an string value and ensures that the user provides
     * viable input. Caller must provide the initial user prompt message (e.g., "Please enter an string.") and the user
     * re-prompt message (e.g., "That wasn't an string. Please try again."). Additionally, this function ensures that
     * the user's string is included in an array of acceptable values. If their input is not in the list, the user will be
     * reprompted.
     * 
     * @param  options         The list of acceptable string values (any user inputted string not in this list will be
     *                         rejected)
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided string
     */
    public static String queryStringFromOptions(String[] options, Scanner scnr, String promptMessage,
            String repromptMessage) {
     // get an int from the user
        String queriedString = queryString(scnr, promptMessage, repromptMessage);

        // now we have an int, but is it one of the ints in our options array?
        while (!valueIsInArray(options, queriedString)) {
            // we want both messages to be the re-prompt message, since every prompt from this point is a reprompt
            queriedString = queryString(scnr, repromptMessage, repromptMessage);
        }

        return queriedString;
        
    }

/**
 *  * Prompts a user for an char value and ensures that the user provides viable input. Caller must provide the
     * initial user prompt message (e.g., "Please enter an char.") and the user re-prompt message (e.g., "That wasn't
     * an char. Please try again.").
     * 
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided char
     */
    public static char queryLetter(Scanner scnr, String promptMessage, String repromptMessage) {
        System.out.print(promptMessage + AFTER_PROMPT_SPACE);
        String response = scnr.nextLine();

        while (!canParseChar(response) || !Character.isLetter(response.charAt(0))) {
            System.out.print(repromptMessage + AFTER_PROMPT_SPACE);
            response = scnr.nextLine();
        }

        char queriedLetter = response.charAt(0);

        return queriedLetter;
    }

    /**
     * Requests an char from the console user. Prompts a user for an char value and ensures that the user provides
     * viable input. Caller must provide the initial user prompt message (e.g., "Please enter an char.") and the user
     * re-prompt message (e.g., "That wasn't an char. Please try again."). Additionally, this function ensures that
     * the user's char is included in an array of acceptable values. If their input is not in the list, the user will be
     * reprompted.
     * 
     * @param  options         The list of acceptable char values (any user inputted char not in this list will be
     *                         rejected)
     * @param  scnr            The buffer from which to pull the input.
     * @param  promptMessage   The initial message the function should use to request the desired input from the user.
     * @param  repromptMessage The message to be used to request input when their previous input is not parse-able.
     * @return                 a user-provided char
     */
    public static char queryLetterFromOptions(char[] options, Scanner scnr, String promptMessage,
            String repromptMessage) {
     
        char queriedLetter = queryLetter(scnr, promptMessage, repromptMessage);

        // now we have an char, but is it one of the char in our options array?
        while (!valueIsInArray(options, queriedLetter)) {
            // we want both messages to be the re-prompt message, since every prompt from this point is a reprompt
            queriedLetter = queryChar(scnr, repromptMessage, repromptMessage);
        }

        return queriedLetter;
    }


    
    
    
    
    /**
     * Searches an array to determine if a given value is included. Private because function is helpful internally, but
     * does not relate to the library's public area of responsibility.
     * 
     * @param  haystack The array to search
     * @param  needle   The value to search for
     * @return          true if the value is in the array, false otherwise
     */
    private static boolean valueIsInArray(int[] haystack, int needle) {
        // check needle for equivalence to every value in the haystack
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return true;
            }
        }
        return false;
    }

    /**
     * Searches an array to determine if a given value is included. Private because function is helpful internally, but
     * does not relate to the library's public area of responsibility.
     * 
     * @param  haystack The array to search
     * @param  needle   The value to search for
     * @return          true if the value is in the array, false otherwise
     */
    private static boolean valueIsInArray(double[] haystack, double needle) {
     // check needle for equivalence to every value in the haystack
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return true;
            }
        }
        return false;
    }

    /**
     * Searches an array to determine if a given value is included. Private because function is helpful internally, but
     * does not relate to the library's public area of responsibility.
     * 
     * @param  haystack The array to search
     * @param  needle   The value to search for
     * @return          true if the value is in the array, false otherwise
     */
    private static boolean valueIsInArray(char[] haystack, char needle) {
     // check needle for equivalence to every value in the haystack
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                return true;
            }
        }
        return false;
    }

    /**
     * Searches an array to determine if a given value is included. Private because function is helpful internally, but
     * does not relate to the library's public area of responsibility.
     * 
     * @param  haystack The array to search
     * @param  needle   The value to search for
     * @return          true if the value is in the array, false otherwise
     */
    private static boolean valueIsInArray(String[] haystack, String needle) {
     // check needle for equivalence to every value in the haystack
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i].equals(needle)) {
                return true;
            }
        }
        return false;
    }
}
