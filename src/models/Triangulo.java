package models;

import java.util.Scanner;

public class Triangulo {
    Scanner read = new Scanner(System.in);
    double lado1;
    double lado2;
    double lado3;


    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public String DefinirClassificacaoDoTriangulo() {
        if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
            return "Equilatero";
        }
        else if (this.lado1 == this.lado2 || this.lado1 == this.lado3 || this.lado2 == this.lado3) {
            return "Isosceles";
        }
        else {
            return "Escaleno";
        }
    }


    public double calculaArea(){
        double area;
        if(DefinirClassificacaoDoTriangulo().equals("Equilátero")){
            area = (Math.pow(lado1, 2) * Math. sqrt(3)) / 4;
            return area;
        }

        else if(DefinirClassificacaoDoTriangulo().equals("Isósceles")){
            double eq = Math.pow(this.lado1, 2) - (Math.pow(this.lado3, 2) / 4);
            double altura = Math.sqrt(eq);
            area = 2 * ((altura) * (this.lado2));
            return area;
        }

        else{
            double S = (this.lado1 + this.lado2 + this.lado3) / 2;
            double eq = S*((S-this.lado1)*(S-this.lado2)*(S-this.lado3));
            area = Math.sqrt(eq);
            return area;
        }
    }

    public double calculaPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }

    public String toString() {
        return "Classificação do Triângulo: " + DefinirClassificacaoDoTriangulo() + "\nÁrea do Triângulo: " + String.format("%.2f", calculaArea()) + "\nPerímetro do Triângulo: " + calculaPerimetro();
    }
}
