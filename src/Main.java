import entidade.Cliente;
import entidade.Pedido;
import entidade.PedidoDoItem;
import entidade.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        Pedido ped = new Pedido();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Produto p = new Produto("TV", 1000.0);

        PedidoDoItem pi = new PedidoDoItem(2,1000.0,p);
        ped.adicionaItem(pi);

        Cliente cli = new Cliente("Eric", "eric",sdf.parse("18/02/1998"));

        System.out.println(cli);
        System.out.println(pi);
        System.out.println(ped.totalDaCompra());
    }
}
