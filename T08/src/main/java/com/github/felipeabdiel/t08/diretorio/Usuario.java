package diretorio;

public class Usuario {
    Diretorio autorizacao;
    boolean permissao;

    public Usuario method(boolean permissao) {
        this.autorizacao = permissao;
    }
}
