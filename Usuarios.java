
package MODEL;

/**
 *
 * @author Milena Galvão
 */
public class Usuarios {

    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String sexo;
    private int senha;
    private int id_filial;
    private int cargo;

    public Usuarios(int id, String nome, String email, String cpf, String sexo, String senha, int id_filial, int cargo) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Usuarios(int id, String Nome, String email, String cpf, String sexo, int senha, int id_filial, int cargo) {
        this.id = id;
        this.nome = Nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
        this.nome = pNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the id_filial
     */
    public int getId_filial() {
        return id_filial;
    }

  
    public void setId_filial(int id_filial) {
        this.id_filial = id_filial;
    }

    /**
     * @return the cargo
     */
    public int getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

   
    
}
