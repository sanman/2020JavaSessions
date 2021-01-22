//Remove all  spaces in a String

package String.Manipulations;

public class RemoveSpacesInString {

	public static void main(String[] args) {
		
		String s = "     Hello  Everyone     ";
		String[] words = s.trim().split(" ");
		System.out.println(words);
				
				for(String e : words) {
					String joinedStr = String.join(" ", e);
					System.out.println(joinedStr);
				}

	}

}
