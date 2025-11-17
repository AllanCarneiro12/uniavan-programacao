/*  
A empresa ViapTech Mobile Systems está desenvolvendo um simulador de smartphones para uso interno em 
seus laboratórios de pesquisa e desenvolvimento. 
O objetivo do projeto é testar o comportamento de novos modelos de smartphones antes de serem lançados 
no mercado, observando como o consumo de bateria, o uso de armazenamento e a conectividade afetam o 
desempenho geral do dispositivo. 
Você foi contratado como desenvolvedor para criar uma classe que represente um smartphone, capaz de 
simular situações reais do cotidiano. 
Essa classe será utilizada futuramente em um sistema mais amplo de simulação, portanto deve ser bem 
estruturada, modular, clara e realista. 
A proposta é criar uma representação completa de um aparelho moderno, com atributos e comportamentos 
que correspondam à sua operação no mundo real. 
1. Estrutura e características 
 
A classe deve conter atributos privados que representem tanto as características físicas do smartphone quanto 
seu estado atual de funcionamento. 
 
Esses atributos precisam descrever o aparelho de forma completa, contemplando aspectos como: 
• Identificação e aparência (marca, modelo, cor) 
• Energia e funcionamento (nível atual de bateria e estado ligado/desligado) 
• Capacidade de armazenamento (total e disponível, em GB) 
• Conectividade (indicação se está ou não conectado a uma rede Wi-Fi) 
• Recursos multimídia (resolução máxima da câmera fotográfica, em megapixels) 
 
Essas informações deverão ser manipuladas apenas por meio dos métodos definidos pela classe, respeitando 
o princípio do encapsulamento. 
 
2. Comportamentos esperados 
 
A classe deve oferecer métodos públicos que permitam realizar ações típicas de um smartphone.  
Essas ações precisam refletir comportamentos lógicos e plausíveis, considerando sempre o estado atual do 
aparelho.  
Entre os comportamentos esperados estão: 
 
A) Ao ser criado, o smartphone deve receber as principais informações de identificação (como marca, modelo e 
cor), além da capacidade total de armazenamento e a resolução máxima da câmera. 
Por padrão, o aparelho deve iniciar com: 
• 100% de carga na bateria, 
• estado desligado, 
• 60% do armazenamento interno disponível, 
• e Wi-Fi desconectado. 
 
Esses valores iniciais simulam um aparelho recém-saído da caixa, pronto para configuração. 
 
B) O sistema deve permitir ligar e desligar o smartphone. 
As ações devem respeitar o estado atual do aparelho — não é coerente tentar ligar algo que já está ligado ou 
desligar algo que já está desligado. 
Essas operações devem alterar corretamente o estado interno do objeto, podendo também exibir mensagens 
informativas ao usuário. 
 
C) O smartphone deve ser capaz de receber carga de bateria em uma determinada porcentagem. 
É importante garantir que o nível de energia nunca ultrapasse 100%. 
Essa simulação permitirá verificar o comportamento do sistema em diferentes níveis de energia e será essencial 
para outras ações dependentes de bateria. 
 
D) O sistema deve permitir a instalação de aplicativos, simulando o processo real. 
Para isso, é necessário considerar: 
• o tamanho do aplicativo em relação ao espaço disponível, 
• o fato de o aparelho precisar estar ligado e conectado à rede Wi-Fi, 
• e a redução do espaço livre após a instalação bem-sucedida. 
 
Caso não haja espaço suficiente, ou se o smartphone estiver desligado ou desconectado, a instalação deve ser 
impedida. 
Essa etapa é importante para testar o controle de armazenamento e o gerenciamento de recursos. 
 
E) A classe deve possibilitar conectar e desconectar o smartphone de uma rede Wi-Fi. 
Essa funcionalidade deve alterar o estado de conectividade do aparelho e permitir o uso de recursos que 
dependem da internet, como a instalação de aplicativos ou o consumo de mídia. 
 
F) O smartphone deve permitir assistir a vídeos, simulando o consumo de bateria em tempo real. Os vídeos são 
mensurados por segundos. 
Cada segundo de vídeo reproduzido deve reduzir a bateria em 2%. 
Se a reprodução completa do vídeo fizer com que a bateria fique abaixo de 10%, a reprodução não deve ser 
iniciada. 
Essa funcionalidade reforça o controle lógico do estado da bateria e a importância de gerenciar recursos de 
energia. 
 
G) O sistema deve oferecer um método que exiba todas as informações atuais do aparelho de forma organizada, 
legível e completa. 
Devem ser mostrados todos os atributos relevantes, como marca, modelo, cor, nível de bateria, espaço 
disponível, estado do Wi-Fi, resolução da câmera e situação do aparelho (ligado ou desligado). 
Essa exibição serve para verificar se as operações anteriores estão sendo executadas corretamente.  
 
*/


