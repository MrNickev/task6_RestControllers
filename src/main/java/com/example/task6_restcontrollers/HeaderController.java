package com.example.task6_restcontrollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    ResponseEntity<List<String>> getRequestHeaders(@RequestHeader MultiValueMap<String, String> headers) {
        var resultList = new ArrayList<String>(headers.size());
        headers.forEach((key, value) -> {
            resultList.add("Header " + key + " = " + String.join("/", value));
        });

        return new ResponseEntity<List<String>>(resultList, HttpStatus.OK);
    }

    @PostMapping("/add-id")
    ResponseEntity<DataEntity> addIdToRequestBody(@RequestBody DataEntity data) {
        data.getInfo().setId();
        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
