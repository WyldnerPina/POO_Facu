package view;

public class Principal {

	public static void main(String[] args) {
		double f;
		f = 100;
		
		for(int i = 0; i < 100; i++) {
			System.out.printf("%.0f\n", fato(f));
		}
		
	}

	private static double fato(double f) {
		if(f <= 1) {
			return 1;
		}
		return f * fato(f-1);		
	}
}
