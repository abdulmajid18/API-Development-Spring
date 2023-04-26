package com.rozz.api.apidevelopment;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import com.rozz.api.apidevelopment.model.Item;

public interface CartApi {
    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @RequestMapping(value = "/api/v1/carts/{customerId}/items", produces = { "application/xml",
            "application/json" }, consumes = { "application/xml", "application/json" }, method = RequestMethod.POST)

    default ResponseEntity<List<Item>> addCartItemsByCustomerId(@PathVariable("customerId") String customerId,
            @RequestBody Item item) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json",
                            "{  \"unitPrice\" : 6.02745618307040320615897144307382404804229736328125,  \"quantity\" : 0,  \"id\" : \"id\"}");
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    ApiUtil.setExampleResponse(request, "application/xml",
                            "<null>  <id>aeiou</id>  <quantity>123</quantity>  <unitPrice>3.149</unitPrice></null>");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
