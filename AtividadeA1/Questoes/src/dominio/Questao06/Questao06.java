package dominio.Questao06;

import dominio.BaseQuestoes;

public class Questao06 extends BaseQuestoes{
    int hrInicio, minInicio, hrFinal, minFinal;

    public int getHrInicio() {
        return hrInicio;
    }

    public void setHrInicio(int hrInicio) {
        this.hrInicio = hrInicio;
    }

    public int getMinInicio() {
        return minInicio;
    }

    public void setMinInicio(int minInicio) {
        this.minInicio = minInicio;
    }

    public int getHrFinal() {
        return hrFinal;
    }

    public void setHrFinal(int hrFinal) {
        this.hrFinal = hrFinal;
    }

    public int getMinFInal() {
        return minFinal;
    }

    public void setMinFInal(int minFinal) {
        this.minFinal = minFinal;
    }
    
    public void Executar() {
        System.out.println("----- Questão 6 - Duração do jogo -----");
        System.out.println("");
        System.out.println("Insira o horário de início do jogo, no formato Hora:Minuto;");
        hrInicio = scanear.nextInt(); minInicio = scanear.nextInt();
        System.out.println("Insira o horário de término do jogo, seguindo o mesmo formato Hora:Minuto");
        hrFinal = scanear.nextInt(); minFinal = scanear.nextInt();
        System.out.println("--------------------------------------------------");
        calcularDuracaoJogo(hrInicio, hrFinal, minInicio, minFinal);
        System.out.println("--------------------------------------------------");
        System.out.println("");
    }
    
    public void calcularDuracaoJogo(int x, int y, int a, int b) {
        int resultadoHr, resultadoMin;
        if (x == y) {
            System.out.println("O jogo chegou ao limite de duração (24 horas), portanto não é válido");
        } 
        else if (x < y) {
            resultadoHr = y - x;
            resultadoMin = b - a;
            resultadoMin = Math.abs(b - a);
            System.out.println("A duração do jogo foi de " + resultadoHr + " horas e " + resultadoMin + " minutos");
        }
        else if (x > y) {
            resultadoHr = 24 - y;
            resultadoMin = Math.abs(b - a);
            //Math.abs converte o numero em seu modulo
            System.out.println("A duração do jogo foi de " + resultadoHr + " horas e " + resultadoMin + " minutos");
        }
        else {
            resultadoHr = (24 - y) + x;
            resultadoMin = b - a;
            resultadoMin = Math.abs(b - a);
            System.out.println("A duração do jogo foi de " + resultadoHr + " horas e " + resultadoMin + " minutos");
        }
    }
}
