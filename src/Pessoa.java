public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // Metodo especial
    public void fazerAniversario (){
        this.idade ++;

    }
    // Metodo Construtor
    public Pessoa (String nome , int idade, String sexo){
        this.nome = nome ;
        this.idade = idade;
        this.sexo = sexo;
    }
    // Getters e Setters
    public String getNome (){     // Nome
        return nome;
    }
    public void setNome (String nome ){
        this.nome = nome;
    }
    public int getIdade (){    // idade
        return idade;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public String getSexo (){    // sexo
        return sexo;
    }
    public void setSexo (String sexo){
        this.sexo = sexo;
    }
}


