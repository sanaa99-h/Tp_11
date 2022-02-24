package ma.cigma.Presentation;


import lombok.Data;
import ma.cigma.Models.Client;
import ma.cigma.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Data
@Controller("ControllerClient")
public class ClientController {
    @Autowired
    private ClientService service;
    public Client save(Client clt) {
        return service.save(clt);
    }
    public Client modify(Client clt) {
        return service.modify(clt);
    }
    public void remove(long idClt) {
        service.remove(idClt);
    }
    public Client getOne(long idClt) {
        return service.getOne(idClt);
    }
    public List<Client> getAll() {
        return service.getAll();
    }

}

