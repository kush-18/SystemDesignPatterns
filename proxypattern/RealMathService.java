package main.systemdesignpattern.proxypattern;

public class RealMathService implements MathService{




    @Override
    public long computeFactorial(int number) {

        if(number < 0) {
            new IllegalArgumentException("Number must be positive");
        }
        long result =  1;
        for(int i = 2; i <= number; i++) {
            result *= i;
        }
        System.out.println("Computed Factorial of the Number is: " + result);
        return result;
    }
}
