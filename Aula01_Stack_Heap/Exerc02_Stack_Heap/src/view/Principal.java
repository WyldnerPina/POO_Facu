package view;

public class Principal {

	public static void main(String[] args) {
		double f;
		f = 999999999;
		
		for(int i = 0; i < 999999999; i++) {
			System.out.printf("%.0f\n", fato(f));
		}
		
	}

	private static double fato(double f) {
		double z;
		if(f <= 1) {
			return 1;
		}
		System.out.println(z = f * fato(f-1));	
		return z;		
	}
}
