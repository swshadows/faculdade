package projeto_aluno_5p_zl;

import dao.AlunoDao;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.conexao.FabricaConexao;
import modelo.entidade.Aluno;

public class Projeto_aluno_5p_zl {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setCPF("12345");
        aluno.setNome("vasco da gama");
        aluno.setSexo("M");
        aluno.setDataNasc(new Date());
        aluno.setFone("222222222");
        try {
            new AlunoDao().inserir(aluno);
            System.out.println("salvou");
        } catch (SQLException ex) {
            System.out.println("erro "+ex.getMessage());
        }
        
    }
    
}
