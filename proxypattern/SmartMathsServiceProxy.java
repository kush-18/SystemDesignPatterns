package main.systemdesignpattern.proxypattern;

import java.util.HashMap;
import java.util.Map;

public class SmartMathsServiceProxy implements MathService{
    public final  MathService realMathService;
    public final Map<Integer,Long> cache;

    public SmartMathsServiceProxy() {
        realMathService = new RealMathService();
        cache = new HashMap<>();
    }

    @Override
    public long computeFactorial(int number) {

        if(cache.containsKey(number)) {
            System.out.println("Cached Factorial of the number is: " + cache.get(number));
            return cache.get(number);
        }
        long factorial = realMathService.computeFactorial(number);
        cache.put(number,factorial);
        return factorial;
    }
}
