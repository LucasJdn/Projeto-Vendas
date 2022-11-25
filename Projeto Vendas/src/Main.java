
public class Main {

    public static void main(String[] args) {
        Evento evento1 = new Evento("SHOW", "12/12/2022",50 , 1);
        Evento evento2 = new Evento("FESTIVAL", "06/03/2022", 1000, 150);
        Evento evento3 = new Evento("RAVE", "06/12/2022", 25000, 50);
        Evento evento6 = new Evento("SHOW", "08/03/2022", 1000, 150);
        
        Ingresso ingressoPista1 = new IngressoPista("Carlos", "12345678910", evento1);        
        Ingresso ingressoVip1 = new IngressoPista("José", "1098765432511", evento2);        
        Ingresso ingressoCamorote1 = new IngressoPista("Jhonatan ", "151946872", evento6);
        Ingresso ingressoPista2 = new IngressoPista("Jefferson", "36785712589", evento3);        
        Ingresso ingressoVip2 = new IngressoPista("João", "798156495887", evento2);        
 
        
        
        ingressoPista1.imprimirValor();
        ingressoPista1.mostrarResumo();        
        evento1.venderIngresso(ingressoPista1);
        System.out.println("########################################");
        ingressoPista1.imprimirValor();
        ingressoPista1.mostrarResumo();        
        evento1.venderIngresso(ingressoPista1);
        System.out.println("########################################");
        ingressoVip1.imprimirValor();
        ingressoVip1.mostrarResumo();
        evento1.venderIngresso(ingressoVip1);
        System.out.println("########################################");
        ingressoCamorote1.imprimirValor();
        ingressoCamorote1.mostrarResumo();
        evento2.venderIngresso(ingressoCamorote1);
        System.out.println("########################################");
        ingressoPista2.imprimirValor();
        ingressoPista2.mostrarResumo();
        evento1.venderIngresso(ingressoVip2);
        System.out.println("########################################");
    }
}
