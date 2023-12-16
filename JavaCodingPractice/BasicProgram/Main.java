package BasicProgram;

// class Main {
// 	 public static void main(String[] args) {
// 	 String str = "Radar", reverseStr = "";
// 	 int strLength = str.length();
// 	 for (int i = (strLength - 1); i>=0; --i) {
// 	reverseStr = reverseStr + str.charAt(i);
// 	 }
// 	 if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
// 	System.out.println(str + " is a Palindrome String.");
// 	 }
// 	 else {
// 	System.out.println(str + " is not a Palindrome String.");
// 	 }
// 	 }
// 	}


// public class Main {
// 	public static void main(String[] args) {
//     	int x = 10;
//     	if (x > 5) {
//         	int y = 20;
//         	System.out.println(x + y);
//     	}
//     	System.out.println(x);
// 	}
// }

// public class Main {
// 	public static void main(String[] args) {
//     	int[] numbers = {1, 2, 3, 4, 5};
//     	System.out.println(numbers[5]);
// 	}
// }

// public class Main {
// 	public static void main(String[] args) {
//     	int dayOfWeek = 5;
//     	String day;
//      	switch (dayOfWeek) {
//         	case 1:
//             	day = "Monday";
//             	break;
//         	case 2:
//             	day = "Tuesday";
//             	break;
//         	case 3:
//             	day = "Wednesday";
//             	break;
//         	default:
//             	day = "Unknown";
//     	}
//      	System.out.println(day);
// 	}
// }

public class Main {
	public static void main(String[] args) {
    	String s1 = "Java";
    	String s2 = "java";
    	if (s1.equals(s2)) {
        	System.out.println("Strings are equal");
    	} else {
        	System.out.println("Strings are not equal");
    	}
	}
}