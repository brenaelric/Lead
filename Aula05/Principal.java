public class Principal{
  public static void main(String[] args){
    Aluno alunoIFCE = new Aluno("João", 1001, 7.5, 8.7);
    System.out.println(alunoIFCE.nome);
    System.out.println(alunoIFCE.codigo);
    System.out.println(alunoIFCE.nota1);
    System.out.println(alunoIFCE.nota2);

    Aluno2 aluno2 = new Aluno2();
    Aluno2.setNome("João");
    Aluno2.setCodigo(1001);
    Aluno2.setNota1(7.5);
    Aluno2.setNota2(8.7);

    System.out.println(aluno2.getNome());
    System.out.println(aluno2.getCodigo());
    System.out.println(aluno2.getNota1());
    System.out.println(aluno2.getNota2());
  }
}
