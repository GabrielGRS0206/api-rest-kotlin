package br.com.app.api.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/check")
class CheckStatusController {

    @GetMapping
    fun checkStatus(): ResponseEntity<String> {
        val status = "status:ok";
        return ResponseEntity.status(HttpStatus.OK).body(status);
    }
}