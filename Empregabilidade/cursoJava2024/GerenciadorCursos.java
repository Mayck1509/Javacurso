package cursoJava2024;

import javax.swing.*;
import java.io.*;
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

abstract class Oferta {
    String titulo;
    String empresa;
    String descricao;
    int vagasDisponiveis;
    String modalidade;
    String dataLancamento;
    List<Inscricao> inscricoes;

    public Oferta(String titulo, String empresa, String descricao, int vagasDisponiveis, String modalidade) {
        this.titulo = titulo;
        this.empresa = empresa;
        this.descricao = descricao;
        this.vagasDisponiveis = vagasDisponiveis;
        this.modalidade = modalidade;
        this.dataLancamento = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        this.inscricoes = new ArrayList<>();
    }

    public void inscrever(String nome) {
        if (vagasDisponiveis > 0) {
            inscricoes.add(new Inscricao(nome));
            vagasDisponiveis--;
            JOptionPane.showMessageDialog(null, "Você se inscreveu em: " + titulo + "\nNome: " + nome);
        } else {
            JOptionPane.showMessageDialog(null, "A " + getTipo() + " " + titulo + " não está mais disponível.");
        }
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return titulo + " - " + empresa + 
               " (Disponíveis: " + vagasDisponiveis + 
               ", Modalidade: " + modalidade + 
               ", Lançada em: " + dataLancamento + ")";
    }

    public String detalhes() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Título: ").append(titulo)
                .append("\nEmpresa: ").append(empresa)
                .append("\nDescrição: ").append(descricao)
                .append("\nVagas Disponíveis: ").append(vagasDisponiveis)
                .append("\nModalidade: ").append(modalidade)
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

class Vaga extends Oferta {
    String salario;

    public Vaga(String titulo, String empresa, String descricao, int vagasDisponiveis, String modalidade, String salario) {
        super(titulo, empresa, descricao, vagasDisponiveis, modalidade);
        this.salario = salario;
    }

    @Override
    public String getTipo() {
        return "vaga de emprego";
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario;
    }

    @Override
    public String detalhes() {
        return super.detalhes() + "\nSalário: " + salario;
    }
}

class CursoOnline extends Oferta {
    String cargaHoraria;

    public CursoOnline(String titulo, String empresa, String descricao, int vagasDisponiveis, String modalidade, String cargaHoraria) {
        super(titulo, empresa, descricao, vagasDisponiveis, modalidade);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String getTipo() {
        return "curso";
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga Horária: " + cargaHoraria;
    }

    @Override
    public String detalhes() {
        return super.detalhes() + "\nCarga Horária: " + cargaHoraria;
    }
}

public class GerenciadorCursos {
    private List<Oferta> ofertas;

    public GerenciadorCursos() {
        this.ofertas = new ArrayList<>();
        inicializarOfertas();  // Adicionar ofertas pré-cadastradas
        carregarCursos();  // Carregar cursos do arquivo
    }

    private void inicializarOfertas() {
        // Adicionar algumas vagas pré-cadastradas
        ofertas.add(new Vaga("Desenvolvedor Java", "Tech Company", 
                             "Vaga para desenvolvedor Java com experiência em Spring.", 
                             5, "Remoto", "R$ 8.000"));
        ofertas.add(new Vaga("Analista de Dados", "Data Solutions", 
                             "Análise e interpretação de dados para tomada de decisão.", 
                             3, "Presencial", "R$ 6.500"));

        // Adicionar alguns cursos pré-cadastrados
        ofertas.add(new CursoOnline("Curso de Java Completo", "Academia de Código", 
                                     "Aprenda Java do básico ao avançado.", 
                                     20, "Online", "40 horas"));
        ofertas.add(new CursoOnline("Curso de Python para Iniciantes", "Aprenda Online", 
                                     "Introdução à programação com Python.", 
                                     15, "Online", "30 horas"));
    }

    public void adicionarVaga(String titulo, String empresa, String descricao, int vagasDisponiveis, String modalidade, String salario) {
        ofertas.add(new Vaga(titulo, empresa, descricao, vagasDisponiveis, modalidade, salario));
        salvarCursos();  // Salvar cursos no arquivo
        JOptionPane.showMessageDialog(null, "Vaga adicionada: " + titulo);
    }

    public void adicionarCurso(String titulo, String empresa, String descricao, int vagasDisponiveis, String modalidade, String cargaHoraria) {
        ofertas.add(new CursoOnline(titulo, empresa, descricao, vagasDisponiveis, modalidade, cargaHoraria));
        salvarCursos();  // Salvar cursos no arquivo
        JOptionPane.showMessageDialog(null, "Curso adicionado: " + titulo);
    }

