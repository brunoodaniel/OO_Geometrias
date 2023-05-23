package models;
import java. lang. Math;
public class Circulo {
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calculaArea(){
        double area = Math.PI * Math.pow(raio, 2);
         return area;
    }

    public double calculaPerimetro(){
        double perimetro = (2 * Math.PI) * this.raio;
        return perimetro;
    }

    public String toString(){
        return "Área do cículo: " + String.format("%.2f", calculaArea()) + "\nPerímetro do círculo: " + String.format("%.2f", calculaPerimetro()) + "\nRaio do círuclo: " + this.raio;
    }
}
