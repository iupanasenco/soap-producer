package com.iunona_trip.soapproducer.endpoint;

import com.iunona_trip.soapproducer.reservation.OTAHotelResNotifRQRequest;
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
    public OTAHotelResNotifRS validateHotelRequest(@RequestPayload OTAHotelResNotifRQRequest resNotifRQ) {
        log.info(resNotifRQ.getHotelReservations().getHotelReservation().getUniqueID().getID());
        OTAHotelResNotifRS testHotelResponse = new OTAHotelResNotifRS();
        testHotelResponse.setSuccess("success");
        testHotelResponse.setTimeStamp(resNotifRQ.getTimeStamp());
        testHotelResponse.setVersion(1.0f);

        //reservation to be set from the request data
        return testHotelResponse;
    }




}
