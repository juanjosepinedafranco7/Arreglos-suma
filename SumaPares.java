import javax.swing.JOptionPane;

public class SumaPares {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño"));
        int[] a = new int[n], b = new int[n];
        int totalPares = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("A[" + i + "]"));
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("B[" + i + "]"));
            
            if (a[i] % 2 == 0 && b[i] % 2 == 0) {
                totalPares += a[i] + b[i];
                System.out.println("Pos[" + i + "] Ambos pares: " + (a[i] + b[i]));
            } else {
                System.out.println("Pos[" + i + "] No ambos pares, se omite");
            }
        }
        System.out.println("Total suma pares: " + totalPares);
    }
}
