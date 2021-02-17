
package revcaneta;

public class RevCaneta {

    //metodo principal
    public static void main(String[] args) {
        
        //instanciar objeto da classe caneta
        Caneta c1 = new Caneta();
        c1.cor = "Azul"; //referencia a atributo
        c1.ponta = 0.5f;
        c1.tampar();
        //c1.status(); //referencia ao metedo tem paretentes
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Novo modelo";
        c2.cor = "Vermelha";
        c2.destampar();
        c2.rabiscar();
        
    }
    
}
