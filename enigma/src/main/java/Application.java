import enigma.EnigmaMachine;

public class Application {

    //TODO try to implement circular queue
    public static void main(String[] args) {
        EnigmaMachine enigma = new EnigmaMachine();
        char[] mySonamString = enigma
                .encrypt("E", 'M', 'C', 'K');
        System.out.print(mySonamString);
    }
}
