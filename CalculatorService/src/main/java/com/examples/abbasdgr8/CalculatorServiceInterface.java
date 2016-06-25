package com.examples.abbasdgr8;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * The annotation @WebService signals that this is the
 * SEI (Service Endpoint Interface). 
 *
 * The @SOAPBinding annotation impacts the under-the-hood
 * construction of the service contract, the WSDL
 * (Web Services Definition Language) document. 
 * 
 * Style.RPC simplifies the contract and makes deployment easier.
 *
 * @author Abbas Attarwala
 */
@WebService(name = "CalculatorService")
@SOAPBinding(style = Style.RPC)
public interface CalculatorServiceInterface {
    
    /*
    @WebMethod signals that each method is a service operation.
    */
    
    /**
     * Returns sum of the arguments.
     */
    @WebMethod
    @WebResult(name = "sum")
    int add(    @WebParam(name = "firstInt") int firstInt, 
                @WebParam(name = "secondInt") int secondInt);
    
    /**
     * Returns result of subtracting secondInt from firstInt
     */
    @WebMethod
    @WebResult(name = "difference")
    int subtract(   @WebParam(name = "firstInt") int firstInt, 
                    @WebParam(name = "secondInt") int secondInt);
    
    /**
     * Returns result of multiplicating firstInt with secondInt
     */
    @WebMethod
    @WebResult(name = "product")
    int multiply(   @WebParam(name = "firstInt") int firstInt, 
                    @WebParam(name = "secondInt") int secondInt);
    
    /**
     * Returns result of division of firstInt/secondInt
     */
    @WebMethod
    @WebResult(name = "fraction")
    float divide(    @WebParam(name = "numerator") int numerator, 
                    @WebParam(name = "denominator") int denominator);
}
