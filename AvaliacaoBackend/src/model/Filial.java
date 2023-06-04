package model;
public class Filial {
    private int id;
    private String nome;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private boolean estrelas;

    // Construtores, getters e setters aqui


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public boolean isEstrelas() {
        return estrelas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEstrelas(boolean estrelas) {
        this.estrelas = estrelas;
    }

    @Override
    public String toString() {
        return "Filial [id=" + id + ", nome=" + nome + ", rua=" + rua + ", numero=" + numero + ", cidade=" + cidade
                + ", estado=" + estado + ", estrelas=" + estrelas + "]";
    }
}