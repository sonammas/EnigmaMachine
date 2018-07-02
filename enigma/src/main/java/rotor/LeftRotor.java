package rotor;

public class LeftRotor extends Rotor {

    public final static StringBuffer leftRotor = new StringBuffer("EKMFLGDQVZNTOWYHXUSPAIBRCJ");

    @Override
    public void setAlphabet() {
        int i = 0;

        rotor[i] = ' ';
        i++;

        rotor[i] = 'E';
        i++;

        rotor[i] = 'K';
        i++;

        rotor[i] = 'M';
        i++;

        rotor[i] = 'F';
        i++;

        rotor[i] = 'L';
        i++;

        rotor[i] = 'G';
        i++;

        rotor[i] = 'D';
        i++;

        rotor[i] = 'Q';
        i++;

        rotor[i] = 'V';
        i++;

        rotor[i] = 'Z';
        i++;

        rotor[i] = 'N';
        i++;

        rotor[i] = 'T';
        i++;

        rotor[i] = 'O';
        i++;

        rotor[i] = 'W';
        i++;

        rotor[i] = 'Y';
        i++;

        rotor[i] = 'H';
        i++;

        rotor[i] = 'X';
        i++;

        rotor[i] = 'U';
        i++;

        rotor[i] = 'S';
        i++;

        rotor[i] = 'P';
        i++;

        rotor[i] = 'A';
        i++;

        rotor[i] = 'I';
        i++;

        rotor[i] = 'B';
        i++;

        rotor[i] = 'R';
        i++;

        rotor[i] = 'C';
        i++;

        rotor[i] = 'J';

        System.out.println("Enigma Machine done with setting up Left Rotor  i=" + i);
    }
}
