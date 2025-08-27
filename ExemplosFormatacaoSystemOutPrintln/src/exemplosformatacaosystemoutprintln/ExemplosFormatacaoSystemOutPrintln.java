package exemplosformatacaosystemoutprintln;

import java.util.Date;             // para pegar a data de hoje
import java.text.SimpleDateFormat; // para formatar o modo de mostrar a data
import java.text.NumberFormat;     // para formatar o modo de mostrar o salario
import java.util.Locale;           // para definir localizações regionais (idiomas e formatações específicas de cada país)

public class ExemplosFormatacaoSystemOutPrintln {

    public static void main(String[] args) {

        String nome    = "João";
        int    idade   = 30;
        double salario = 12345.6789;

        // Concatenar Strings
        System.out.println("Nome: " + nome + ", Idade: " + (idade+10) + "\n");

        // Placeholders Simples
        System.out.printf("Nome: %s, Idade: %d \n", nome, idade );

        // Formatando Números Decimais
        System.out.printf("Salário: %.2f%n \n", salario );

        // Alinhamento de Strings
        System.out.printf("Nome: %-10s Idade: %d \n", nome, idade );  // Alinhado à esquerda
        System.out.printf("Nome: %10s Idade: %d \n", nome, idade);   // Alinhado à direita

        // Preenchimento com Zeros
        int numero = 42;
        System.out.printf("Número: %05d \n", numero );  // Saída: Número: 00042

        // Formatando Datas
        Date data = new Date(); // Obtém a data atual
        
        System.out.printf("Data: %tF %tT \n", data, data );  // Formato ISO 8601

        // Define o formato desejado: "dd/MM/yyyy"
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        // Formata a data e imprime
        System.out.println("Data formatada: " + formato.format(data) +"\n" );

        // Múltiplos Argumentos
        System.out.printf("Nome: %s, Idade: %d, Salário: %.2f \n", nome, idade, salario );

        // Formatação para o Brasil (pt-BR)
        Locale localBrasil = Locale.of("pt", "BR");
        NumberFormat formatoBR = NumberFormat.getInstance(localBrasil);

        // Definir o número de casas decimais
        formatoBR.setMinimumFractionDigits(2);
        formatoBR.setMaximumFractionDigits(2);
        
        System.out.println("Brasil: " + formatoBR.format(salario)); 
    }
    
}
