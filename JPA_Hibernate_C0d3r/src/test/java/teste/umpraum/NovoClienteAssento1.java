package teste.umpraum;

import infra.DAO;
import org.umpraum.Assento;
import org.umpraum.Cliente;

public class NovoClienteAssento1 {
    public static void main(String[] args) {
        Assento assento = new Assento("23F");
        Cliente cliente = new Cliente("Bia",assento);

        DAO<Object> dao = new DAO<>();
        // Primeiro devo inserir o assento, pois tem que existir a tabela dele para ele ser
        // uma FK na tabela cliente.

        dao.abrirT().incluirT(assento).incluirT(cliente).fecharT().fechar();

    }
}
