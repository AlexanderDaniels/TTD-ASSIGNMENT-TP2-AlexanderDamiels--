/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.tp.tpassignmentquestion3.services.Impl;

import com.alex.tp.tpassignmentquestion3.services.NullnessService;

/**
 *
 * @author Alex
 */
public class NullnessServiceImplementation implements NullnessService{

    private int[] arr = {1,2,3};
    private int[] arr2 = null;
    
    public int[] getArray() {        
        return arr;
    }

    public int[] getArray2() {
        return arr2;
    }
    
}
