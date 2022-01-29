public class April17 {
    public static void main(String args[]) {
        String text = "sunway";
        int[] ascii = new int[text.length()];
        int mask = 6;

        for (int i = 0; i < text.length(); i++) {

            ascii[i] = (int) text.charAt(i);
            if (((ascii[i] + mask) <= 122) && (ascii[i] + mask) >= 97) {
                ascii[i] += mask;
            } else {
                ascii[i] -= 26;
            }

        }
        String maskedtext = "";
        for (int i = 0; i < text.length(); i++) {
            char c = (char) ascii[i];
            maskedtext += c;

        }
        System.out.println(maskedtext);
    }
}