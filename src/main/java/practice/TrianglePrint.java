package practice;

public class TrianglePrint {

    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        int var1 = 1;
        int var = 1;
        for (int i = 1; i <= n; i++) {
            // for odd rows
            if (i % 2 != 0) {
                var = var + i - 1;
                for(int j = 1; j <= i; j++){
                    if(j == 1){
                        System.out.print(var);
                    }else{
                        System.out.print("*" + var);
                    }
                    var++;
                }
            }
            //for even rows
            else {
                var1 = var + i - 1;
                for(int j = 1; j <=i; j++){
                    if(j == 1)
                    {
                        System.out.print(var1);
                    }
                    else
                    {
                        System.out.print("*" + var1);
                    }
                    var1--;
                }
            }
            System.out.println();
        }
    }
}
