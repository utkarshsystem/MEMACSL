package training;

public class HexaTo4digitBinary {

	public static void main(String[] args) {
		String result = HexaTo4DigitBinary();
		System.out.println(result);


	}

	private static String HexaTo4DigitBinary() {
		char Hexavalue = 9;
		int FinalHexaValue = Hexavalue;
		String result;
		int[] binaryValue = {0,0,0,0};
		if(Hexavalue == 'A'){
			FinalHexaValue = 10;
		}
		if(Hexavalue == 'B'){
			FinalHexaValue = 11;
		}
		if(Hexavalue == 'C'){
			FinalHexaValue = 12;
		}
		if(Hexavalue == 'D'){
			FinalHexaValue = 13;
		}
		if(Hexavalue == 'E'){
			FinalHexaValue = 14;
		}
		if(Hexavalue == 'F'){
			FinalHexaValue = 15;
		}
		if(FinalHexaValue>=8){
			binaryValue[0] = 1;
			FinalHexaValue = FinalHexaValue-8;
		}
		if(FinalHexaValue>=4){
			binaryValue[1] = 1;
			FinalHexaValue = FinalHexaValue-4;
		}
		if(FinalHexaValue>=2){
			binaryValue[2] = 1;
			FinalHexaValue = FinalHexaValue-2;
		}
		if(FinalHexaValue>=1){
			binaryValue[3] = 1;
			FinalHexaValue = FinalHexaValue-1;
		}
		result = binaryValue[0] + "" +binaryValue[1] + "" + binaryValue[2] + "" + binaryValue[3];
		return result;
	}
	

}
