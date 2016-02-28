package ru.farm.service.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-02-28T21:16:03.974+04:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "SampleService_HttpService", 
                  wsdlLocation = "file:/D:/TCS/project/farm/farm-service/src/main/resources/wsdl/SampleService.wsdl",
                  targetNamespace = "http://ws.service.farm.ru") 
public class SampleServiceHttpService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.service.farm.ru", "SampleService_HttpService");
    public final static QName SampleServiceHttpPort = new QName("http://ws.service.farm.ru", "SampleService_HttpPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/TCS/project/farm/farm-service/src/main/resources/wsdl/SampleService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SampleServiceHttpService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/TCS/project/farm/farm-service/src/main/resources/wsdl/SampleService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SampleServiceHttpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SampleServiceHttpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SampleServiceHttpService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SampleServiceHttpService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SampleServiceHttpService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SampleServiceHttpService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SampleService
     */
    @WebEndpoint(name = "SampleService_HttpPort")
    public SampleService getSampleServiceHttpPort() {
        return super.getPort(SampleServiceHttpPort, SampleService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SampleService
     */
    @WebEndpoint(name = "SampleService_HttpPort")
    public SampleService getSampleServiceHttpPort(WebServiceFeature... features) {
        return super.getPort(SampleServiceHttpPort, SampleService.class, features);
    }

}
