package ImplementacaoOrdenacao;

import java.util.Comparator;

public class ComparadorPorPrecoEQuantidade implements Comparator<Produto> {
   @Override
    public int compare(Produto p1, Produto p2) {
       int precoCompracao = Double.compare(p1.getPreco(), p2.getPreco());
       if (precoCompracao != 0) {
           return precoCompracao;
       } else {
           return Integer.compare(p1.getQuantidade(), p2.getQuantidade());
       }
   }
}
