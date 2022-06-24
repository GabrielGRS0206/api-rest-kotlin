import br.com.app.domain.model.Client
import org.springframework.data.mongodb.repository.MongoRepository

interface ClientRepository : MongoRepository<Client,String>{
    fun save(client: Client);
}