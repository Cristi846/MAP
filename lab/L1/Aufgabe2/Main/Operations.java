package Aufgabe2.Main;

public class Operations {

    int[] numbers = {4, 8, 3, 10, 17};
    public int maxNum(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];
        return max;
    }
    public int minNum(){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] < min)
                min = numbers[i];
        return min;
    }

    public int maxSum(){
        int max = maxNum();
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        return sum - max;
    }

    public int minSum(){
        int min = minNum();
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        return sum - min;
    }
}
