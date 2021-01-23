package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        String mirror = "";

        if (string.length() == 0) {
            return mirror;
        }

        int begin = 0;
        int end = string.length() - 1;
        for (; begin < end; begin++, end--) {
            if (string.charAt(begin) == string.charAt(end)) {
                mirror += String.valueOf(string.charAt(end));
            }
            else {
                break;
            }
        }

        return string.charAt(begin) == string.charAt(end) ? string : mirror;
    }
}
