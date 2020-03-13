package com.hust.soict.congtm.helper;

/**
 * @author: zovivo
 * Created on 3/13/20
 */

public class BubbleSort implements NumberSorter {

    @Override
    public void sort(int[] input) {
        int inputLength = input.length;
        int temp;

        for (int i = 0; i < inputLength; i++) {


            for (int j = 1; j < (inputLength - i); j++) {

                if (input[j - 1] > input[j]) {
                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                }

            }
        }
    }
}
