package com.example.demo.Controller;

import com.example.demo.DTO.InvoiceDTO;
import com.example.demo.Manager.InvoiceManager;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InvoiceController {
    @Autowired
    InvoiceManager invoiceManager;

    @Operation(
            tags = {"Invoice API's"},
            summary = "gets Details of Invoices",
            description = "get Details of both funded and unfunded invoice",
            parameters = {@Parameter(name = "id",description = "userId to get invoices",example = "1",in = ParameterIn.PATH),
                    @Parameter(name="start",description = "starting index to fetch records from",example = "4",in = ParameterIn.PATH)
            },
            responses = {@ApiResponse(responseCode = "200",content = @Content(schema = @Schema(implementation = InvoiceDTO.class),mediaType = MediaType.APPLICATION_JSON_VALUE),description = "Success Response")}

    )
    @GetMapping(value="/invoiceDetails/{id}/{start}", produces = MediaType.APPLICATION_JSON_VALUE)
    public InvoiceDTO getInvoiceDetails(@PathVariable("id") Integer id, @PathVariable("start") Integer start) {
        return invoiceManager.getInvoiceDetails(id,start);
    }
}
