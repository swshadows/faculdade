package modelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
    
    private final static String URL = "jdbc:mysql://localhost:3306/projeto_aluno_5p_zl";
    private final static String USUARIO = "root";
    private final static String SENHA = "1234";
    
    public static Connection conectaBanco(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("VASCO É VASCO");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("caminho,usuário ou senha errada "+ex.getMessage());
        }
        return con;
    }
    
}
