public class Reverse {
        public static void main(String[] args) {
            int number = 1234;
            int reversed = 0;
            int original = number;


            boolean isNegative = number < 0;
            if (isNegative) {
                number = Math.abs(number);
            }

            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }



            System.out.println("Original : " + original);
            System.out.println("Reversed : " + reversed);
        }
}
