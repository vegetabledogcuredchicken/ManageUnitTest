package org.apache.commons.lang3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsTest{

    @Test
    public void testClone() {
        //测试用例：一个1-20的整型数组
        int []arr = new int [20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }
/**
 * 测试方法：clone
 * 功能：拷贝数组
 */
        int [] temarr = new int[20];
        temarr = ArrayUtils.clone(arr);
    //创建目标输出
        int [] rearr = new int[20];
        for (int i = 0; i < 20; i++) {
            rearr[i] = arr[i];
        }
        Assert.assertArrayEquals(rearr, temarr);

    }

    @Test
    public void reverseArrTest() {
        //测试用例：一个1-20的整型数组
        int []arr = new int [20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }
/**
 * 测试方法： reverse
 * 功能：调转数组
 */
//构造目标数组
        int []reArr = new int[20];
        for (int i = 0; i < 20; i++) {
            reArr[i] = 20 - i;
        }
        ArrayUtils.reverse(arr);
        Assert.assertArrayEquals(arr, reArr);
    }



/*    @Test
    public void testSubarray() {
        //测试用例：一个1-20的整型数组
        int []str = new int [20];
        for (int i = 0; i < 20; i++) {
            str[i] = i + 1;
        }
*//**
 * 测试方法：subarray
 * 功能：截取子数组（输入两个位置，数组下标，包头不包尾）
 *//*
        int [] temstr = ArrayUtils.subarray(str, 5, 15);
//定义目标结果
        int [] restr = {6,7,8,9,10,11,12,13,14,15};
        Assert.assertArrayEquals(temstr, restr);


    }*/
    @After
    public void tearDown() throws Exception {
    }
}