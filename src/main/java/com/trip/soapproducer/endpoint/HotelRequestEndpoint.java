package com.trip.soapproducer.endpoint;

import com.trip.soapproducer.loanelegibility.Acknowledgement;
import com.trip.soapproducer.loanelegibility.CustomerRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Slf4j
public class HotelRequestEndpoint {

    private static final String NAMESPACE = "http://www.iunona-trip.net/soapproducer/loanEligibility/";

    @PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
    @ResponsePayload
    public Acknowledgement getLoanStatus(@RequestPayload CustomerRequest customerRequest) {
        log.info(customerRequest.getCustomerName());
        Acknowledgement testAcknowledgement = new Acknowledgement();
        testAcknowledgement.setApprovedAmount(800000);
        testAcknowledgement.setIsEligible(true);
        return testAcknowledgement;
    }




}
