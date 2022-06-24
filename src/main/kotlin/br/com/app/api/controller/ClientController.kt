package br.com.app.api.controller

import br.com.app.api.mapper.ClientMapper
import br.com.app.api.mapper.dto.ClientRequestDTO
import br.com.app.api.mapper.dto.ClientResponseDTO
import br.com.app.domain.service.ClientService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import java.util.stream.Collectors

@RestController
@RequestMapping("/clients")
class ClientController(private val service: ClientService, private val mapper: ClientMapper) {

    @GetMapping
    fun findAll(): List<ClientResponseDTO?>? {
        return service.findAll().stream().map { e -> mapper.toDto(e) }.collect(Collectors.toList())
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ClientResponseDTO? {
        val client = service.findById(id)
        return mapper.toDto(client)
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: Long): String {
        return service.deleteById(id)
    }

    @PostMapping
    fun save(
        @RequestBody request: ClientRequestDTO,
        builder: UriComponentsBuilder
    ): ResponseEntity<ClientResponseDTO> {
        val clientSave = service.save(mapper.toEntity(request))
        var uri = builder.path("/api/clients${clientSave.id}").build().toUri()
        return ResponseEntity.created(uri).body(mapper.toDto(clientSave));
    }
}