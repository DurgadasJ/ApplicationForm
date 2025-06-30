package com.js.formcreator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/form")
public class FormController {

// This class will handle form-related requests
    // Add methods to handle form submissions, validations, etc.

    // Example method to handle a GET request
     @GetMapping("/form")
     public ResponseEntity<String> getForm() {
         return ResponseEntity.ok("Form data");
     }

    // Example method to handle a POST request
    // @PostMapping("/form")
    // public ResponseEntity<String> submitForm(@RequestBody FormData formData) {
    //     // Process the form data
    //     return ResponseEntity.ok("Form submitted successfully");
    // }
}
