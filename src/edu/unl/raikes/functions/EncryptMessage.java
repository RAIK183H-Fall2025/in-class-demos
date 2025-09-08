package edu.unl.raikes.functions;

public class EncryptMessage {
    // shift each character in a password some characters, then output
    public static void encrypt(char letter) {
        letter = (char) (letter + -5);
        System.out.print(letter);
    }

    public static void main(String[] args) {

        // use the function
        encrypt('p');
        encrypt('a');
        encrypt('s');
        encrypt('s');
        encrypt('w');
        encrypt('o');
        encrypt('r');
        encrypt('d');

    }
}
