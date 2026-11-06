import java.util.Scanner;

public class Menu {
    public static void menu() {
        System.out.println("=======Menu de Opções=======");
        System.out.println("1 - Cadastrar uma pessoa física");
        System.out.println("2 - Cadastrar uma pessoa jurídica");
        System.out.println("3 - Remover um contato");
        System.out.println("4 - Imprimir dados da agenda");
        System.out.println("5 - Sair");
    }

    public void iniciar() {
        int opcao = 0;
            while (opcao != 5) {
                menu();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                executarOpcao(opcao, agenda);
            }
    }

    public String lerNome(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        return nome;
    }

    public String lerEndereco(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();
        return endereco;
    }

    public String lerEmail(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        return email;
    }

    public String lerCpf(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        return cpf;
    }

    public String lerEstadoCivil(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o estado civil: ");
        String estadoCivil = scanner.nextLine();
        return estadoCivil;
    }

    public String lerCnpj(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CNPJ: ");
        String cnpj = scanner.nextLine();
        return cnpj;
    }

    public int lerInscricaoEstadual(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a inscrição estadual: ");
        int inscricaoEstadual = scanner.nextInt();
        return inscricaoEstadual;
    }

    public void executarOpcao(int opcao, Agenda agenda) {
        switch (opcao) {
            case 1:
                adicionarContato(lerNome(), lerEndereco(), lerEmail(), lerCpf(), lerEstadoCivil());
                break;
            case 2:
                adicionarContato(lerNome(), lerEndereco(), lerEmail(), lerCnpj(), lerInscricaoEstadual());
                break;
            case 3:
                RemoverContato(identificador);
                break;
            case 4:
                getContatos();
                break;
            case 5:
                System.out.println("Saindo do programa...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }
}