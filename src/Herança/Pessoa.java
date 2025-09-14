package Herança;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        //Serve para garantir que a idade será válida.
//        if (idade < 0) {
//            throw new IllegalArgumentException("A idade não pode ser negativa.");
//        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade>0&&idade<150){
            this.idade = idade;
        }
        else {
            System.out.println("Idade inválida. Entre com uma idade entre 0 e 150 anos");
        }
    }
}
