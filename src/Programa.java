public class Programa {
    
    private Integer MemoriaRAMAlocada;
    private Integer SSDOcupado;
    private Integer Nucleos;
    private Integer QuantidadeOperacoes;


    public Programa(Integer MemoriaRAMAlocada, Integer SSDOcupado, Integer Nucleos, Integer QuantidadeOperacoes) {
        this.MemoriaRAMAlocada = MemoriaRAMAlocada;
        this.SSDOcupado = SSDOcupado;
        this.Nucleos = Nucleos;
        this.QuantidadeOperacoes = QuantidadeOperacoes;
    }

    public Integer getMemoriaRAMAlocada() {
        return this.MemoriaRAMAlocada;
    }

    public void setMemoriaRAMAlocada(Integer MemoriaRAMAlocada) {
        this.MemoriaRAMAlocada = MemoriaRAMAlocada;
    }

    public Integer getSSDOcupado() {
        return this.SSDOcupado;
    }

    public void setSSDOcupado(Integer SSDOcupado) {
        this.SSDOcupado = SSDOcupado;
    }

    public Integer getNucleos() {
        return this.Nucleos;
    }

    public void setNucleos(Integer Nucleos) {
        this.Nucleos = Nucleos;
    }

    public Integer getQuantidadeOperacoes() {
        return this.QuantidadeOperacoes;
    }

    public void setQuantidadeOperacoes(Integer QuantidadeOperacoes) {
        this.QuantidadeOperacoes = QuantidadeOperacoes;
    }

}
