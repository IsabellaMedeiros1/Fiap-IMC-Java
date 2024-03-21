public class Calculo {
    //atributos
    public double peso;
    public double altura;

    //método construtor
    public Double imc;

    public Calculo(double peso, double altura){
        this.peso = peso;
        this.altura = altura;

        //double x = Math.pow(3,2) é 3²/ Math são todos os calculos

    }
    public double calcularIMC(){
        return this.peso/ Math.pow(this.altura,2);
    }

    public String exibirMensagem(){
        String mensagem;
        if (calcularIMC() <= 18.5)
            mensagem = "Seu IMC é de "+ calcularIMC()+ ", você está abaixo do peso";
        else if (calcularIMC()>= 18.6 && calcularIMC() <= 24.9)
            mensagem = "Seu IMC é de " +calcularIMC()+", você está com o peso ideal";
        else if (calcularIMC() >= 25.0 && calcularIMC() <= 29.9)
            mensagem = "Seu IMC é de "+calcularIMC()+", você está com obesidade grau |";
        else if (calcularIMC() >= 30.0 && calcularIMC() <= 39.9)
            mensagem = "Seu IMC é de "+calcularIMC()+", você está com obesidade de grau || (severa)";
        else
            mensagem = "Seu IMC é de "+calcularIMC()+", você está com obesidade ||| (mórbida)";
        return mensagem;
    }

    public double pesoIdeal(String sexo){
        if(sexo.equalsIgnoreCase("M")|| sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("Masc"))
            return 52 + (0.75 * (this.altura - 152.4));
        else
            return 52 + (0.67 * (this.altura - 152.4));
    }

}