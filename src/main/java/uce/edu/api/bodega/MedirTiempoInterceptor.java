package uce.edu.api.bodega;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

// Esta clase es un interceptor que se va a encargar de medir el tiempo que tarda en ejecutarse un metodo marcado con la anotacion @MedirTiempo
@MedirTiempo
// Con esta anotacion le indicamos que esta clase es un interceptor, es decir, que va a interceptar los metodos marcados con la anotacion @MedirTiempo
@Interceptor
public class MedirTiempoInterceptor {

    // Con esta anotacion le indicamos que este metodo se va a ejecutar alrededor del metodo interceptado, es decir, que se va a ejecutar antes y despues del metodo interceptado
    // Ejecutar alrededor de la ejecucion del metodo interceptado, es decir, que se va a ejecutar antes y despues del metodo interceptado
    @AroundInvoke
    public Object medirTiempo(InvocationContext context) throws Exception {
        System.out.println("Se ejecuto antes del tiempo. ");
        long inicio = System.currentTimeMillis();
        
        // Inicia la ejecucion del metodo
        // Sino se llama al metodo proceed, no se ejecutaria el metodo
        Object resultado =context.proceed(); // Continuar con la ejecucion del metodo interceptado
        // Pasa a la siguiente linea, una vez que se termine de ejeecutar el metodo interceptado, es decir, que se va a ejecutar despues del metodo interceptado

        long fin = System.currentTimeMillis();
        long tiempoTranscurrido = fin - inicio;
        System.out.println("Tiempo Transcurrido: " + tiempoTranscurrido + " ms");
        
        return resultado; // Retorna el resultado del metodo interceptado
    }

}
