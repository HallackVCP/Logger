package org.example;

public class Logger implements ILogger{

    private String msg;

    private String operacao;

    private static String HEADER = "Registrando log da operacao: ";


    private static Logger logger = new Logger();

    private Logger(){}

    public static Logger getInstance(){
        return logger;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    @Override
    public String registerLog() {
        return HEADER + this.getOperacao() + this.getMsg();
    }
}
