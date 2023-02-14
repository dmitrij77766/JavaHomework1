/**
 * program
 */
public class program {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(4, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
    
        System.out.println(isPositive(5));
     
        isLeapYear(2022);
    
    
}

// N1
 
    // проверить, что сумма a и b лежит между 10 и 20
    static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    
// проверить, что х положительное
    private static boolean isPositive(int x) {
        if (x>=0) return true;
        else 
        return false;
    }

// проверить, является ли год високосным. если да - return true
    private static boolean isLeapYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
        return false;
    }

// должен вернуть массив длины len, каждое значение которого равно initialValue
//  {
        
int[] arr = {1,1,0,0,1,0,1,1,0,0};
       
for (int i = 0; i < arr.length; i++) {
   if (arr[i] == 1) arr[i] = 0;
   else arr[i] = 1;    
   System.out.println(Arrays.toString(arr));                 
}

// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
{
 
int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};  
 
   for (int i = 0; i < arr3.length; i++) {
       if (arr3[i] < 6 ) arr3[i] = arr3[i]*2;                           
   }
 System.out.println(Arrays.toString(arr3));
}
}





}


