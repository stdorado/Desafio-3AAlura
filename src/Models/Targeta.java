package Models;

import java.util.ArrayList;
import java.util.List;

public class Targeta {
private double pagoLimite;
private double saldo;
private List<Compra> listaDeCompra;

public Targeta(double pagoLimite) {
    this.pagoLimite = pagoLimite;
    this.saldo = pagoLimite;
    this.listaDeCompra = new ArrayList<>();
}

public boolean LanzarCompra(Compra compra){
    if ( this.saldo >= compra.getValor()){
        this.saldo -= compra.getValor();
        this.listaDeCompra.add(compra);
        return true;
    }  return  false;
}

public void setPagoLimite(double pagoLimite) {
    this.pagoLimite = pagoLimite;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public void setListaDeCompra(List<Compra> listaDeCompra) {
    this.listaDeCompra = listaDeCompra;
}

public List<Compra> getListaDeCompra() {
    return listaDeCompra;
}

public double getSaldo() {
    return saldo;
}
}
