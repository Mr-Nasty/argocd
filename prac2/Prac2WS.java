/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.college;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author devan
 */
@WebService(serviceName = "Prac2WS")
public class Prac2WS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CollegeName")
    public String CollegeName(@WebParam(name = "name") String name) {
        if(name.equals("JaiHind")){
            return "A++";
        } else if (name.equals("Xaviers")){
            return "B";
        } else {
            return "Wrong input";
        }
    }
}
