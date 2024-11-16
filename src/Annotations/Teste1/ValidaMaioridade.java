package Annotations.Teste1;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation personalizada
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public  @interface ValidaMaioridade {
    // Mensagem padrão para validação
    String mensagem() default "A idade deve ser maior ou igual a 18";
}
