package dio.sprintBoot;

import org.springframework.stereotype.Component;
/*Aqui declaramos como componente, para que não seja feito a instância deste componente
* */
@Component
public class Calculadora {
    public int somar (int numero1, int numero2){
        return numero1+numero2;
    }
}
