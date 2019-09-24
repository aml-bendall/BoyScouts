package boyScouts;

import org.apache.commons.lang3.StringUtils;

public class upperCase  {
	public static boolean isUpperCase(int charPos, String checkChar)  {
		System.out.println(Character.toString(checkChar.charAt(charPos)));
		
		//Check the character in the checkChar String using the position passed to the method.
		if (StringUtils.isAllUpperCase(Character.toString(checkChar.charAt(charPos)))) {
			  //The character is upper case
			  return true;
			}
			//The character is lower case or not a letter.
			return false;
	}
}
