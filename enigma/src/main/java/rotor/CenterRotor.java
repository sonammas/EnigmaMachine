package rotor;

public class CenterRotor extends Rotor {
    public final static StringBuffer centerRotor = new StringBuffer("AJDKSIRUXBLHWTMCQGZNPYFVOE");

    @Override
    public void setAlphabet() {
        int i = 0;

        rotor[i] = ' ';
        i++;

        rotor[i] = 'A';
        i++;

        rotor[i] = 'J';
        i++;

        rotor[i] = 'D';
        i++;

        rotor[i] = 'K';
        i++;

        rotor[i] = 'S';
        i++;

        rotor[i] = 'I';
        i++;

        rotor[i] = 'R';
        i++;

        rotor[i] = 'U';
        i++;

        rotor[i] = 'X';
        i++;

        rotor[i] = 'B';
        i++;

        rotor[i] = 'L';
        i++;

        rotor[i] = 'H';
        i++;

        rotor[i] = 'W';
        i++;

        rotor[i] = 'T';
        i++;

        rotor[i] = 'M';
        i++;

        rotor[i] = 'C';
        i++;

        rotor[i] = 'Q';
        i++;

        rotor[i] = 'G';
        i++;

        rotor[i] = 'Z';
        i++;

        rotor[i] = 'N';
        i++;

        rotor[i] = 'P';
        i++;

        rotor[i] = 'Y';
        i++;

        rotor[i] = 'F';
        i++;

        rotor[i] = 'V';
        i++;

        rotor[i] = 'O';
        i++;

        rotor[i] = 'E';

        System.out.println("Enigma Machine done with setting up Center Rotor  i =" + i);
    }
}
