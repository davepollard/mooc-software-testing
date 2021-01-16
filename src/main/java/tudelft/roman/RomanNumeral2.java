package tudelft.roman;

import java.util.Locale;

public class RomanNumeral2 {
    private int number = 0;
    public void convert_str(String numeral) {
        int currValue = 0;
        int nextValue = 0;
        int multiplier = 1;
        number = 0;
        numeral = numeral.toLowerCase(Locale.ROOT);
        for (int i=0; i<numeral.length(); i++){
            multiplier = 1;
            currValue = getValue(numeral.charAt(i));
            if (i < numeral.length()-1)
                nextValue = getValue(numeral.charAt(i+1));
            else
                nextValue = 0;

            if (nextValue > currValue)
                multiplier = -1;

            number += multiplier*currValue;
        }
    }

    public int getNumber(){return number;}
    // I did not know about the map function when writing this...
    private int getValue(char c) {
        int charValue = 0;
        switch (c) {
            case 'm':
                charValue = 1000;
                break;
            case 'd':
                charValue = 500;
                break;
            case 'c':
                charValue = 100;
                break;
            case 'l':
                charValue = 50;
                break;
            case 'x':
                charValue = 10;
                break;
            case 'v':
                charValue = 5;
                break;
            case 'i':
                charValue = 1;
                break;
        }
        return charValue;
    }

}
