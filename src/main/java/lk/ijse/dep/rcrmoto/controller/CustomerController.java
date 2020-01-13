package lk.ijse.dep.rcrmoto.controller;

import lk.ijse.dep.rcrmoto.business.custom.CustomerBO;
import lk.ijse.dep.rcrmoto.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    CustomerBO customerBO;

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAllCustomers(){
        List<CustomerDTO> customers = customerBO.findAllCustomers();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-Count",customers.size()+"");
        System.out.println("GET");
        return new ResponseEntity<>(customers,httpHeaders, HttpStatus.OK);

    }

}
