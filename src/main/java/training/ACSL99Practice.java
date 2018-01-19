package training;

public class ACSL99Practice {

	public static int calculateTotal(int starttotal,int number) {
		int newTotal=starttotal;
		if(number == 4) {
			newTotal = starttotal-10;
		} else
		if(number == 9) {
			newTotal = starttotal;
		} else
		if(number == 0 && starttotal<=88) {
			newTotal = starttotal+11;
		}
		else if (number==0 && starttotal>88){
			newTotal = starttotal+1;
		} else {
			newTotal = starttotal+number;
		}
		return newTotal;
	}
	public static void main(String[] args) {
		int [] input = {87, 5, 8, 9, 7, 4, 6, 3, 9, 0, 2};
		whowon99game(input);
	}
	public static void whowon99game(int[] input) {
		int starttotal = input[0];
		starttotal = calculateTotal(starttotal, input[1]);
		if(starttotal>99) {
			System.out.println(starttotal+", Dealer");
			return;
		}
		starttotal = calculateTotal(starttotal, input[5]);
		if(starttotal>99) {
			System.out.println(starttotal+", Player");
			return;
		}
		starttotal = calculateTotal(starttotal, input[2]);
		if(starttotal>99) {
			System.out.println(starttotal+", Dealer");
			return;
		}
		starttotal = calculateTotal(starttotal, input[7]);
		if(starttotal>99) {
			System.out.println(starttotal+", Player");
			return;
		}
		starttotal = calculateTotal(starttotal, input[3]);
		if(starttotal>99) {
			System.out.println(starttotal+", Dealer");
			return;
		}
		starttotal = calculateTotal(starttotal, input[9]);
		if(starttotal>99) {
			System.out.println(starttotal+", Player");
			return;
		}
		starttotal = calculateTotal(starttotal, input[4]);
		if(starttotal>99) {
			System.out.println(starttotal+", Dealer");
			return;
		}
	}

}





