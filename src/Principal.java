import services.ManipuladorDeElementos;
import models.Circulo;
import models.Quadrilatero;
import models.Triangulo;


public class Principal {
    public static void main(String[] args) {
        ManipuladorDeElementos gerenciador = new ManipuladorDeElementos();
        Triangulo triangulo1 = new Triangulo(5, 5, 5);
        Circulo circulo1 = new Circulo(11);
        Quadrilatero quadrilatero1 = new Quadrilatero(7, 7);

        gerenciador.obterInformacoes(triangulo1);
        gerenciador.obterInformacoes(triangulo1, circulo1);
        gerenciador.obterInformacoes(triangulo1, circulo1, quadrilatero1);

    }
}
