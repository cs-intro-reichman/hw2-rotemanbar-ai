public class Collatz {
// refresh

    public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int i = 1; i <= N; i++) {
            int x = i;
            int count = 1;
			if (mode.equals("v") && i == 1) {
				
                System.out.println("1 4 2 1 (4)"); // Why is this line needed? 
				
                continue; 
            }

            if (mode.equals("v")) {
                System.out.print(x + " ");
            }

            while (x != 1) {
                if (x % 2 == 0) {
                    x = x / 2;
                } else {
                    x = 3 * x + 1;
                }
                count++;
                if (mode.equals("v")) {
                    System.out.print(x + " ");
                }
            }

            if (mode.equals("v")) {
                System.out.println("(" + count + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}

// nice approach :)
