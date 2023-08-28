package com.chuksabadom._2023._08_august;

import java.util.HashMap;

public class Solution_26_08_2023 {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> map =new HashMap<>();
        int count=0;
        int i=0;
        int j=0;
        int max=0;
        int n=s.length();
        while(i<n && j<n)
        {
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            count++;
            if(map.size()==k)
            {
                if(max<count)
                    max=count;
            }
            while(i<n && map.size()>k)
            {

                map.replace(s.charAt(i),map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i))==0)
                {
                    map.remove(s.charAt(i));
                }
                count--;
                i++;
            }
            j++;
        }
        if(max==0)
            return -1;
        return max;
    }

    public static void main(String[] args) {
        int answer = new Solution_26_08_2023().longestkSubstr("aabacbebebe", 3);
        System.out.println(answer);
    }
}
