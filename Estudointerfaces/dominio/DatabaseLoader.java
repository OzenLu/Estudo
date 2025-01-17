package Estudointerfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }


    //sobrescrevendo uma funcao default da interface DataLoader
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões do banco de dados");
    }
}
