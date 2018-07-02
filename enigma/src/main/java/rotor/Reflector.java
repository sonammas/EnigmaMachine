package rotor;

public class Reflector extends Rotor{

    public final static StringBuffer reflector = new StringBuffer("ABCDEFGDIJKGMKMIEBFTCVVJAT");

    @Override
    public void setAlphabet() {

        int i = 0;

        rotor[i] = ' ';
        i++;

        rotor[i] = 'A';
        i++;

        rotor[i] = 'B';
        i++;

        rotor[i] = 'C';
        i++;

        rotor[i] = 'D';
        i++;

        rotor[i] = 'E';
        i++;

        rotor[i] = 'F';
        i++;

        rotor[i] = 'G';
        i++;

        rotor[i] = 'D';
        i++;

        rotor[i] = 'I';
        i++;

        rotor[i] = 'J';
        i++;

        rotor[i] = 'K';
        i++;

        rotor[i] = 'J';
        i++;

        rotor[i] = 'M';
        i++;

        rotor[i] = 'K';
        i++;

        rotor[i] = 'M';
        i++;

        rotor[i] = 'I';
        i++;

        rotor[i] = 'E';
        i++;

        rotor[i] = 'B';
        i++;

        rotor[i] = 'F';
        i++;

        rotor[i] = 'T';
        i++;

        rotor[i] = 'C';
        i++;

        rotor[i] = 'V';
        i++;

        rotor[i] = 'V';
        i++;

        rotor[i] = 'J';
        i++;

        rotor[i] = 'A';
        i++;

        rotor[i] = 'T';

        System.out.println("Enigma Machine done with setting up the reflector  i=" + i);
    }
}
