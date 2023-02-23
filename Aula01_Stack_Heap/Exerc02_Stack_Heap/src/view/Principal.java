package view;
/**
 * @author Wyldner
 *
 */
public class Principal {
	// ************ ESTOURAR STACK ************
	public static void main(String[] args) {
		double f;
		f = 999999999;
		fato(f);		
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
