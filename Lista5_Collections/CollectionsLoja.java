package Lista5_Collections;

import java.util.ArrayList;

import java.util.Collections;

public class CollectionsLoja {
	
	public static void mains(String[] args) {		 

	CollectionsEstoque loja1 = new CollectionsEstoque ("Tênis ", "esportivo ", 38);
	CollectionsEstoque loja2 = new CollectionsEstoque ("Bota ", "de couro ", 35);
	CollectionsEstoque loja3 = new CollectionsEstoque ("Sapatilha ", "de camurça ", 37);
	CollectionsEstoque loja4 = new CollectionsEstoque ("Sapatênis ", "de tecido ", 42);
			
	ArrayList<CollectionsEstoque> estoque = new ArrayList<>();
	
	estoque.add(loja1); //armazenar os dados
	estoque.add(loja2);
	estoque.add(loja3);
	
	System.out.println(estoque);
	
	estoque.remove(0); //remove
	
	estoque.set(0, loja4); //atualizar conteudo
	System.out.println(estoque);

}
}