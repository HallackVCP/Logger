import org.example.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTest {


    static String MSG = "TESTE";

    static String OPERACAO = "TESTE OPERACAO";

    private static String HEADER = "Registrando log da operacao: ";

    static String LOG_RETURN = HEADER + OPERACAO + " " + MSG;


    @Test
    void deveRegistrarLog(){
        Logger.getInstance().setMsg(MSG);
        Logger.getInstance().setOperacao(OPERACAO);
        assertEquals(LOG_RETURN, Logger.getInstance().registerLog());
    }

    @Test
    void deveRetornarOperacao(){
        Logger.getInstance().setOperacao(OPERACAO);
        assertEquals(OPERACAO, Logger.getInstance().getOperacao());
    }

    @Test
    void deveRetornarMsg(){
        Logger.getInstance().setMsg(MSG);
        assertEquals(MSG, Logger.getInstance().getMsg());
    }
}
