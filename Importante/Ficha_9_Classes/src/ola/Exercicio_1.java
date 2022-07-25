package ola;

class Exercicio_1 {

    private String msg = "Eu sou uma Mensagem";

    public String getMsg() {
        return this.msg;
    }

    public String setMsg(String input) {
        return this.msg = input;
    }

    public Exercicio_1() {
    }

    public Exercicio_1(String app) {
        app="Ola ";
        app+=msg;
        msg=app;
    }

    public static void main(String[] args) {
        String pergunta, recebe;

        pergunta = "Quem és tu?\n";

        Exercicio_1 msg = new Exercicio_1();
        Exercicio_1 msg1 = new Exercicio_1(pergunta);

        recebe = msg.getMsg();

        System.out.println(recebe);

        recebe = msg.setMsg("Eu sou un numero");

        System.out.println(recebe);

        System.out.println(msg.getMsg());
        
        System.out.println(msg1.getMsg());
    }
}
