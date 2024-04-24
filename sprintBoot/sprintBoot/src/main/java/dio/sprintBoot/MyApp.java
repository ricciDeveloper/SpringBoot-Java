package dio.sprintBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/*Aqui declaramos como componente, para que não seja feito a instância deste componente
*/
@Component
public class MyApp implements CommandLineRunner {
    /*@autowired para injetar o método sem instância*/
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado da soma: " + calculadora.somar(10,5));
    }
}
