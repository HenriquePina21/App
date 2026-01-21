public class Participante {
    private String nome;
    private String email;

    public Participante(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Participante that = (Participante) obj;
        return nome.equals(that.nome) && email.equals(that.email);
    }
}