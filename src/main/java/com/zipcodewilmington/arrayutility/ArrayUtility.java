package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<X> {

    public ArrayList<X> inputArray;
    public X[] input;
    public ArrayUtility(X[] inputArray) {
        this.inputArray = new ArrayList<X>(Arrays.asList(inputArray));
        this.input = inputArray;
    }

    public Integer countDuplicatesInMerge(X[] arrayToMerge, X valueToEvaluate) {
        this.inputArray.addAll(Arrays.asList(arrayToMerge));
        return countOccurrences(valueToEvaluate);
        }

    private Integer countOccurrences(X item) {
        int count = 0;
        for (X element : this.inputArray){
            if(item.equals(element)){
                count++;
            }
    }
        return count;
}

    public Integer getNumberOfOccurrences(X valueToEvaluate) {
        int count = 0;
        for (X element : this.inputArray){
            if(element.equals(valueToEvaluate))
            { count++;
            }
        }
        return count;
    }

    public X getMostCommonFromMerge(X[] arrayToMerge) {
        return null;
    }

    public X[] removeValue(X valueToRemove) {
        while(this.inputArray.contains(valueToRemove)){
            this.inputArray.remove(valueToRemove);
        }
        return this.inputArray.toArray(Arrays.copyOf(this.input, this.inputArray.size()));
    }
}
