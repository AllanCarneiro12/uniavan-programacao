
package carneiro.idadevivida;

import java.util.Scanner;

public class IdadeVivida {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        final int DIA_HOJE = 26, MES_HOJE = 8, ANO_HOJE = 2025;
        int diaNasc,mesNasc,anoNasc;

        int diasAteHoje, diasAteNascimento;
        
        System.out.println("Insira sua data de nascimento DD/MM/AAAA");
        diaNasc = kb.nextInt();
        mesNasc = kb.nextInt();
        anoNasc = kb.nextInt();
        
        int diasViv, mesesVividos, anosVividos;
        
        // if (MES_HOJE >= mesNasc){
        //     if (DIA_HOJE >= diaNasc){
        //         anosVividos = ANO_HOJE - anoNasc;
        //     }else{
        //         anosVividos = ANO_HOJE - anoNasc-1;
        //     }
        // }else{
        //     anosVividos = ANO_HOJE - anoNasc-1;
        // }
        
        // diasViv = diaNasc + (mesNasc * 30) + (anosVividos * 360);
        // System.out.println("dias vividos: "+diasViv);

        diasAteHoje = (ANO_HOJE-1) *360 + (MES_HOJE-1) * 30 + DIA_HOJE;
        diasAteNascimento = (anoNasc - 1) *360 + (mesNasc - 1) *30 +diaNasc;
        diasViv = diasAteHoje - diasAteNascimento;
        
        System.out.println("dias vividos: "+diasViv);
        
        
    }
}
