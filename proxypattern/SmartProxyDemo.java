package main.systemdesignpattern.proxypattern;

public class SmartProxyDemo {
    static void main(String[] args) {

        SmartMathsServiceProxy smartMathsServiceProxy = new SmartMathsServiceProxy();

        System.out.println("First Call: ");
        long result1 = smartMathsServiceProxy.computeFactorial(5);
        System.out.println("Result: " + result1);


        System.out.println("Second Call: ");
        long result2 = smartMathsServiceProxy.computeFactorial(5);
        System.out.println("Result: " + result2);

        System.out.println("Third Call: ");
        long result3 = smartMathsServiceProxy.computeFactorial(10);
        System.out.println("Result: " + result3);





    }







}
