import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        ContatoDAO dao = new ContatoDAO();


        Contato contato = new Contato(
                1,
                "João",
                "12345678900",
                LocalDate.of(2000, 5, 10),
                "99999-9999",
                "joao@email.com",
                "Rua A",
                "Amigo"
        );

        dao.inserir(contato);

        System.out.println("Contato inserido!");


        Contato encontrado = dao.ler(1);

        if (encontrado != null) {
            System.out.println("Nome: " + encontrado.getNome());
            System.out.println("CPF: " + encontrado.getCpf());
            System.out.println("Telefone: " + encontrado.getTelefone());
            System.out.println("E-mail: " + encontrado.getEmail());
        }


        contato.setTelefone("98888-8888");

        if (dao.atualizar(contato)) {
            System.out.println("Contato atualizado!");
        }


        if (dao.apagar(1)) {
            System.out.println("Contato apagado!");
        }
    }
}