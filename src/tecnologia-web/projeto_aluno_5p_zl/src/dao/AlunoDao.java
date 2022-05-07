package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.conexao.FabricaConexao;
import modelo.entidade.Aluno;

public class AlunoDao {

    Connection conexao;
    String comando;
    PreparedStatement ps;

    public void inserir(Aluno aluno) throws SQLException {
        conexao = FabricaConexao.conectaBanco();
        comando = "insert into aluno(nome,sexo,data_nasc,cpf,fone)\n"
                + "values(?,?,?,?,?)";
        ps = conexao.prepareStatement(comando);
        ps.setString(1, aluno.getNome());
        ps.setString(2, aluno.getSexo());
        ps.setDate(3, new java.sql.Date(aluno.getDataNasc().getTime()));
        ps.setString(4, aluno.getCPF());
        ps.setString(5, aluno.getFone());
        ps.execute();

    }//fim

}
