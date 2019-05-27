package personagens;

public class Cliente {
    public String nome;
    public Cliente(String nome){
        this.nome= nome;
    }

    @Override
    public String toString() {
        return "Pacte personagens:" + nome;
    }
}
