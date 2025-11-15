public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			double sign = ( i % 2 == 0) ? 1.0: -1.0;
			double term = sign / (2 * i + 1);
			sum += term;
		}
		double approxPi = sum * 4;
		System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + approxPi); 
	}
	// refresh

}
