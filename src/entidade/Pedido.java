package entidade;

import entidade.Cliente;
import enumerations.StatusDoPedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Date dataDeCompra;
    private StatusDoPedido statusDaCompra;

    private Cliente cliente;

    List<PedidoDoItem> pi = new ArrayList<>();


    public void adicionaItem(PedidoDoItem item){
        pi.add(item);
    }

    public void removeItem(PedidoDoItem item){
        pi.remove(item);
    }

    public Date getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(Date dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public StatusDoPedido getStatusDaCompra() {
        return statusDaCompra;
    }

    public void setStatusDaCompra(StatusDoPedido statusDaCompra) {
        this.statusDaCompra = statusDaCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

        public double totalDaCompra(){
        double soma =0;
        for(PedidoDoItem pedidoDoItem : pi){
            soma += pedidoDoItem.totalPorItem();
        }
        return soma;



    }



}
