package com.hackbulgaria.corejava;

import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.omg.CORBA.OMGVMCID;
import org.omg.CORBA.portable.ValueOutputStream;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        if (!(number % 2 == 0)) {
            return true;
        }
        return false;
    }

    /*
     * ...........................................................................
     */
    @Override
    public boolean isPrime(int number) {
        if (number == 1)
            return true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        // TODO Auto-generated method stub
        return true;
    }

    /*
     * ...........................................................................
     */
    @Override
    public int min(int... array) {
        int minElem;
        minElem = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minElem > array[i])
                minElem = array[i];
        }
        return minElem;
        // TODO Auto-generated method stub
        // return 0;
    }

    /*
     * ...........................................................................
     */
    @Override
    public int kthMin(int k, int[] array) {
        int minElem;
        int position = 0;
        minElem = array[0];
        for (int a = 0; a <= k; a++) {

            for (int i = a; i < array.length; i++) {
                if (minElem > array[i])
                    minElem = array[i];
                position = i;
            }
            int tmp = array[0];
            array[a] = minElem;
            array[position] = tmp;
        }
        // TODO Auto-generated method stub
        return array[k];
    }

    /*
     * ...........................................................................
     */
    @Override
    public float getAverage(int[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        // TODO Auto-generated method stub
        return sum / array.length;
    }

    /*
     * ...........................................................................
     */
    @Override
    public long getSmallestMultiple(int upperBound) {
        // TODO Auto-generated method stub

        return 0;
    }

    public boolean isPalindrome(long n) {
//        ArrayList<Object> myList = new ArrayList<>();
//        while (n >0){
//            myList.add(n%10);
//            n= n/10;
//        }
//        String temp = myList.toString();
        String temp = String.valueOf(n);
        System.out.println(temp);
        int k = temp.length()-1;
        for (int i = 0; i < temp.length()-1; i++) {
            if (temp.charAt(i) != temp.charAt(k)) {
                return false;
            }
            k--;
        }
        return true;
    }

    @Override
    public long getLargestPalindrome(long N) {
        if(isPalindrome(N-1)){
            return N-1;
        }else getLargestPalindrome(N-1);
        return 0;
    }

    @Override
    public int[] histogram(short[][] image) {
        // TODO Auto-generated method stub
        return null;
    }

    public long fact(long n) {
        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    @Override
    public long doubleFac(int n) {

        // TODO Auto-generated method stub

        long fact = fact(n);
        fact = fact(fact);
        return fact;
    }

    @Override
    public long kthFac(int k, int n) {
        // TODO Auto-generated method stub
        long fact = fact(n);
        for (int i = 2; i <= k; i++) {
            fact = fact(fact);
        }
        return fact;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        //(1,1,2,2,3,3,4,4,2) -> 2
        Arrays.sort(array);
        if(array[0] != array[1]){
            return array[0];
        }
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i-1]){
                count ++;
            }else if(count % 2 == 0){
                return array[i-1];
            }else count = 0;
        }
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long pow(int a, int b) {
        // TODO Auto-generated method stub
        int tmp = 1;
        for (int i = 0; i < b; i++) {
            tmp *= a;
        }
        return tmp;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        long scalarSum = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            scalarSum += a[i] * b[i];
        }
        // TODO Auto-generated method stub
        return scalarSum;
    }

    @Override
    public int maxSpan(int[] array) {
        
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean canBalance(int[] array) {
        for (int i = 0 ; i < array.length; i ++){
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j<=i;j++){
                sum1 += array[j];
            }
            for (int j = array.length-1; j>i;j--){
                sum2 += array[j];
            }
            if(sum1 == sum2)
                return true;
        }
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        // TODO Auto-generated method stub
        StringBuilder temp = new StringBuilder();
        for (int i = argument.length() - 1; i >= 0; i--) {
            temp.append(argument.charAt(i));
        }
        return temp.toString();
    }

    @Override
    public String copyEveryChar(String input, int k) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 1; j <= k; j++) {
                temp.append(input.charAt(i));
            }
        }
        return temp.toString();
    }

    @Override
    public String reverseEveryWord(String arg) {
        String[] words = arg.split(" ");
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                temp.append(words[i].charAt(j));
            }
            if (i != words.length - 1)
                temp.append(" ");
        }

        // TODO Auto-generated method stub
        return temp.toString();
    }

    @Override
    public boolean isPalindrome(String argument) {

        int k = argument.length() - 1;
        for (int i = 0; i < argument.length() - 1; i++) {
            if (argument.charAt(i) != argument.charAt(k)) {
                return false;
            }
            k--;
        }
        return true;
    }

    @Override
    public boolean isPalindrome(int number) {
        String temp = String.valueOf(number);
        int k = temp.length()-1;
        for (int i = 0; i < temp.length()-1; i++) {
            if (temp.charAt(i) != temp.charAt(k)) {
                return false;
            }
            k--;
        }
        return true;
    }

    @Override
    public int getPalindromeLength(String input) {
        for(int i = 0; i < input.length()/2; i++){
            if(i == input.length()-1 - i){
                return 0;
            }
            if(input.charAt(i) == input.charAt(input.length()-1 - i)){
                if(isPalindrome(input.substring(i, input.length()-i))){
                    return (input.length()-1-2*i)/2;
                }
            }            
        }
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String decodeURL(String input) {
       String temp = input.replace("%2F", "/");
        // TODO Auto-generated method stub
        return temp.replace("%3A", ":");
    }

    @Override
    public int sumOfNumbers(String input) {
        String[] splited = input.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)|( )");
        for (String string : splited) {
           if(string.contains()){
               
           }
           
            System.out.println(string);
        }
        // TODO Auto-generated method stub
        return 999;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        String aTmp = A.toLowerCase();
        String bTmp = B.toLowerCase();
        char[] charsA = aTmp.toCharArray();
        char[] charsB = bTmp.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        for (int i = 0; i < charsA.length; i++) {
            if (charsA[i] != charsB[i]) {
                return false;
            }
        }
        return true;
    }

    /* ................................................................ */
    @Override
    public boolean hasAnagramOf(String string, String string2) {
        String aTmp = string.toLowerCase();
        String bTmp = string2.toLowerCase();
        char[] charsA = aTmp.toCharArray();
        char[] charsB = bTmp.toCharArray();
        Arrays.sort(charsA);
       
        for (int i = 0; i < charsB.length; i++) {
        
            if (charsB[i] == charsA[0]) {
                char[] temp = Arrays.copyOfRange(charsB, i, i + charsA.length);
                Arrays.sort(temp);
                for (int j = 0; j < charsA.length; j++) {
                    if (temp[j] != charsA[j]) {
                        break;
                    }
                } if (temp[charsA.length-1] == charsA[charsA.length-1])
                    return true;
                if (i < charsA.length - 1)
                    continue;
                char[] tempR = Arrays.copyOfRange(charsB, i - charsA.length + 1, i+1);
                Arrays.sort(tempR);
                for (int j = 0; j < charsA.length; j++) {
                    if (tempR[j] != charsA[j]) {
                        break;
                    }
                }if (tempR[charsA.length-1] == charsA[charsA.length-1])
                    return true;
                continue;
            }// close A == B
            
        }// close if

        return false;
    }
    /* ................................................................ */
}
