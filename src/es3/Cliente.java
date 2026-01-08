package es3;
import java.time.LocalDate;

public class Cliente {
//    ATTRIBUTI
    private int codCliente = 0;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataIscrizione;
//    COSTRUTTORE
    public Cliente(String name, String surname,String email) {
        codCliente++;
        this.nome = name;
        this.cognome = surname;
        this.email = email;
        this.dataIscrizione = LocalDate.now();
    }
//    METODI toString:

    @Override
    public String toString() {
        return "Cliente{" +
                "codCliente=" + codCliente +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione=" + dataIscrizione +
                '}';
    }
}
