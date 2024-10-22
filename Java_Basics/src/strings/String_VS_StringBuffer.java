package strings;

public class String_VS_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String is muttable");
		//IMMUTABLE
		//LITERAL STRING
		String str="Hari";
		System.out.println("Appending a name to original"+str.concat("ish"));
		System.out.println("Original name"+str);
 
		
		System.out.println();
		
		//NEW KEYWORD STRING
		//MUTABLE
		//STRING BUFFER
		
				StringBuffer str1=new StringBuffer("Hari");
				System.out.println("Appending a name to original"+str1.append("sh"));
				System.out.println("Original name"+str1);
				
				//METHOSS OF STRINGBUFFER
				System.out.println(str1.reverse());
				
				StringBuffer SB=new StringBuffer("Hari");
 				System.out.println(SB.replace(0, 3, "KEERTHANA"));
 				
 				StringBuffer delete=new StringBuffer("Hari");
 				System.out.println(delete.delete(0, 3));
 				
 				StringBuffer insert=new StringBuffer("Hari");
 				System.out.println(insert.insert(4, "sh"));
				
	}

}
