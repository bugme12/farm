package ru.farm.service.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-02-28T21:16:03.933+04:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://ws.service.farm.ru", name = "SampleService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SampleService {

    @WebMethod(action = "http://ws.service.farm.ru")
    @WebResult(name = "result", targetNamespace = "", partName = "result")
    public java.lang.String getStr1(
        @WebParam(partName = "yourName", name = "yourName", targetNamespace = "")
        java.lang.String yourName
    );
}
