public class Main {
    
    public static void main(String[] args) {
   
        System.out.println("Configurando o ambiente...");
        Computador meuPC = new Computador(16, 512, 8, 4.2);
        System.out.println("Computador criado com: " + meuPC.getMemoriaRAM() + "GB RAM, " + meuPC.getSSD() + "GB SSD.");

        SistemaOp windows = new SistemaOp(meuPC);
        System.out.println("Sistema Operacional instalado.");

        System.out.println("Cenário 1: Execução com Sucesso");
        Programa navegador = new Programa(4, 20, 2, 1000000);
        windows.executarPrograma(navegador);

        System.out.println("Cenário 2: Erro na Instalação (SSD)");
        Programa jogoPesado = new Programa(8, 600, 6, 5000000); 
        windows.executarPrograma(jogoPesado);

        System.out.println("Cenário 3: Erro na Execução (RAM) ");
        Programa maquinaVirtual = new Programa(20, 100, 4, 2000000); 
        windows.executarPrograma(maquinaVirtual);
    }
}


