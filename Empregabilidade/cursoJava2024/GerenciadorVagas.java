package cursoJava2024;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Inscricao {
    String nome;

    public Inscricao(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

class Vaga {
    String titulo;
    String empresa;
    String descricao;
    int vagasDisponiveis;
    String modalidade;
    String salario;
    String dataLancamento;
    List<Inscricao> inscricoes;

    public Vaga(String titulo, String empresa, String descricao, int vagasDisponiveis, String modalidade, String salario) {
        this.titulo = titulo;
        this.empresa = empresa;
        this.descricao = descricao;
        this.vagasDisponiveis = vagasDisponiveis;
        this.modalidade = modalidade;
        this.salario = salario;
        this.dataLancamento = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        this.inscricoes = new ArrayList<>();
    }

    public void inscrever(String nome) {
        if (vagasDisponiveis > 0) {
            inscricoes.add(new Inscricao(nome));
            vagasDisponiveis--;
            JOptionPane.showMessageDialog(null, "Você se inscreveu na vaga: " + titulo + "\nNome: " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "A vaga " + titulo + " não está mais disponível.");
        }
    }

    @Override
    public String toString() {
        return titulo + " - " + empresa + 
               " (Disponíveis: " + vagasDisponiveis + 
               ", Modalidade: " + modalidade + 
               ", Salário: " + salario + 
               ", Lançada em: " + dataLancamento + ")";
    }

    public String detalhes() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Título: ").append(titulo)
                .append("\nEmpresa: ").append(empresa)
                .append("\nDescrição: ").append(descricao)
                .append("\nVagas Disponíveis: ").append(vagasDisponiveis)
                .append("\nModalidade: ").append(modalidade)
                .append("\nSalário: ").append(salario)
                .append("\nLançada em: ").append(dataLancamento)
                .append("\nInscrições: ");

        if (inscricoes.isEmpty()) {
            detalhes.append("Nenhuma inscrição ainda.");
        } else {
            for (Inscricao inscricao : inscricoes) {
                detalhes.append("\n- ").append(inscricao);
            }
        }

        return detalhes.toString();
    }
}

public class GerenciadorVagas {
    private List<Vaga> vagas;

    public GerenciadorVagas() {
        this.vagas = new ArrayList<>();
        // Vagas pré-definidas
        adicionarVaga("Desenvolvedor Java", "Tech Solutions", "Desenvolvimento de aplicações em Java.", 4, "Híbrido", "R$ 6.000,00");
        adicionarVaga("Analista de Dados", "Data Insights", "Análise e visualização de dados.", 3, "Remoto", "A Combinar");
        adicionarVaga("Gerente de Projetos", "Project Masters", "Gestão de projetos e equipes.", 2, "Presencial", "R$ 10.000,00");
    }

    public void adicionarVaga(String titulo, String empresa, String descricao, int vagasDisponiveis, String modalidade, String salario) {
        vagas.add(new Vaga(titulo, empresa, descricao, vagasDisponiveis, modalidade, salario));
        JOptionPane.showMessageDialog(null, "Vaga adicionada: " + titulo);
    }

    public void listarVagas() {
        StringBuilder lista = new StringBuilder("Vagas disponíveis:\n");
        for (int i = 0; i < vagas.size(); i++) {
            lista.append(i).append(": ").append(vagas.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    public void inscreverNaVaga(int indice) {
        if (indice >= 0 && indice < vagas.size()) {
            String nome = JOptionPane.showInputDialog("Digite seu nome:");
            if (isInputValido(nome)) {
                vagas.get(indice).inscrever(nome.trim());
            } else {
                JOptionPane.showMessageDialog(null, "Nome inválido. Tente novamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido.");
        }
    }

    public void mostrarDetalhes(int indice) {
        if (indice >= 0 && indice < vagas.size()) {
            JOptionPane.showMessageDialog(null, vagas.get(indice).detalhes());
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido.");
        }
    }

    public void apagarVaga(int indice) {
        if (indice >= 0 && indice < vagas.size()) {
            vagas.remove(indice);
            JOptionPane.showMessageDialog(null, "Vaga removida com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido.");
        }
    }

    public static boolean isInputValido(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static void main(String[] args) {
        GerenciadorVagas gerenciador = new GerenciadorVagas();
        String[] opcoes = {"Adicionar Vaga", "Listar Vagas", "Inscrever-se em uma Vaga", "Detalhes de uma Vaga", "Apagar Vaga", "Sair"};
        int opcao;

        do {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                    "Gerenciador de Vagas", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0: // Adicionar Vaga
                    String titulo = JOptionPane.showInputDialog("Digite o título da vaga:");
                    String empresa = JOptionPane.showInputDialog("Digite o nome da empresa:");
                    String descricao = JOptionPane.showInputDialog("Digite a descrição da vaga:");
                    String vagasInput = JOptionPane.showInputDialog("Quantas vagas disponíveis?");
                    String modalidade = JOptionPane.showInputDialog("Digite a modalidade (Remoto, Presencial, Híbrido):");
                    String salario = JOptionPane.showInputDialog("Digite o salário (ou 'A Combinar'):");

                    if (isInputValido(titulo) && isInputValido(empresa) && isInputValido(descricao) && isInputValido(vagasInput)) {
                        try {
                            int vagasDisponiveis = Integer.parseInt(vagasInput.trim());
                            gerenciador.adicionarVaga(titulo.trim(), empresa.trim(), descricao.trim(), vagasDisponiveis, modalidade.trim(), salario.trim());
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Número de vagas inválido.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Dados inválidos.");
                    }
                    break;
                case 1: // Listar Vagas
                    gerenciador.listarVagas();
                    break;
                case 2: // Inscrever-se em uma Vaga
                    gerenciador.listarVagas();
                    String input = JOptionPane.showInputDialog("Escolha o índice da vaga para se inscrever:");
                    if (input != null) {
                        try {
                            int indice = Integer.parseInt(input.trim());
                            gerenciador.inscreverNaVaga(indice);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.");
                        }
                    }
                    break;
                case 3: // Detalhes de uma Vaga
                    gerenciador.listarVagas();
                    String detalheInput = JOptionPane.showInputDialog("Escolha o índice da vaga para ver os detalhes:");
                    if (detalheInput != null) {
                        try {
                            int indice = Integer.parseInt(detalheInput.trim());
                            gerenciador.mostrarDetalhes(indice);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.");
                        }
                    }
                    break;
                case 4: // Apagar Vaga
                    gerenciador.listarVagas();
                    String apagarInput = JOptionPane.showInputDialog("Escolha o índice da vaga para apagar:");
                    if (apagarInput != null) {
                        try {
                            int indice = Integer.parseInt(apagarInput.trim());
                            gerenciador.apagarVaga(indice);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.");
                        }
                    }
                    break;
                case 5: // Sair
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }
}

