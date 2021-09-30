package day2;

public class SumOfTwoDice {
	public static void main(String[] args) {
		int rolldice1= (int) (1+(Math.random()*6));
		int rolldice2= (int) (1+(Math.random()*6));
		int sumoftwodice=rolldice1+rolldice2;
		System.out.println("sumofdice = "+sumoftwodice);
	}

}
