//package com.company;

import java.util.HashMap;

public class SparseMatrix {

    static HashMap<String, Integer> hashMap;
    public SparseMatrix(){

    }

    // create an empty square matrix of given size
    public void createEmptyMatrix(int size){
        hashMap = new HashMap<>();
    }

    // put A[i][j] = 1
    public void set(int i, int j){
        String coOrdinate = Integer.toString(i).concat(",").concat(Integer.toString(j));
        hashMap.put(coOrdinate,1);
    }

    // return value at A[i][j]
    public int get(int i, int j){
        String coOrdinate = Integer.toString(i).concat(",").concat(Integer.toString(j));
        int ret = 0;
        if (hashMap.containsKey(coOrdinate)){
            ret = hashMap.get(coOrdinate);
        }
        return ret;
    }

}
