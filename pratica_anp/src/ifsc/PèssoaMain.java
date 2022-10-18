package ifsc;

public class PèssoaMain {
public static void main(String[] args) {
	Professor prof = new Professor();
	
	prof.setNome("José");
	prof.setSiape(5553);
	
	Aluno alun = new Aluno();
	
	alun.setNome("Miguel");
	alun.setMatricula(33301567);

System.out.println("Nome do professor:"+prof.getNome());
System.out.println("Siape do professor:"+prof.getSiape());
System.out.println("Nome do aluno:"+alun.getNome());
System.out.println(("Número de matrícula do aluno:"+alun.getMatricula()));
}
}
