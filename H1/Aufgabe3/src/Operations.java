import java.util.*;

public class Operations {

    public int numberBuilder(int[] arr){
        int num = 0;
        for(int i=0; i<arr.length; i++)
            num = num * 10 + arr[i];
        return num;
    }

    public int power(int[] arr){
        int pow=1;
        for(int k = 0; k < arr.length; k++)
            pow *= 10;
        return pow;
    }
    public int[] sum(int[] arr1, int[] arr2){
        int[] result;
        int num1 = numberBuilder(arr1);
        int num2 = numberBuilder(arr2);
        int num3 = num1 + num2;
        int i = 0, aux, power=power(arr1);
        if(num3 / power == 1){
            result = new int[arr2.length+1];
        }else{
            result = new int[arr2.length];
        }
        while(num3 != 0){
            result[i] = num3%10;
            num3 /= 10;
            i++;
        }
        for(int j = 0; j < result.length / 2; j++){
            aux = result[j];
            result[j] = result[result.length - j - 1];
            result[result.length - j - 1] = aux;
        }
        return result;
    }

    public int[] diff(int[] arr1, int[] arr2){
        int[] result;
        int num1 = numberBuilder(arr1);
        int num2 = numberBuilder(arr2);
        int num3 = num1 - num2;
        if(num3 < 0)
            return new int[]{-1};
        int i = 0, aux, power = power(arr1)/10;
        if (num3/power != 0)
            result = new int[arr1.length];
        else
            result = new int[arr1.length-1];
        while(num3 != 0){
            result[i] = num3%10;
            num3 /= 10;
            i++;
        }
        for(int j = 0; j < result.length / 2; j++){
            aux = result[j];
            result[j] = result[result.length - j - 1];
            result[result.length - j - 1] = aux;
        }
        return result;
    }

    public int[] mul(int[] arr, int num){
        int aux = numberBuilder(arr) * num;
        int power = power(arr), i = 0;
        int[] result;
        if(aux / power > 0)
            result = new int[arr.length+1];
        else
            result = new int[arr.length];
        while (aux !=0){
            result[i] = aux%10;
            aux /= 10;
            i++;
        }
        for(int j = 0; j < result.length / 2; j++){
            aux = result[j];
            result[j] = result[result.length - j - 1];
            result[result.length - j - 1] = aux;
        }
        return result;
    }

    public int[] div(int[] arr, int num){
        int aux = numberBuilder(arr)/num;
        int i = 0, power = power(arr)/10;
        int[] result;
        if(aux/power != 0)
            result = new int[arr.length];
        else
            result = new int[arr.length-1];
        while (aux !=0){
            result[i] = aux%10;
            aux /= 10;
            i++;
        }
        for(int j = 0; j < result.length / 2; j++){
            aux = result[j];
            result[j] = result[result.length - j - 1];
            result[result.length - j - 1] = aux;
        }
        return result;
    }
}

