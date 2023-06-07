import Combustivel.Combustivel;

public class Balao {

        //Atributos
        int id;
        String registros;
        String cor;
        String tipo;
        double altura;
        double peso;
        int capacidade;
        double valorBalao;

        //Métodos
        public String voar(Combustivel gasPropano){
            return "voando com" + gasPropano;
        }
    }
