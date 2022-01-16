package ma.cigma.tp8;


import ma.cigma.tp8.models.Client;
import ma.cigma.tp8.presentation.ClientController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner
{
    public static void main(String [] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");
        ctrl.save(new Client("OMAR"));
        ctrl.save(new Client("SIHAM"));
        ctrl.save(new Client("AHMED"));
        ctrl.save(new Client("FARAH"));


        ctrl.modify(new Client(1L,"new Name"));

        Client found = ctrl.getById(1L);

    }
}
