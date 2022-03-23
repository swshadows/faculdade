import javax.swing.JOptionPane;

public class AlunoPrincipal {

	public static final int N = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Aluno [] alunos = new Aluno[N];
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new Aluno();
			alunos[i].setCurso(JOptionPane.showInputDialog("Curso"+(i+1)+": "));
			alunos[i].setNome(JOptionPane.showInputDialog("Nome"+(i+1)+": "));
			alunos[i].setMatricula(Integer.parseInt((JOptionPane.showInputDialog("Matricula "+(i+1)+": "))));
		}
		
		for (int i = 0; i < alunos.length; i++) {
			Aluno aluno = alunos[i];
			
			JOptionPane.showMessageDialog(null, aluno.getCurso()+"\n"+
					aluno.getNome()+"\n"+
					aluno.getMatricula()+"\n\n");
			/*
			System.out.println(aluno.getCurso());
			System.out.println(aluno.getNome());
			System.out.println(aluno.getMatricula());
			System.out.println();*/
		}
		System.out.println();
		System.out.println("Sorteio....");
		System.out.println();
		
		int sort = 1 + (int)Math.random()*N;
		
		Aluno aluno = alunos[sort];
		
		
		JOptionPane.showMessageDialog(null, "SOTEADO: \n"+aluno.getCurso()+"\n"+
				aluno.getNome()+"\n"+
				aluno.getMatricula()+"\n\n");
		
		/*
		System.out.println(aluno.getCurso());
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		System.out.println();*/
		
	}

}
