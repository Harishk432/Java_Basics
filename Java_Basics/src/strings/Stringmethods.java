package strings;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Harish";
int number=3;
		
		System.out.println("Char"+name.charAt(0));
		
		System.out.println("length"+name.length());
		
		System.out.println("Equls"+name.equals("hari"));
		
		System.out.println("Equlas ignore"+name.equalsIgnoreCase("HARISH"));
		
		System.out.println("Empty"+name.isEmpty());
		
		System.out.println("Contains"+name.contains("j"));
		
		System.out.println("Substring"+name.substring(1));
		
		System.out.println("Substring"+name.substring(1,3));//METHOD OVERLOADING
	
        System.out.println("Concat"+name.concat("Kee"));
        
        
        System.out.println("Replace"+name.replace("Harish", "Keerthana"));
        
        System.out.println("Index"+name.indexOf("a"));
        
        System.out.println("Index"+name.indexOf("h", 0));
        
        System.out.println(name.indexOf("Hari", 0));
        
        //Remove space before and after string
        System.out.println(name.trim());
        
        
        System.out.println("VAlue"+String.valueOf(number));
        
        String uppercase="QTREE";
        System.out.println(uppercase.toLowerCase());
        
        String lowercase="qtree";
        System.out.println(lowercase.toUpperCase());
        
        System.out.println(String.join("-", "17","06","99"));
        
	}

}
