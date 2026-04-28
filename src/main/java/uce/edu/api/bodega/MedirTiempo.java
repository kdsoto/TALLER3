package uce.edu.api.bodega;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

// Con esta anotacion le indicamos que va a ser un interceptor binding, es decir, que va a ser una anotacion que se va a usar para marcar los metodos o clases que queremos interceptar
@InterceptorBinding
//se indica que esta anotacion se puede usar en metodos
// se indica que esta anotacion se puede usar en clases
@Target({ElementType.METHOD, ElementType.TYPE})
// se indica que esta anotacion se va a mantener en tiempo de ejecucion, es decir, que va a estar disponible en tiempo de ejecucion para que el interceptor pueda interceptar los metodos marcados con esta anotacion
// RUNTIME es el tiempo de ejecucion, es decir, que esta anotacion va a estar disponible en tiempo de ejecucion para que el interceptor pueda interceptar los metodos marcados con esta anotacion
@Retention(RetentionPolicy.RUNTIME)
public @interface MedirTiempo {



}
