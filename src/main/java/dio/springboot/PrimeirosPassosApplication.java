package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}

//  Prototype Scope and Singleton Scope
//	@Bean
//	public CommandLineRunner run(SistemaMensagem sistema) {
//		return (args) -> {
//			sistema.enviarMensagemBoasVindas();
//			sistema.enviarConfirmacaoCadastro();
//		};
//	}

}
