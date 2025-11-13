public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int times = Integer.parseInt(args[1]);
            word = word.toUpperCase();
            String anLetters = "AEFHILMNORSX";
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                boolean useAn = anLetters.indexOf(ch) >= 0;
                if (useAn) {
                        System.out.println("Give me an " + ch + ": " + ch + "!");
                }
                else {
                        System.out.println("Give me a  " + ch + ": " + ch + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int i =0; i < times; i++) {
                System.out.println(word + "!!!");
            }


        }
}
