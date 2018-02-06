/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author entrar
 */
@WebService(serviceName = "Calcular")
@Stateless()
public class Calcular {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sumar")
    public int Sumar(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        int res = n1+n2;
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Resta")
    public int Resta(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        int res = n1-n2;
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicar")
    public int multiplicar(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
        int res = n1*n2;
        return res;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divisi\u00f3n")
    public int división(@WebParam(name = "n1") int n1, @WebParam(name = "n2") int n2) {
       if (n2 == 0) return -1;
       return (n1/n2);
    }
}
