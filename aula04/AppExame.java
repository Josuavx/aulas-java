package br.com.unit.aula04;
import java.util.Scanner;
public class AppExame {
    static Scanner tec = new Scanner(System.in);
    static Exame exames[] = new Exame [4];
    static int op;
    static int ctd;
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

    public static int pesquisaIdExame(int idExame){
        for (int i = 0; i < exames.length; i++){
            if (exames[i] != null && exames[i].getIdExame() == idExame){
                return i;
            }
        }
        return -1;
    }

    public static void cadastraExame(){
        System.out.println("=-*-=-*-=-*-= Cadastro de Exames =-*-=-*-=-*-=");

        do{
            if (ctd == 4){
                System.out.println("Exames cheios, exclua para cadastrar mais.");
                break;
            }

            for (int i = 0; i < exames.length; i++){
                if (exames[i] == null){
                    System.out.println("Digite o ID do exame: ");
                    int idExame = tec.nextInt();
                    if (pesquisaIdExame(idExame) != -1){
                        System.out.println("ID já existente.");
                    }else{
                        exames[i] = new Exame();
                        System.out.println("Nome do paciente: ");
                        String nome = tec.next();
                        System.out.println("Nível de glicose: ");
                        int nivelGlicose = tec.nextInt();

                        exames[i].Exame(idExame, nome, nivelGlicose);
                        ctd++;

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
                }
            }
        } while (op2 != false);
    }

    public static void consultaExame() {
        System.out.println("=-*-=-*-=-*-= Consulta de Exames =-*-=-*-=-*-=");
        System.out.println("ID do exame para consulta: ");
        int idExame = tec.nextInt();

        int posicao = pesquisaIdExame(idExame);
        if (posicao != -1) {
            System.out.println("ID: " + exames[posicao].getIdExame());
            System.out.println("Nome do paciente: " + exames[posicao].getNomePaciente());
            System.out.println("Nível da Glicose: " + exames[posicao].getNivelGlicose());
            System.out.println("Diagnóstico: " + exames[posicao].obterDiagnostico());
        } else {
            System.out.println("ID não encontrado");
        }
    }

    public static void alterarExame(){
        System.out.println("=-*-=-*-=-*-= Alteração de Exames =-*-=-*-=-*-=");

        System.out.println("Digite o ID do exame: ");
        int idExame = tec.nextInt();
        int posicao = pesquisaIdExame(idExame);

        if (posicao != -1){
            System.out.println("1 - Alterar nome\n2 - Alterar nível de glicose");
            int op3 = tec.nextInt();
            if (op3 == 1){
                System.out.println("Novo nome: ");
                String nome = tec.next();
                exames[posicao].setNomePaciente(nome);
                System.out.println("Alterado com sucesso.");
            }else if (op3 == 2){
                System.out.println("Novo nível de glicose: ");
                int glicose = tec.nextInt();
                exames[posicao].setNivelGlicose(glicose);
                System.out.println("Alterado com sucesso.");
            }else{
                System.out.println("Opção não reconhecida.");
            }
        }else{
            System.out.println("ID inexistente.");
        }
    }

    public static void excluirExame(){
        System.out.println("=-*-=-*-=-*-= Exclusão de Exames =-*-=-*-=-*-=");

        if (ctd == 0){
            System.out.println("Não existe nenhum exame cadastrado");
            return;
        }

        System.out.println("Digite o ID do exame: ");
        int idExame = tec.nextInt();
        int posicao = pesquisaIdExame(idExame);

        if (posicao != -1){
            System.out.println("ID: " + exames[posicao].getIdExame());
            System.out.println("Nome do paciente: " + exames[posicao].getNomePaciente());
            System.out.println("Nível da Glicose: " + exames[posicao].getNivelGlicose());

            System.out.println("Deseja excluir? (S/N)");
            String opcao = tec.next();
            opcao = opcao.substring(0, 1);
            if (opcao.equalsIgnoreCase("S")){
                exames[posicao] = null;
                ctd--;
                System.out.println("Excluído com sucesso.");
            }else if (opcao.equalsIgnoreCase("N")) {
                System.out.println("Exclusão cancelada.");
            }
        }else{
            System.out.println("ID inexistente.");
        }

    }

    public static void listarExames(){
        System.out.println("=-*-=-*-=-*-= Lista de Exames =-*-=-*-=-*-=");

        System.out.println("ID   Nome    Glicose    Situação");
        for (int i = 0; i < exames.length; i++){
            if (exames[i] != null){
                System.out.printf("%d    %s    %d    %s\n",
                        exames[i].getIdExame(),
                        exames[i].getNomePaciente(),
                        exames[i].getNivelGlicose(),
                        exames[i].obterDiagnostico()
                );
            }
        }
    }
}
