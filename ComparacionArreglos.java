import javax.swing.JOptionPane;

public class ComparacionArreglos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Tamaño de arreglos"));
        int[] a = new int[n], b = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("A[" + i + "]"));
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("B[" + i + "]"));
            
            if (a[i] > b[i]) {
                System.out.println("Posición " + i + ": A gana (" + a[i] + " > " + b[i] + ")");
            } else if (b[i] > a[i]) {
                System.out.println("Posición " + i + ": B gana (" + b[i] + " > " + a[i] + ")");
            } else {
                System.out.println("Posición " + i + ": Empate (" + a[i] + ")");
            }
        }
    }
}
