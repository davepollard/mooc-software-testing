package tudelft.roman;

public class RomanNumeral2Main {
    public static void main (String[] args){
        RomanNumeral2 rn2 = new RomanNumeral2();

        // doesn't check for input or invalid numbers

        rn2.convert_str("iii");  // 3
        System.out.println(rn2.getNumber());
        rn2.convert_str("ix");  // 9
        System.out.println(rn2.getNumber());
        rn2.convert_str("xiv");  // 14
        System.out.println(rn2.getNumber());
        rn2.convert_str("CXLV");  // 145
        System.out.println(rn2.getNumber());
        rn2.convert_str("MCCCLXIX");  // 1369
        System.out.println(rn2.getNumber());
    }


}
