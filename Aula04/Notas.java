import javax.swing.JOptionPane;

public class Notas{
  public static void main(String[] args) {
    double Array[] = new double[5];
    for(int i=0; i<5; i++){
      Array[i]= Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
    }
    double a=0;
    for(int i=0; i<5; i++){
      a += Array[i];
    }
    double media = a/5;
    JOptionPane.showMessageDialog(null, "A médias das notas é: " + media);
    }
}
