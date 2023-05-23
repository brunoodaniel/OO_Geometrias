import services.ManipuladorDeElementos;
import models.Circulo;
import models.Quadrilatero;
import models.Triangulo;


public class Principal {
    public static void main(String[] args) {
        ManipuladorDeElementos gerenciador = new ManipuladorDeElementos();
        Triangulo t1 = new Triangulo(12, 12, 12);
        Circulo c1 = new Circulo(9);
        Quadrilatero q1 = new Quadrilatero(3, 3);

        gerenciador.obterInformacoes(t1);
        gerenciador.obterInformacoes(t1, c1);
        gerenciador.obterInformacoes(t1, c1, q1);

    }
}
