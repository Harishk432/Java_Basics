package Interview_Programs;

public class ReverseString {
	public static void main(String[] args) {
        String str = "HELLO";
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        System.out.println("Reversed String: " + reversed);
    }
}
