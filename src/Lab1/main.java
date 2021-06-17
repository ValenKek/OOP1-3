package Lab1;

import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class main
{

    public static void main(String[] args)
    {
        System.out.println(thirty("AbRa"));
    }
    public static int twoStringComparer(String str1, String str2)
    {
        Map<Character, Integer> letters = new HashMap<>();
        Integer countOfLetter;
        for(int index = 0, size = str2.length(); index < size; index++) {
            countOfLetter = letters.get(str2.charAt(index));
            if (countOfLetter != null)
                countOfLetter++;
            else
                countOfLetter = 1;

            letters.put(str2.charAt(index), countOfLetter);
        }
        int str1Length;
        int count = 0;
        while (true) {
            str1Length = str1.length();
            for (int index = 0, size = str1.length(); index < size; index++) {

                countOfLetter = letters.get(str1.charAt(index));
                if (countOfLetter == null) continue;

                if (countOfLetter != 1)
                    letters.replace(str1.charAt(index), countOfLetter, countOfLetter - 1);
                else
                    letters.remove(str1.charAt(index));
                --str1Length;
            }
            if(str1Length != 0)
                break;
            count++;
        }
            return count;
    }
    public static int thirty(String str) {
        int result = 0;
        int tmp;
        int tmpLength;
        String tmpString;
        for (int index = 2, size = str.length(); index <= size; index++) {

            tmpString = str.substring(0, index);

            tmpLength = tmpString.length();

            tmp = upperCaseLettersCount(tmpString);

            if(tmp == tmpLength - tmp && tmpLength > result)
                result = tmpLength;
        }


        return result;
    }
    public static int upperCaseLettersCount(String str) {
        int result = 0;
        for(int index =0, size = str.length(); index < size ; index++)
        {
            if(Character.isUpperCase(str.charAt(index))) {
                result++;
            }
        }
        return result;
    }
    public static int[] ten(int[] ... array){
        Set<Integer> set = new HashSet<>();
        for (int[] item :
                array) {
            ArrayList<Integer> tmp = new ArrayList<Integer>(item.length);
            for (int item1 :item) {
                tmp.add(item1);
            }
            set.addAll(tmp);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        for(int i = 0; i < list.size();i++){
            if(!isPrime(list.get(i))){
                list.remove(list.get(i));
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
    public static boolean isPrime(final int n)
    {
        for (int i=2;i<n;i++)
        {
            if (n%i==0) return false;
        }
        return (n>1);
    }
}