package carneiro.trabalhocelularclass;

public class Celular {

    // Atributos
    private String marca;
    private String modelo;
    private String cor;
    private int nivelBateria; // em porcentagem
    private boolean ligado;
    private int armazenamentoTotal; // em GB
    private int armazenamentoDisponivel; // em GB
    private boolean wifiConectado;
    private int resolucaoCamera; // em megapixels

    // Construtor
    public Celular(String marca, String modelo, String cor, int armazenamentoTotal, int resolucaoCamera) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.armazenamentoTotal = armazenamentoTotal;
        this.resolucaoCamera = resolucaoCamera;
        this.nivelBateria = 100;
        this.ligado = false;
        this.armazenamentoDisponivel = (int)(armazenamentoTotal * 0.6); // 60% disponível
        this.wifiConectado = false;
    }

    // Métodos (a serem implementados conforme os requisitos)

    // B) Ligar o smartphone
    public void ligar() {
        if (ligado) {
            System.out.println("O smartphone já está ligado.");
        } else {
            ligado = true;
            System.out.println("Smartphone ligado com sucesso.");
        }
    }

    // B) Desligar o smartphone
    public void desligar() {
        if (!ligado) {
            System.out.println("O smartphone já está desligado.");
        } else {
            ligado = false;
            System.out.println("Smartphone desligado com sucesso.");
        }
    }

    // C) Carregar bateria
    public void carregarBateria(int porcentagem) {
        nivelBateria += porcentagem;
        if (nivelBateria > 100) {
            nivelBateria = 100;
        }
        System.out.println("Bateria carregada. Nível atual: " + nivelBateria + "%");
    }

    // D) Instalar aplicativo
    public void instalarAplicativo(String nomeApp, int tamanhoApp) {
        if (!ligado) {
            System.out.println("Não é possível instalar aplicativo. O smartphone está desligado.");
            return;
        }
        if (!wifiConectado) {
            System.out.println("Não é possível instalar aplicativo. Conecte-se ao Wi-Fi primeiro.");
            return;
        }
        if (tamanhoApp > armazenamentoDisponivel) {
            System.out.println("Espaço insuficiente para instalar " + nomeApp + ". Disponível: " + armazenamentoDisponivel + "GB, Necessário: " + tamanhoApp + "GB");
            return;
        }
        armazenamentoDisponivel -= tamanhoApp;
        System.out.println("Aplicativo " + nomeApp + " instalado com sucesso. Espaço disponível: " + armazenamentoDisponivel + "GB");
    }

    // E) Conectar Wi-Fi
    public void conectarWifi() {
        if (wifiConectado) {
            System.out.println("O Wi-Fi já está conectado.");
        } else {
            wifiConectado = true;
            System.out.println("Wi-Fi conectado com sucesso.");
        }
    }

    // E) Desconectar Wi-Fi
    public void desconectarWifi() {
        if (!wifiConectado) {
            System.out.println("O Wi-Fi já está desconectado.");
        } else {
            wifiConectado = false;
            System.out.println("Wi-Fi desconectado com sucesso.");
        }
    }

    // F) Assistir vídeo
    public void assistirVideo(int segundos) {
        int consumoBateria = segundos * 2;
        if (nivelBateria - consumoBateria < 10) {
            System.out.println("Bateria insuficiente para reproduzir o vídeo. Nível atual: " + nivelBateria + "%");
            return;
        }
        nivelBateria -= consumoBateria;
        System.out.println("Vídeo reproduzido por " + segundos + " segundos. Bateria restante: " + nivelBateria + "%");
    }

    // G) Exibir informações
    public void exibirInformacoes() {
        System.out.println("\n=== Informações do Smartphone ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Resolução da Câmera: " + resolucaoCamera + " MP");
        System.out.println("Nível de Bateria: " + nivelBateria + "%");
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Armazenamento Total: " + armazenamentoTotal + " GB");
        System.out.println("Armazenamento Disponível: " + armazenamentoDisponivel + " GB");
        System.out.println("Wi-Fi: " + (wifiConectado ? "Conectado" : "Desconectado"));
        System.out.println("================================\n");
    }

    // Getters e Setters (para acesso controlado aos atributos)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getArmazenamentoTotal() {
        return armazenamentoTotal;
    }

    public int getArmazenamentoDisponivel() {
        return armazenamentoDisponivel;
    }

    public boolean isWifiConectado() {
        return wifiConectado;
    }

    public int getResolucaoCamera() {
        return resolucaoCamera;
    }
    
}
