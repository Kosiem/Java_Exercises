import java.util.Scanner;
public class Zad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int number;
        System.out.print("Podaj a \n");
        a = sc.nextInt();
        System.out.print("Podaj b \n");
        b = sc.nextInt();

        System.out.print("-----------------------------------------\n");

        int[][] tab = new int[a][b];
        for(int i = 0; i < a; i ++){
            for(int j = 0; j < b; j++){
               number = sc.nextInt();
               tab[i][j] = number;
            }

        }

        int[][] trtab = new int[b][a];
        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                trtab[i][j] = tab[j][i];
            }
        }

        System.out.print("-----------------------------------------\n");
        System.out.print("Transponowana macierz\n");

        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
                System.out.print(trtab[i][j] + " ");
            }
            System.out.print("\n");
        }




    }
}