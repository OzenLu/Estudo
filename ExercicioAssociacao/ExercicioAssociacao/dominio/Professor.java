package ExercicioAssociacao.dominio;

public class Professor {
    private String nome, especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario... seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);

        if(seminarios == null) return;
        for (Seminario seminario: seminarios){
            System.out.println("Seminarios ministrados: " + seminario.getTitulo());
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario... seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
