package teste.basico;

import infra.DAO;
import org.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Monitor 23",789.98);
        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.abrirT().incluirT(produto).fecharT().fechar();
        System.out.println("ID produto: "+produto.getId());
    }
}
