package com.examples.abbasdgr8;

import javax.jws.WebService;

/**
* The @WebService property endpointInterface links the
* SIB (Service Implementation Bean) to the SEI{@link com.examples.abbasdgr8.CalculatorServiceInterface}.
* Note that the method implementations are not annotated
* as @WebMethods.
* 
* @author Abbas Attarwala
*/
@WebService(endpointInterface = "com.examples.abbasdgr8.CalculatorServiceInterface")
public class CalculatorServiceImplementation implements CalculatorServiceInterface {

    @Override
    public int add(int firstInt, int secondInt) {
        return firstInt + secondInt;
    }

    @Override
    public int subtract(int firstInt, int secondInt) {
        return firstInt - secondInt;
    }

    @Override
    public int multiply(int firstInt, int secondInt) {
        return firstInt * secondInt;
    }

    @Override
    public float divide(int firstInt, int secondInt) {
        return (float)firstInt / (float)secondInt;
    }
    
}
