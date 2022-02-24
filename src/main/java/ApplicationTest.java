import ma.cigma.Models.CarteFidelio;
import ma.cigma.Models.Client;
import ma.cigma.Models.Facture;
import ma.cigma.Models.Promotion;
import ma.cigma.Presentation.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Arrays;
import java.util.List;

public class ApplicationTest {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr= (ClientController) context.getBean("ControllerClient");
        Client client1 = new Client("Omar");
        Client client2 = new Client("Said");
        Client client3 = new Client("Ahmed");

        client1=ctr.save(client1);
        client2=ctr.save(client2);
        client3=ctr.save(client3);
        ctr.getAll().stream().forEach(i-> System.out.println(i));
        System.out.println(ctr.getOne(1));
        client1.setName("Hassan");
        ctr.modify(client1);
        ctr.remove(2);
        ctr.getAll().stream().forEach(i-> System.out.println(i));
    }
}






