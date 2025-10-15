
package carneiro.exemploobjeto01;

class Retangulo {
    private double largura;
    private double comprimento;
    
    public Retangulo() {
        System.out.println("Sem parametros");
        this.comprimento = 10.0;
        this.largura = 10.0;
    }
    
    public Retangulo(double c, double l) {
        System.out.println("dois doubles");
        this.comprimento = c;
        this.largura = l;
    }

    public void setComprimento(double c) {
        comprimento = c;
    }

    public void setLargura(double l) {
        largura = l;
    }

    public double getArea() {
        return largura * comprimento;
    }
    
    public double getLargura() {
        return largura;
    }
    
    public double getComprimento() {
        return comprimento;
    }
}

public class ExemploObjeto01 {

    public static void main(String[] args) {
        
        System.out.println("\n\nFazendo o primeiro objeto\n");
        
        Retangulo campo1 = new Retangulo();
        Retangulo campo2 = new Retangulo(3.7, 8.2);
        Retangulo campo3 = new Retangulo(3, 8.4);
        Retangulo campo4 = new Retangulo(3.7, 8);
        
        System.out.println("\narea: "+ campo1.getArea());
        
        campo1.setComprimento(100);
        campo1.setLargura(50);
        
        System.out.println("\nlargura: "+campo1.getLargura() + 
                            "\ncomprimento: "+campo1.getComprimento() + 
                            "\narea: "+campo1.getArea());

        //Retangulo campo2 = new Retangulo();

        campo2.setComprimento(25);
        campo2.setLargura(70);

        if (campo1.getArea() > campo2.getArea()) {
            System.out.println("\nO campo 1 é maior que o campo 2");
        } else if (campo1.getArea() < campo2.getArea()) {
            System.out.println("\nO campo 2 é maior que o campo 1");
        } else {
            System.out.println("\nOs campos são iguais");
        }
    }
}
