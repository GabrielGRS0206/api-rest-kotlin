package br.com.app.domain.service

import ClientRepository
import br.com.app.domain.model.Client
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ClientService (private val repository: ClientRepository) {

    fun findAll(): List<Client> {
        var client = Client(
            name = "Gabriel",
            document = "11122255588",
            contact = "48988887788",
            email = "teste@gmail.com"
        )

        return Arrays.asList(client, client);
    }

    fun findById(id: Long): Client {
        return Client(
            name = "Gabriel",
            document = "11122255588",
            contact = "48988887788",
            email = "teste@gmail.com"
        );
    }

    fun deleteById(id: Long): String {
        deleteClient(id);
        return "OK"
    }

    private fun deleteClient(id: Long) {
        println(id);
    }

    fun save(client: Client): Client {
        repository.save(client);
        return Client(
            name = "Gabriel",
            document = "11122255588",
            contact = "48988887788",
            email = "teste@gmail.com"
        );
    }
}