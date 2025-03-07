public class Cliente extends Pessoa implements IAutenticavel {

    public Cliente(String nome, int idade, String cpf, String endereco, String telefone) {
        super(nome, idade, cpf, endereco, telefone);
    }

    @Override
    public void validarIdade() {
        if (getIdade() >= 18) {
            System.out.println("Cliente " + getNome() + " é maior de idade.");
        } else {
            System.out.println("Cliente " + getNome() + " é menor de idade.");
        }
    }

    @Override
    public void validarDocumento() {
        System.out.println("CPF do cliente " + getNome() + " validado: " + getCpf());
    }

    @Override
    public void login() {
        System.out.println("Cliente " + getNome() + " fez login.");
    }
}