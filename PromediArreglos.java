import javax.swing.JOptionPane;

public class PromedioArreglos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Tamaño:"));
        int[] a = new int[n], b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("A[" + i + "]"));
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("B[" + i + "]"));
            System.out.println("Promedio[" + i + "]: " + ((a[i] + b[i]) / 2.0));
        }
    }
}
