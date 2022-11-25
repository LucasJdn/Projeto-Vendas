public abstract class Ingresso {

    private String nome;
    private String CPF;
    private Evento evento;

    public Ingresso(String nome, String CPF, Evento evento) {
        this.nome = nome;
        this.CPF = CPF;
        this.evento = evento;
    }
     public void mostrarResumo(){
        System.out.println("Nome: "+getNome() + "\nCpf: "+getCPF() + "\nEvento: "+getEvento().getNome() + "\nData: "+getEvento().getData());
    }
     public void imprimirValor(){
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    public double calcularValorIngresso(){
        return getEvento().getValorUnico();
    }
   
   
    
}
