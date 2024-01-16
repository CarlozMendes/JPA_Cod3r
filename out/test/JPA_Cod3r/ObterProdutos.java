package teste.basico;

import infra.ProdutoDAO;
import org.basico.Produto;

import java.util.List;

public class ObterProdutos {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterAtomico();
        for (Produto produto: produtos){
            System.out.println("ID: "+ produto.getId()+", Nome: "+produto.getNome());
        }
        double precoTotal = produtos.stream().map(p-> p.getPreco()).reduce(0.0,(t,p) ->t + p).doubleValue();
        System.out.println("O valor total é R$ "+precoTotal);
        dao.fechar();
    }
}
