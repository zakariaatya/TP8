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
        ClientController ctrl = (ClientController) context.getBean("ctrl1");

        Client client1 = new Client("Omar");
        Client client2 = new Client("Said");
        Client client3 = new Client("Ahmed");


        ctrl.save(client1);
        ctrl.save(client2);
        ctrl.save(client3);


        ctrl.getAll().stream().forEach(i->System.out.println(i));


        System.out.println(ctrl.getById(1));


        client1.setNom("Hassan");
        ctrl.modify(client1);


        ctrl.removeById(2);

        ctrl.getAll().stream().forEach(i->System.out.println(i));

    }
}