    public void listarOfertas() {
        StringBuilder lista = new StringBuilder("Ofertas disponíveis:\n");
        for (int i = 0; i < ofertas.size(); i++) {
            lista.append(i).append(": ").append(ofertas.get(i))
                 .append(" - Tipo: ").append(ofertas.get(i).getTipo()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.length() > 0 ? lista.toString() : "Nenhuma oferta disponível.");
    }

    public void mostrarDetalhes(int indice) {
        if (indice >= 0 && indice < ofertas.size()) {
            JOptionPane.showMessageDialog(null, ofertas.get(indice).detalhes());
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido.");
        }
    }

    public void inscreverNaOferta(int indice) {
        if (indice >= 0 && indice < ofertas.size()) {
            String nome = JOptionPane.showInputDialog("Digite seu nome:");
            if (isInputValido(nome)) {
                ofertas.get(indice).inscrever(nome.trim());
            } else {
                JOptionPane.showMessageDialog(null, "Nome inválido. Tente novamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido.");
        }
    }

    public void apagarOferta(int indice) {
        if (indice >= 0 && indice < ofertas.size()) {
            ofertas.remove(indice);
            salvarCursos();  // Salvar após remoção
            JOptionPane.showMessageDialog(null, "Oferta removida com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido.");
        }
    }

    public static boolean isInputValido(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public void salvarCursos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cursos.dat"))) {
            oos.writeObject(ofertas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void carregarCursos() {
        File file = new File("cursos.dat");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                ofertas = (List<Oferta>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorCursos gerenciador = new GerenciadorCursos();
        String[] opcoes = {
            "Adicionar Vaga", 
            "Adicionar Curso", 
            "Listar Vagas e Cursos", 
            "Detalhes das Vagas e Cursos", 
            "Inscrever-se em uma Curso/Vaga", 
            "Apagar Ofertas", 
            "Sair"
        };
        int opcao;

        do {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
                    "Gerenciador de Cursos e Vagas", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (opcao) {
                case 0: // Adicionar Vaga
                    String tituloVaga = JOptionPane.showInputDialog("Digite o título da vaga:");
                    String empresaVaga = JOptionPane.showInputDialog("Digite o nome da empresa:");
                    String descricaoVaga = JOptionPane.showInputDialog("Digite a descrição da vaga:");
                    String vagasInput = JOptionPane.showInputDialog("Quantas vagas disponíveis?");
                    String modalidadeVaga = JOptionPane.showInputDialog("Digite a modalidade (Remoto, Presencial, Híbrido):");
                    String salario = JOptionPane.showInputDialog("Digite o salário (ou 'A Combinar'):");

                    if (isInputValido(tituloVaga) && isInputValido(empresaVaga) && isInputValido(descricaoVaga) && isInputValido(vagasInput)) {
                        try {
                            int vagasDisponiveis = Integer.parseInt(vagasInput.trim());
                            gerenciador.adicionarVaga(tituloVaga.trim(), empresaVaga.trim(), descricaoVaga.trim(), vagasDisponiveis, modalidadeVaga.trim(), salario.trim());
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Número de vagas inválido.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Dados inválidos.");
                    }
                    break;
                case 1: // Adicionar Curso
                    String tituloCurso = JOptionPane.showInputDialog("Digite o título do curso:");
                    String empresaCurso = JOptionPane.showInputDialog("Digite o nome da instituição:");
                    String descricaoCurso = JOptionPane.showInputDialog("Digite a descrição do curso:");
                    String vagasCursoInput = JOptionPane.showInputDialog("Quantas vagas disponíveis?");
                    String modalidadeCurso = JOptionPane.showInputDialog("Digite a modalidade (Online, Presencial, Híbrido):");
                    String cargaHoraria = JOptionPane.showInputDialog("Digite a carga horária:");

                    if (isInputValido(tituloCurso) && isInputValido(empresaCurso) && isInputValido(descricaoCurso) && isInputValido(vagasCursoInput)) {
                        try {
                            int vagasDisponiveis = Integer.parseInt(vagasCursoInput.trim());
                            gerenciador.adicionarCurso(tituloCurso.trim(), empresaCurso.trim(), descricaoCurso.trim(), vagasDisponiveis, modalidadeCurso.trim(), cargaHoraria.trim());
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Número de vagas inválido.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Dados inválidos.");
                    }
                    break;
                case 2: // Listar Ofertas
                    gerenciador.listarOfertas();
                    break;
                case 3: // Detalhes de uma Oferta
                    String indiceOferta = JOptionPane.showInputDialog("Digite o índice da oferta:");
                    try {
                        int indice = Integer.parseInt(indiceOferta);
                        gerenciador.mostrarDetalhes(indice);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Índice inválido.");
                    }
                    break;
                case 4: // Inscrever-se em uma Oferta
                    String indiceInscricao = JOptionPane.showInputDialog("Digite o índice da oferta:");
                    try {
                        int indice = Integer.parseInt(indiceInscricao);
                        gerenciador.inscreverNaOferta(indice);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Índice inválido.");
                    }
                    break;
                case 5: // Apagar Oferta
                    String indiceRemocao = JOptionPane.showInputDialog("Digite o índice da oferta:");
                    try {
                        int indice = Integer.parseInt(indiceRemocao);
                        gerenciador.apagarOferta(indice);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Índice inválido.");
                    }
                    break;
                case 6: // Sair
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        } while (opcao != 6);
    }
}