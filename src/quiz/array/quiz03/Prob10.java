package quiz.array.quiz03;

public class Prob10 {

    public static void main(String[] args) {

        int a[][] = { {30,30,30,30}, {40,40,40,40}, {50,50,50,50} };
        int b[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
        int c[][] = new int[3][4];

        Prob10 pb = new Prob10();
        pb.sub(a,b,c);
        pb.prn(c);

    }

    public int[][] sub(int[][] a, int[][] b, int[][] c){

        /* 이곳에 프로그램을 완성하십시오. */
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        return c;
    }

    public void prn(int[][] c){

        /* 이곳에 프로그램을 완성하십시오. */
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }


}
