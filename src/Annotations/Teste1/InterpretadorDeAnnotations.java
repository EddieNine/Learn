package Annotations.Teste1;

import java.lang.reflect.Method;

public class InterpretadorDeAnnotations {

    public static void validar(Object obj) {
        // Obter a classe do objeto
        Class<?> clazz = obj.getClass();

        // Iterar pelos métodos da classe
        for (Method metodo : clazz.getDeclaredMethods()) {
            // Verificar se o método tem a annotation @ValidaMaioridade
            if(metodo.isAnnotationPresent(ValidaMaioridade.class))
            try {
                // Invocar o método para executar a validação
                metodo.invoke(obj);
            } catch (Exception e) {
                System.out.println("Erro de validação: " + e.getCause().getMessage());
            }
        }
    }
}
