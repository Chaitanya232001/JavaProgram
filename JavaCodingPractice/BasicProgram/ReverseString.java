package BasicProgram;

/*public class ReverseString {

    public static void main(String[] args) {
        String name = "Chaitanya";
        System.out.println("Original string: " + name);

        String reversed = reverseString(name);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        return reversedStr.toString();
    }
}*/

public class ReverseString  {
	 public static void main(String[] args) {
	 String sentence = "Go work";
	 String reversed = reverse(sentence);
	System.out.println("The reversed sentence is: " + reversed);
	 }
	 public static String reverse(String sentence) {
	 if (sentence.isEmpty())
	 return sentence;
	 return reverse(sentence.substring(1)) + sentence.charAt(0);
	 }
	}