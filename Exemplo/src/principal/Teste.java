package principal;

import java.util.*;

public class Teste{
  @SuppressWarnings("unchecked")
  public static void main(String[] args){
    
    // cria uma nova instância de HashMap
    HashMap cidadesHabitantes = new HashMap();
    
    // vamos adicionar algumas chaves e seus valores
    cidadesHabitantes.put("Goiânia", new Integer(4334598));
    cidadesHabitantes.put("São Paulo", new Integer(49282768));
    cidadesHabitantes.put("Brasília", new Integer(96736887));   
 
    // vamos obter uma view dos mapeamentos
    Set set = cidadesHabitantes.entrySet();

    // obtemos um iterador
    Iterator i = set.iterator();

    // e finalmente exibimos todas as chaves e seus valores
    while(i.hasNext()){
      Map.Entry entrada = (Map.Entry)i.next();
      System.out.println("Chave: " + entrada.getKey() + 
        " - Valor: " + entrada.getValue());
    }

    System.exit(0);
  }
}