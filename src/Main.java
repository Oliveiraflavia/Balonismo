import Combustivel.Combustivel;

public class Main {
    public static void main(String[] args) {
        // Construir objetos e atribuir valores aos atributos

        // Construir um balão utilizando o construtor padrão
        Balao balao1 = new Balao();
        balao1.setId(1);
        balao1.setRegistros("ABC123");
        balao1.setCor("dourado");
        balao1.setTipo("Modelo 3 Plus");
        balao1.setAltura(50.0);
        balao1.setPeso(500.0);
        balao1.setCapacidade(4);
        balao1.setValorBalao(2000.0);

        // Construir um balão utilizando o construtor que solicita todos os dados
        Balao balao2 = new Balao(2, "DEF456", "Azul", "Modelo B", 60.7, 600.0, 6, 2500.0);

        // Construir um balão utilizando o construtor personalizado
        Balao balao3 = new Balao("GHI789", "Verde", 70.9, 700.0);

        // Construir uma pessoa utilizando o construtor padrão
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Mariana Ana Paula");
        pessoa1.setCpf("345.986.123.20");
        pessoa1.setRg("987654321");
        pessoa1.setTelefone(12345678);
        pessoa1.setTelefoneContatoFamiliar(1140028922);
        pessoa1.setAssinatura("AnaPaula");

        // Construir uma pessoa utilizando o constr
    }
}