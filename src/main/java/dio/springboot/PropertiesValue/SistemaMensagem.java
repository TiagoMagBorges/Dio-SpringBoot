package dio.springboot.PropertiesValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    @Value("${remetente.nome}")
    private String nome;

    @Value("${remetente.email}")
    private String email = "gleyson@dio.com";

    @Value("${remetente.telefones}")
    private List<String> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefones: " + telefones);
        System.out.println("Seu cadastro foi aprovado!");
    }
}
