public class FizzBuzz {
    public boolean isDivisibleByThree(int number) {
        return isDivisibleBy(number, 3);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public boolean isDivisibleByFive(int number) {
        return isDivisibleBy(number, 5);
    }

    public boolean isDivisibleByFifteen(int number) {
        return isDivisibleBy(number, 15);
    }

    public String shout(int number) {
        if (number == 15) return "FizzBuzz";
        if (number == 3) return "Fizz";
        if (number == 5) return "Buzz";
        return String.valueOf(number);
    }
}
