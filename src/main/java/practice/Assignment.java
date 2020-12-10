package practice;

public class Assignment {

    public static void main(String[] args) {
        int candles[] = {3,4,5,6,4,5,4,8,7};

        int result = minNumberofBlows(candles);
        System.out.println("Minimum blows required : " + result);
    }

    private static int minNumberofBlows(int[] candles) {

		/*
		First approach would be to iterate array of candles and populate it in a Set,
		Since, set stores only unique values, and we can blow candles at single height in one blow
		Number of elements in the Set gives us min number of blows requiered.
		*/


        //Since, we don't use ready made JDK libraries, we have following solution
        int result = 0;
        for(int i = 0; i < candles.length ; i++) {
            int j = 0;
            for(j = 0; j < i; j++)
                if(candles[i] == candles[j])
                    break;
            if(i == j)
                result++;
        }

        return result;
    }

}
