package training;

public class IndexofPractice {

	public static void main(String[] args) {
		String str = "ttr";
		System.out.println(str.indexOf('a'));
		System.out.println(IndexofPractice.doubleX(""));
	}
//	public static boolean doubleX(String str) {
//		int position = str.indexOf('xx');
//		int position2 = str.indexOf('x')+1;
//		String substr = str.substring(position, position);
//		String substr2 = str.substring(position2, position2);
//		if( substr == substr2){
//			return true;
//		}
//		else{
//			return false;
//		}
//	}
	public static boolean doubleX(String str) {
		int position = str.indexOf('x');
		int position2 = str.indexOf('x')+1;
		String substr = str.substring(position, position);
		String substr2 = str.substring(position2, position2);
		if( substr == substr2){
			return true;
		}
		else{
			return false;
		}
	}

}
