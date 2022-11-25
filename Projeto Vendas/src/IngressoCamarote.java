public class IngressoCamarote extends Ingresso{

    public IngressoCamarote(String nome, String CPF, Evento evento) {
        super(nome, CPF, evento);
    }    
    
    @Override
     public double calcularValorIngresso(){
        return getEvento().getValorUnico() + ((getEvento().getValorUnico() / 100) * 60);
    }
    @Override
    public void imprimirValor(){
        System.out.println("Ingresso: Camarote\nValor do Camarote: "+calcularValorIngresso());
    }
  
}
