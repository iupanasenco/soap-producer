package com.iunona_trip.soapproducer.endpoint;

import com.iunona_trip.soapproducer.reservation.OTAHotelResNotifRQ;
import com.iunona_trip.soapproducer.reservation.OTAHotelResNotifRS;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Slf4j
public class HotelRequestEndpoint {

    private static final String NAMESPACE = "http://www.iunona-trip.com/soapproducer/reservation/";



    @PayloadRoot(namespace = NAMESPACE, localPart = "OTA_HotelResNotifRQRequest")
    @ResponsePayload
    public OTAHotelResNotifRS validateHotelRequest(@RequestPayload OTAHotelResNotifRQ resNotifRQ) {
        log.info(resNotifRQ.getHotelReservations().getHotelReservation().toString());
        OTAHotelResNotifRS testHotelResponse = new OTAHotelResNotifRS();
        testHotelResponse.setSuccess("success");
        return testHotelResponse;
    }




}
