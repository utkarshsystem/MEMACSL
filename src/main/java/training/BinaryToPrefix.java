package training;

public class BinaryToPrefix {

	public static void main(String[] args) {
		String binaryValue = "010110101010";
		String result = "";
		if(binaryValue.startsWith("0"))
		{
			result = result + "P";
			binaryValue = binaryValue.substring(1);
		}
		if(binaryValue.startsWith("10"))
		{
			result = result + "Q";
			binaryValue = binaryValue.substring(2);
		}
		if(binaryValue.startsWith("110"))
		{
			result = result + "R";
			binaryValue = binaryValue.substring(3);
		}
	    if(binaryValue.startsWith("1110"))
		{
			result = result + "S";
			binaryValue = binaryValue.substring(4);
		}
		if(binaryValue.startsWith("1111"))
		{
			result = result + "T";
			binaryValue = binaryValue.substring(4);
		}
	}

}
