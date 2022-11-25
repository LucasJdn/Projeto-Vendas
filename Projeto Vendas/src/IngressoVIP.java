public class IngressoVIP extends Ingresso{

    public IngressoVIP(String nome, String CPF, Evento evento) {
        super(nome, CPF, evento);
    }

    @Override
     public double calcularValorIngresso(){
        return getEvento().getValorUnico() + ((getEvento().getValorUnico() / 100) * 30);
    } 
    @Override
    public void imprimirValor(){
        System.out.println("Ingresso: Vip\nValor do Ingresso: "+calcularValorIngresso());
    }
    
}
