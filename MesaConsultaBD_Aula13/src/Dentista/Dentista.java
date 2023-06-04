package Dentista;

public class Dentista {
    private String sobrenome;
    private String nome;
    private String matricula;

    public Dentista(String sobrenome, String nome, String matricula) {
        this.sobrenome = sobrenome;
        this.nome = nome;
        this.matricula = matricula;
    }

    // Getters e setters para os campos

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método toString para facilitar a exibição dos dados

    @Override
    public String toString() {
        return "Dentista{" +
                "sobrenome='" + sobrenome + '\'' +
                ", nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}