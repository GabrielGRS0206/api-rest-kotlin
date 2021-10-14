package br.com.app.api.mapper

import br.com.app.api.mapper.dto.ClientRequestDTO
import br.com.app.api.mapper.dto.ClientResponseDTO
import br.com.app.domain.model.Client
import org.springframework.stereotype.Component

@Component
class ClientMapper {

    fun toDto(client: Client): ClientResponseDTO? {
        val response = client.id?.let {
            ClientResponseDTO(
                id = it,
                name = client.name,
                contact = client.contact,
                document = client.document,
                email = client.email
            )
        }
        return response
    }

    fun toEntity(request: ClientRequestDTO): Client {
        return Client(
            name = request.name,
            document = request.document,
            contact = request.contact,
            email = request.email
        );
    }
}