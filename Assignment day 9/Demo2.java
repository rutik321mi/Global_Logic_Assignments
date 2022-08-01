/*i) Create the following class and implement the method to check whether the given string is a palindrome and return the result.
Class Name : Demo2
Method : palindromeCheck(String):boolean
(Hint: A String is palindrome,  If the reversed string is equal to the actual string. Ex: madam, mom, dad, malayalam )
ii) Create a Junit test class to test the above class.
*/
public class Demo2 {
	boolean palindromeCheck(String s){
		boolean flag=true;
		for(int i=0;i<=s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				flag=false;
				break;
			}
		}
		
		return flag;
	}
}
