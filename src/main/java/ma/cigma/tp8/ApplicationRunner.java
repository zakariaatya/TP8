package ma.cigma.tp8;


import ma.cigma.tp8.models.CarteFidelio;
import ma.cigma.tp8.models.Client;
import ma.cigma.tp8.models.Facture;
import ma.cigma.tp8.models.Promotion;
import ma.cigma.tp8.presentation.ClientController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationRunner
{
    public static void main(String [] args)
    {
        SpringApplication.run(ApplicationRunner.class,args);
    }
}
