
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
