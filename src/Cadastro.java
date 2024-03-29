public class Cadastro {
    
    // Atributos da classe Cadastro
    // Correspondentes aos dados do formulário
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;
    private String estado;
    private String email;
    private String sexo;
    private String motivo;

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    private boolean alemao;
    private boolean espanhol;
    private boolean ingles;
    private boolean frances;
    private boolean italiano;
    private boolean japones;

    // Getters e Setters dos atributos da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isAlemao() {
        return alemao;
    }

    public void setAlemao(boolean alemao) {
        this.alemao = alemao;
    }

    public boolean isEspanhol() {
        return espanhol;
    }

    public void setEspanhol(boolean espanhol) {
        this.espanhol = espanhol;
    }

    public boolean isIngles() {
        return ingles;
    }

    public void setIngles(boolean ingles) {
        this.ingles = ingles;
    }

    public boolean isFrances() {
        return frances;
    }

    public void setFrances(boolean frances) {
        this.frances = frances;
    }

    public boolean isItaliano() {
        return italiano;
    }

    public void setItaliano(boolean italiano) {
        this.italiano = italiano;
    }

    public boolean isJapones() {
        return japones;
    }

    public void setJapones(boolean japones) {
        this.japones = japones;
    }
    
}
