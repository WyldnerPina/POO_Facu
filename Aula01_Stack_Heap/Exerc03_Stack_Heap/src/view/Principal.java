package view;

public class Principal {

	public static void main(String[] args) {
		StringBuffer b = new StringBuffer();
		
		for (int i = 0; i < 2147483647; i++) {
			b.append("a");
			System.out.println(b);
		}
		
	}

}
