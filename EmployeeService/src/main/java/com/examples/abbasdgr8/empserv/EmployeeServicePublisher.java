package com.examples.abbasdgr8.empserv;

import javax.xml.ws.Endpoint;

/**
 * The endpoint publisher class that publishes this web services to the endpoint
 * http://127.0.0.1:1111/employee
 *
 * @author Abbas Attarwala
 */
public class EmployeeServicePublisher {
    
    private static final int port = 1111;
    private static final String servicePath = "employee";
    
    public static void main(String[] args) {
        String url = "http://127.0.0.1:" + port + "/" + servicePath;
        System.out.println("Publishing the Employee Service on port 1111...");
        Endpoint.publish(url, new EmployeeService());
    }
    
}
