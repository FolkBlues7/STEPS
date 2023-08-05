public class Professor {
    final String nome = "Dr.Helielcio da Silva"; //como o professor é sempre o mesmo, então o nome é uma constante.
    private String login;
    private String senha;
    final boolean NiveldeAcesso=true; //o nivel de acesso do professor é sempre liberado(true).


    public String getNomeProfessor() {
        return nome;
    }
    //métodos get e sets.
    public String getLogin()
    {
        return login;
    }
    public void setLogin(String login)
    {
        if(login!= null && login != "\0")
        this.login=login;
        else
        System.out.println("digite um login válido");
    }

     public String getSenha()
    {
        return senha;
    }
    public void setSenha(String senha)
    {
        if(senha!= null && senha != "\0")
        this.senha=senha;
        else
        System.out.println("digite uma senha válida");
    }

    public void Login( String TentativaLogin,String TentativaSenha)
{
    String LoginAtual=getLogin(); //salva o login e a senha atuais em duas variáveis locais.
    String SenhaAtual=getSenha();
    setLogin(TentativaLogin); //chama os métodos set e get para verificar se os dados são válidos.
    setSenha(TentativaSenha);
    if(TentativaLogin==LoginAtual && TentativaSenha == SenhaAtual ) //verifica se o login e a senha inseridos são iguais as senhas atuais.
    {
        System.out.println("Login relalizado com sucesso"); //se for igual,o login é realizado.
    }
    else
    {
        System.out.println("Login ou senha incorretos"); //se nao for igual,o login é negado e volta para a senha e login anteriores.
        login=LoginAtual;
        senha=SenhaAtual;
    }

}


    public static void main(String[] args) {
        Professor p1 = new Professor();
        p1.login="ben123";
        p1.senha="ariel123";
        p1.Login("ariel123","ariel123");
        System.out.println(p1.login);
        System.out.println(p1.senha);
    }

}
