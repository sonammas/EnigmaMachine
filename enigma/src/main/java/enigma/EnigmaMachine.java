package enigma;

import rotor.*;

public class EnigmaMachine {

    //TODO not implemented Circular Queue
    //static notches - when each rotor rotates to get the value
    public final static StringBuffer[] notches = {new StringBuffer("Q"), new StringBuffer("E"),
            new StringBuffer("V")};

    // Initilializing rotors with their respective values
    private LeftRotor leftRotor = new LeftRotor();
    private CenterRotor centerRotor = new CenterRotor();
    private RightRotor rightRotor = new RightRotor();

    public static final StringBuffer englishAlphabetsReflector  = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

    public StringBuffer rightRotorR = new StringBuffer(englishAlphabetsReflector.toString());
    public StringBuffer centerRotorR = new StringBuffer(englishAlphabetsReflector.toString());
    public StringBuffer leftRotorR = new StringBuffer(englishAlphabetsReflector.toString());


    //INITIAL SETTINGS USING M C K
    public void initialSettingsOfRightRotor(final char initialSettingOfRightRotor) {
        //appending the rightRotor from 0 to startPositionOfRightRotor
        //delete the character from rightRotor from position 0 to startPositionOfRightRotor
        int position;
        position = rightRotorR.toString().indexOf(initialSettingOfRightRotor);
        rightRotorR.append(rightRotorR.substring(0,position));
        rightRotorR.delete(0,position);
    }

    public void initialSettingsOfCenterRotor(final char initialSettingOfCenterRotor) {
        int position;
        position = centerRotorR.toString().indexOf(initialSettingOfCenterRotor);
        centerRotorR.append(centerRotorR.substring(0,position));
        centerRotorR.delete(0,position);
    }

    public void initialSettingsOfLeftRotor(final char initialSettingOfLeftRotor) {
        int position;
        position = leftRotorR.toString().indexOf(initialSettingOfLeftRotor);
        leftRotorR.append(leftRotorR.substring(0,position));
        leftRotorR.delete(0,position);
    }

    public char[] encrypt(String stringToEncrypt, char initialSettingOfLeftRotor,
                          char initialSettingOfCenterRotor , char initialSettingOfRightRotor) {

        char[] encrytedArray = new char[stringToEncrypt.length()];

        System.out.println("Enigma Machine have started encrypting");

        stringToEncrypt = stringToEncrypt.toUpperCase();
        char[] characters = new char[10000];

        for (int i = 0; i < stringToEncrypt.length(); i++) {
            characters[i] = encryptChar(stringToEncrypt.charAt(i), initialSettingOfLeftRotor,
                    initialSettingOfCenterRotor, initialSettingOfRightRotor);
            encrytedArray[i] = characters[i];

        }
        return encrytedArray;
    }

    public char encryptChar(char charToEncrypt, char initialSettingOfLeftRotor, char initialSettingOfCenterRotor,
                            char initialSettingOfRightRotor) {
        char ch = 0;
        try {
            //before encryting any character the right rotor is always shifted up

            //Setting up the Rotors of 'M C K'
            initialSettingsOfRightRotor(initialSettingOfRightRotor);
            initialSettingsOfCenterRotor(initialSettingOfCenterRotor);
            initialSettingsOfLeftRotor(initialSettingOfLeftRotor);

            rightRotor.rotate();

            //pass through rightRotor
            ch = passThroughRightRotor(charToEncrypt);

            ch = passThroughCenterRotor(ch);

            ch = passThroughLeftRotor(ch);

            //then through the reflector
            ch = passThroughReflector(ch);

            //then through the left rotor in the reverse
            ch = passThroughLeftRotorInReverse(ch);

            ch = passThroughCenterRotorInReverse(ch);

            ch = passThroughRightRotorInReverse(ch);

        } catch (Exception e) {
            System.out.println("Warning, character not in alphabet |" + charToEncrypt + "|");
            return charToEncrypt;
        }

        if (leftRotor.turns() % 27 == 0)
            centerRotor.rotate();

        return ch;
    }

    //TODO Soanm to rrethink
    private char passThroughReflector(char charToEncrypt){
        int position = Reflector.reflector.indexOf(String.valueOf(charToEncrypt));
        return Reflector.reflector.charAt(position);
    }

    public char passThroughRightRotor(char charToEncrypt) {
        int position = rightRotorR.indexOf(String.valueOf(charToEncrypt));
        return rightRotor.charAt(position);
    }

    private char passThroughCenterRotor(char charToEncrypt) {
        int position = centerRotorR.indexOf(String.valueOf(charToEncrypt));
        return centerRotor.charAt(position);
    }

    private char passThroughLeftRotor(char charToEncrypt) {
        int position = leftRotorR.indexOf(String.valueOf(charToEncrypt));
        return leftRotor.charAt(position);
    }

    private char passThroughLeftRotorInReverse(char charToEncrypt) {
        int position = leftRotor.indexOf(charToEncrypt);
        return leftRotorR.charAt(position);
    }

    private char passThroughCenterRotorInReverse(char charToEncrypt) {
        int position = centerRotor.indexOf(charToEncrypt);
        return centerRotorR.charAt(position);
    }

    private char passThroughRightRotorInReverse(char charToEncrypt) {
        int position = rightRotor.indexOf(charToEncrypt);
        return rightRotorR.charAt(position);
    }

    //TODO
    public StringBuffer[] settingWithNotches(final char initialSettingOfRightRotor) {
        StringBuffer[] result = new StringBuffer[2];
        result[0] = RightRotor.rightRotor;
        result[1] = notches[0];
        return result;
    }
}
