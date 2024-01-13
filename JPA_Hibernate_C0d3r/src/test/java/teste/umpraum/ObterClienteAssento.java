package teste.umpraum;

import infra.DAO;
import org.umpraum.Assento;
import org.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
        Cliente cliente = daoCliente.obterPorID(1L);
        System.out.println(cliente.getAssento().getNome());
        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorID(2L);
        System.out.println(cliente.getAssento().getCliente().getNome());
        daoAssento.fechar();

    }
}
