/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author devan
 */
@WebService(serviceName = "Prac1WS")
public class Prac1WS {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1 + num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sub")
    public int sub(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1 - num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mul")
    public int mul(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        return num1 * num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "div")
    public int div(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        //TODO write your implementation code here:
        if (num1 == 0){
            System.out.println("Cant be divided");
        } else {
            return num1 / num2;
        }
        return 0;
    }
}
