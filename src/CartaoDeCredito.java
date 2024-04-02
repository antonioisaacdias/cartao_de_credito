import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancaCompra(Compra compra){
        if(this.saldo > compra.getValor()){
          this.saldo -= compra.getValor();
          this.compras.add(compra);
          return true;
        }
        System.out.println("Valor da compra acima do limite, tente novamente.");
        return false;
    }

    public void exibirExtratoDeCompras(){
        double totalDaFatura = 0;
        for (Compra compra : compras){
            System.out.println(compra);
            totalDaFatura += compra.getValor();
        }
        System.out.println("Total da fatura: R$" + totalDaFatura + " | Saldo restante: R$" + saldo);
    }

    @Override
    public String toString() {
        return "CartaoDeCredito{" +
                "limite=" + limite +
                ", saldo=" + saldo +
                ", compras=" + compras +
                '}';
    }
}
