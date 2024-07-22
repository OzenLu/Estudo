package ExercicioAssociacao.dominio;

public class Seminario {
    private String titulo, local;
    private Aluno[] alunos;
    private Professor professor;

    public Seminario(String titulo, String local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, String local, Aluno... alunos){
        this(titulo, local);
        this.alunos = alunos;
    }

    public Seminario(String titulo, String local, Professor professor) {
        this(titulo, local);
        this.professor = professor;
    }

    public void imprimir(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Local: " + this.local);
        System.out.println("Professor: " + professor.getNome());

        if(alunos == null) return;
        for (Aluno alunos: alunos){
            System.out.println("Alunos inscritos: " + alunos.getNome());
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno... alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
