package br.com.unit.aula04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class AppExame {
    static Scanner tec = new Scanner(System.in);
    //static Exame exames[] = new Exame [4];
    static List<Exame> exames = new ArrayList();
    static int op;
    //static int ctd;
    static boolean op2;

    public static void main(String[] args){

        do{
            System.out.println("=-*-=-*-=-*-=-*-=-*-=-*-=-*-=-*-=-*-=");
            System.out.println("Escolha uma das opções: \n");
            System.out.println("1 - Cadastrar exame\n2 - Consultar exame\n3 - Alterar exame\n4 - Excluir exame\n5 - Listar exames\n0 - Finalizar Programa");
            op = tec.nextInt();


            switch (op){
                case 1:
                    cadastraExame();
                    break;
                case 2:
                    consultaExame();
                    break;
                case 3:
                    alterarExame();
                    break;
                case 4:
                    excluirExame();
                    break;
                case 5:
                    listarExames();
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    break;
            }
        } while (op != 0);
    }

    public static Exame pesquisaIdExame(int idExame){
        for (Exame exame : exames){
            if (exame.getIdExame() == idExame){
                return exame;
            }
        }
        return null;
    }

    public static void cadastraExame(){
        System.out.println("=-*-=-*-=-*-= Cadastro de Exames =-*-=-*-=-*-=");

        do{
            if (exames.size() == 4){
                System.out.println("Exames cheios, exclua para cadastrar mais.");
                break;
            }
            System.out.println("Digite o ID do exame: ");
            int idExame = tec.nextInt();
            if (pesquisaIdExame(idExame) != null){
                System.out.println("ID já existente.");
            }else{
                System.out.println("Nome do paciente: ");
                String nome = tec.next();
                System.out.println("Nível de glicose: ");
                int nivelGlicose = tec.nextInt();
                exames.add(new Exame(idExame, nome, nivelGlicose));

                System.out.println("Cadastrado com sucesso. Continuar cadastrando? (S/N)");
                String opcao = tec.next();
                opcao = opcao.substring(0, 1);
                if (opcao.equalsIgnoreCase("S")){
                    op2 = true;
                }else if (opcao.equalsIgnoreCase("N")) {
                    op2 = false;
                    break;
                }
            }
        } while (op2 != false);
    }

    public static void consultaExame() {
        if (exames.size() == 0){
            System.out.println("Lista vazia");
            return;
        }

        System.out.println("=-*-=-*-=-*-= Consulta de Exames =-*-=-*-=-*-=");
        System.out.println("ID do exame para consulta: ");
        int idExame = tec.nextInt();

        Exame exameEncontrado = pesquisaIdExame(idExame);

        if (exameEncontrado == null){
            System.out.println("ID não encontrado");
        } else {
            System.out.println("ID: " + exameEncontrado.getIdExame());
            System.out.println("Nome do paciente: " + exameEncontrado.getNomePaciente());
            System.out.println("Nível da Glicose: " + exameEncontrado.getNivelGlicose());
            System.out.println("Diagnóstico: " + exameEncontrado.obterDiagnostico());
        }
    }

    public static void alterarExame(){
        if (exames.size() == 0){
            System.out.println("Lista vazia");
            return;
        }

        System.out.println("=-*-=-*-=-*-= Alteração de Exames =-*-=-*-=-*-=");

        System.out.println("Digite o ID do exame: ");
        int idExame = tec.nextInt();
        Exame exameEncontrado = pesquisaIdExame(idExame);

        if (exameEncontrado != null){
            System.out.println("1 - Alterar nome\n2 - Alterar nível de glicose");
            int op3 = tec.nextInt();
            if (op3 == 1){
                System.out.println("Novo nome: ");
                String nome = tec.next();
                exameEncontrado.setNomePaciente(nome);
                System.out.println("Alterado com sucesso.");
            }else if (op3 == 2){
                System.out.println("Novo nível de glicose: ");
                int glicose = tec.nextInt();
                exameEncontrado.setNivelGlicose(glicose);
                System.out.println("Alterado com sucesso.");
            }else{
                System.out.println("Opção não reconhecida.");
            }
        }else{
            System.out.println("ID inexistente.");
        }
    }

    public static void excluirExame(){
        if (exames.size() == 0){
            System.out.println("Não existe nenhum exame cadastrado");
            return;
        }

        System.out.println("=-*-=-*-=-*-= Exclusão de Exames =-*-=-*-=-*-=");

        System.out.println("Digite o ID do exame: ");
        int idExame = tec.nextInt();
        Exame exameEncontrado = pesquisaIdExame(idExame);

        if (exameEncontrado != null){
            System.out.println("ID: " + exameEncontrado.getIdExame());
            System.out.println("Nome do paciente: " + exameEncontrado.getNomePaciente());
            System.out.println("Nível da Glicose: " + exameEncontrado.getNivelGlicose());

            System.out.println("Deseja excluir? (S/N)");
            String opcao = tec.next();
            opcao = opcao.substring(0, 1);
            if (opcao.equalsIgnoreCase("S")){
                exames.remove(exameEncontrado);
                System.out.println("Excluído com sucesso.");

            }else if (opcao.equalsIgnoreCase("N")) {
                System.out.println("Exclusão cancelada.");
            }
        }else{
            System.out.println("ID inexistente.");
        }

    }

    public static void listarExames(){
        if (exames.size() == 0){
            System.out.println("Não existe nenhum exame cadastrado");
            return;
        }

        System.out.println("=-*-=-*-=-*-= Lista de Exames =-*-=-*-=-*-=");

        System.out.println("ID   Nome    Glicose    Situação");
        for (Exame exame : exames){
            if (exame != null){
                System.out.printf("%d    %s    %d    %s\n",
                        exame.getIdExame(),
                        exame.getNomePaciente(),
                        exame.getNivelGlicose(),
                        exame.obterDiagnostico()
                );
            }
        }
    }
}
