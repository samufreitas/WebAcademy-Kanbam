package Fundamentos_back_end.Maria_Clara.sgcm.src.main.java.br.ufac.sgcm.model;

public class Profissional {
    private Long id;
    private String nome;
    private String registro;
    private String email;
    private String telefone;
    private Unidade unidade;
    private Especialidade especialidade;

    //CONSTRUTOR VAZIO
    public Profissional(){

    }

    //GETTER E SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }
    
    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    

}



