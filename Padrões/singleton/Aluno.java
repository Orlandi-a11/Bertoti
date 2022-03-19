package singleton;

public class Aluno {
    private static String nome;
    private static String cpf;
    private static String grupo;
    private static String email;
    private static Aluno uniqueInstance;


    private Aluno(String nome, String cpf, String grupo, String email) {
        Aluno.nome = nome;
        Aluno.cpf = cpf;
        Aluno.grupo = grupo;
        Aluno.email = email;
    }

    public synchronized static Aluno obterPersonagem() {
        if (uniqueInstance == null) {
            uniqueInstance = new Aluno(nome, cpf, grupo, email);
        }
        return uniqueInstance;
    }

    void enviarEmail(final String email){
        System.out.println("Olá,eu sou o  "+nome+"! Este é um e-mail na qual entro em contato.");
    }

}

