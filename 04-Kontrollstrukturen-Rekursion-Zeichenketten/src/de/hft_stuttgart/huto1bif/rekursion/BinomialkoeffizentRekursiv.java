package de.hft_stuttgart.huto1bif.rekursion;

public class BinomialkoeffizentRekursiv {

	public static void main(String[] args) {
		int n = 5;
		int k = 3;
		
		int bk = binKoeff(n,k);

		System.out.println(n + " �ber " + k + " = " +  bk);
	}

	private static int binKoeff(int n, int k) {
		if ( k == 0) {
			return 1;
		} else if (k == n) {
			return 1;
		} else {
			return binKoeff(n-1,k-1) + binKoeff(n-1,k);
		}
	}
}
