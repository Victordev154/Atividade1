public class SistemaOp {

    private Computador computador;

    public SistemaOp(Computador computador) {
        this.computador = computador;
    }

    public Computador getComputador() {
        return this.computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public boolean executarPrograma (Programa p) {
        System.out.println("Verificando o programa, aguarde....");

        if(p.getSSDOcupado()>this.computador.getSSD()){
            System.out.println("Erro: SSD insuficiente");
            return false;
        }
         if (p.getMemoriaRAMAlocada() > this.computador.getMemoriaRAM()) {
            System.out.println("Erro: Memoria RAM insuficiente.");
            return false;
        }

        System.out.println("SUCESSO: Programa executado");

        Double tempoExecucao = (double) p.getQuantidadeOperacoes() /(this.computador.getOperacoesPorSegundo() * this.computador.getNucleo());

        System.out.printf(" Tempo de execução: %.2f segundos.%n", tempoExecucao);

        return true;
    }
}

    
    

