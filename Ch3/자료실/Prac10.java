package Ch3.자료실;

public class Prac10 {
    public static void main(String[] args) {
        int[][] intArray=new int[4][4];

        for(int i=0;i<intArray.length;i++) {
            for(int j=0;j<intArray[i].length;j++) {
                intArray[i][j]=0;
            }
        }

        for(int i=0, temp=i, k, l;i<10;i++) {
            k=(int)(Math.random()*10%4);
            l=(int)(Math.random()*10%4);
            if(intArray[k][l] == 0) {
                intArray[k][l]=(int) (Math.random() * 10 + 1);
                temp=i;
            }
            else {
                i=temp;
            }
        }

        for(int i=0;i<intArray.length;i++) {
            for(int j=0;j<intArray[i].length;j++) {
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
