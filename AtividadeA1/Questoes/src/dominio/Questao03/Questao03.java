package dominio.Questao03;

import dominio.BaseQuestoes;

public class Questao03 extends BaseQuestoes{
    Long tempCelsius;

    public Long getTempCelsius() {
        return tempCelsius;
    }

    public void setTempCelsius(Long tempCelsius) {
        this.tempCelsius = tempCelsius;
    }
    
    public void Executar() {
        System.out.println("----- Questão 3 - Conversão de temperaturas -----");
        System.out.println("");
        System.out.println("Insira a temperatura, em Celsius: ");
        tempCelsius = scanear.nextLong();
        System.out.println("------------------------------------------------------");
        converterFahrenheit(tempCelsius);
        System.out.println("------------------------------------------------------");
        System.out.println("");
    }

    public void converterFahrenheit(Long x) {
        Double conversao = (x * 1.8) + 32;
        System.out.println("A temperatura, convertida para Fahrenheit é de " + conversao + "°");
    }
}
