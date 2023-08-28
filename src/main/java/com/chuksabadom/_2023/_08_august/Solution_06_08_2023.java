package com.chuksabadom._2023._08_august;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_06_08_2023 {
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> res = new ArrayList<String>();
        String ans = "";
        perm(S, ans, res);
        Collections.sort(res);
        return res;
    }

    public static void perm(String str, String ans, ArrayList<String> res){
        if(str.isEmpty()){
            res.add(ans);
        }
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1);
            perm(newstr, ans + ch, res);
        }
    }

    public static void main(String[] args) {

        String S = "ABSG";
        ArrayList<String> answer = new Solution_06_08_2023().permutation(S);
        for(String arr : answer) {
            System.out.print(arr + " ");
        }
    }
}
