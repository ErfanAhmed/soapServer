package net.example.soapServer.endpoint;

import net.example.soapServer.soapReqResSchema.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @author erfan
 * @since 3/15/23
 */
@Endpoint
public class IndividualEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/endpoint";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MyRequest")
    @ResponsePayload
    public MyResponse greeting(@RequestPayload MyRequest request) {

        MyResponse response = new MyResponse();
        response.setMessage("greetings");

        return response;
    }
}
