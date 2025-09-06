package Macacos;/*
    1. Crie uma classe Macaco
    2. A classe deve possuir os atributos nome do tipo String e estomago do tipo
    List<String>
    3. A classe deve possuir os métodos comer(alimento), verEstomago(), digerir()
    4. Faça um programa criando dois macacos, alimentando-os com 3 alimentos
    diferentes e verificando o conteúdo do estomago a cada refeição.
    5. Experimente fazer com que um macaco se alimente do outro, é possível
    fazer um macaco canibal?
Desde que usemos o metodo objeto.toString(), pois ele transforma o objeto em string, para ser
inserido na lista de Strings.
Mas, nesses casos, a String será apresentada assim:
NomeDaClasse@código_hash
(toString()) existe em todo objeto (vem de Object).
Por padrão, mostra o nome da classe + hash.
Podemos sobrescrever (@Override) para mostrar informações úteis do objeto.
Quando você usa System.out.println(obj);, o Java chama automaticamente o toString() daquele objeto.
 */
//Estomago como lista
import java.util.ArrayList;
import java.util.List;

public class Macaco {
    //Atributos
    private String nome;
    private List<String> estomago;

    //Construtor
    public Macaco(String nome){
        this.nome = nome;
        this.estomago= new ArrayList<>(); // É necessário "implementar/instaciar" a lista para colocar coisa dentro
    }

    //Métodos
    public void comer(String alimento){
        estomago.add(alimento);
    }
//    public void comendo(String... alimentos){
//        for (String alimento : alimentos) {
//            estomago.add(alimento);
//        }
//    }
/*
varargs → significa "quantos argumentos String eu quiser".
Serve para que possam ser passado vários alimentos de uma unica vez.
O (String... alimentos) serve para que seja criado um array/vetor como cada um dos alimentos escritos
e naquela ordem.
O (for (String alimento : alimentos)) é um for-each loop. Serve para percorrer o Array/vetor que
chegou em alimentos. Cada vez que passa no loop, a variável alimento recebe um dos elementos da
lista recebida e adiciona o alimento do indice do for no estômago.
*/
    public List<String> verEstomago(){
        return this.estomago;
    }
    /*
    Falta colocar um retorno para caso o estomago esteja vazio
     */
    public void digerir(){
        //this.estomago.clear(); // Serve para limpar o estomago. Se ele digerir tudo.
        this.estomago.remove(0);
        //Serve para tirar o alimento de índice 0. Ou seja, o primeiro. A digestão vai ser 1 por 1.
    }
    /*
    Escolhi esse, pois a digestão ocorre aos ppoucos, como na vida.
    Falta colocar um retorno para o caso do estomago estar vazio. Nesse caso, não há o que ser digerido.
    */
    /*
    5. Experimente fazer com que um macaco se alimente do outro, é possível
    fazer um macaco canibal?
Desde que usemos o metodo objeto.toString(), pois ele transforma o objeto em string, para ser
inserido na lista de Strings.
Mas, nesses casos, a String será apresentada assim:
NomeDaClasse@código_hash
(toString()) existe em todo objeto (vem de Object).
Por padrão, mostra o nome da classe + hash.
Podemos sobrescrever (@Override) para mostrar informações úteis do objeto.
     */
    @Override
    public String toString() {
        return "Macaco: " + nome + " e Estômago: " + estomago;
    }
}
