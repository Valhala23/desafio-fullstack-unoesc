import br.edu.unoesc.desafiofullstackunoesc.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>
{
    
}