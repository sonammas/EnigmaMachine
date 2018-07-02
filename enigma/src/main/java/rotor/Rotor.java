package rotor;

public abstract class Rotor {

    private static final int totalNumberOfAlphabets = 27;


    protected char [] rotor = new char[totalNumberOfAlphabets];

    protected int turns = 0;

    public int indexOf(char c) {
        for(int i = 0; i < totalNumberOfAlphabets; i++){
            if(rotor[i] == c)
                return i;
        }

        return -1;
    }

    public int turns()
    {return turns;}

    //It will turn any rotor one position up
    public void rotate() {
        char ch = rotor[0];
        for(int i = 1; i < totalNumberOfAlphabets; i++){
            rotor[i-1] = rotor[i];
        }
        rotor[totalNumberOfAlphabets -1] = ch;
        turns++;
    }

    public char charAt(int i)
    {
        return rotor[i];
    }

    public Rotor(){
        turns = 0;
        setAlphabet();
    }

    public abstract void setAlphabet();
}
