public class Computador {
    private Integer SSD;
    private Integer MemoriaRAM;
    private Integer Nucleo;
    private Double OperacoesPorSegundo;

    public Computador (Integer SSD, Integer MemoriaRAM, Integer Nucleo, Double OperacoesPorSegundo) {
        this.MemoriaRAM = MemoriaRAM;
        this.SSD = SSD;
        this.Nucleo = Nucleo;
        this.OperacoesPorSegundo = OperacoesPorSegundo;
    }

    public Integer getSSD() {
        return this.SSD;
    }

    public void setSSD(Integer SSD) {
        this.SSD = SSD;
    }

    public Integer getMemoriaRAM() {
        return this.MemoriaRAM;
    }

    public void setMemoriaRAM(Integer MemoriaRAM) {
        this.MemoriaRAM = MemoriaRAM;
    }

    public Integer getNucleo() {
        return this.Nucleo;
    }

    public void setNucleo(Integer Nucleo) {
        this.Nucleo = Nucleo;
    }

    public Double getOperacoesPorSegundo() {
        return this.OperacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(Double OperacoesPorSegundo) {
        this.OperacoesPorSegundo = OperacoesPorSegundo;
    }
        
    
}
 