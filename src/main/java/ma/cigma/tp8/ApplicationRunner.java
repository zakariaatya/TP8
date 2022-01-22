package ma.cigma.tp8;


import ma.cigma.tp8.models.CarteFidelio;
import ma.cigma.tp8.models.Client;
import ma.cigma.tp8.models.Facture;
import ma.cigma.tp8.models.Promotion;
import ma.cigma.tp8.presentation.ClientController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ApplicationRunner
{
    public static void main(String [] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");

        Client client = new Client("Omar");
        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);
        ctrl.save(client);
    }
}
