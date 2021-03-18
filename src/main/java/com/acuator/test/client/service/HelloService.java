package com.acuator.test.client.service;

import com.acuator.test.client.ws.Response;
import com.acuator.test.client.ws.VmnListRequest;
import com.acuator.test.client.ws.VmnListResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HelloService {
    @PayloadRoot(namespace = "http://supply.tgg.com/webservice", localPart = "vmnListRequest")
    @ResponsePayload
    public VmnListResponse getVmnList(@RequestPayload VmnListRequest req) {
        VmnListResponse responseList = new VmnListResponse();
        Response resp = new Response();
        resp.setVmn("VMN");
        resp.setLabelCategoryId("LabelCategoryId");
        resp.setVmnId("vmnId");
        resp.setLabelCategoryDescription("LabelCategoryDescription");
        resp.setIsSpecialLabel(true);
        responseList.getResponse().add(resp);
        return responseList;
    }
}
