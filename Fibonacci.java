import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args) {         
        
        ArrayList<Integer> adicionados = new ArrayList<Integer>();
        //Instancia a classe importada ArrayList como array "adicionados" para receber os valores gerados pela sequencia de Fibonacci

        int a = 0;
        int b = 1;
        int soma = (a + b);     //Inicializa "soma" com a soma de "a"+"b"

        while (soma <= 2000) {

            adicionados.add(soma); //Adiciona o resultado de "soma" no array "adicionados"
            a = b;
            b = soma;
            soma = (a + b);     //Atualiza "soma" para o próximo número Fibonacci
            
        }

        for(Integer sequencia : adicionados) {      //percorre cada elemento no array "adicionados" e armazena em "sequencia" 
            System.out.println(sequencia);          //retorna os valores de "sequencia"
        }

    }
}
