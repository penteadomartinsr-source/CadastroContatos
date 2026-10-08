import java.util.ArrayList;

public class ContatoDAO implements DAO<Contato> {

    private ArrayList<Contato> lista = new ArrayList<>();

    @Override
    public void inserir(Contato obj) {
        lista.add(obj);
    }

    @Override
    public boolean atualizar(Contato obj) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getId() == obj.getId()) {
                lista.set(i, obj);
                return true;
            }
        }

        return false;
    }

    @Override
    public Contato ler(int id) {

        for (Contato contato : lista) {

            if (contato.getId() == id) {
                return contato;
            }
        }

        return null;
    }

    @Override
    public boolean apagar(int id) {

        Contato contato = ler(id);

        if (contato != null) {
            lista.remove(contato);
            return true;
        }

        return false;
    }
}