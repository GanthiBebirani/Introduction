package basicprograms;

public class Specifiedpattern {
    public static void main(String[] args) {
        String str = "jaan meri baan aap kaan";
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {  // Adjusted loop condition
            if (str.charAt(i+1) == 'a' && str.charAt(i+2) == 'a' && str.charAt(i+3) == 'n') {
                count++;
            }
        }
        System.out.println(count);
    }
}
