/*
public class MyArrayUtilstest {
    public static void main(String[] args) {
        //测试用例：一个1-20的整型数组
        int[] str = new int[20];
        for (int i = 0; i < 20; i++) {
            str[i] = i + 1;
        }
    /*
    * 测试方法：clone
    * 功能：拷贝数组

int[] temstr = new int[20];
        temstr = org.apache.commons.lang3.ArrayUtils.clone(str);
//创建目标输出
        int[] anstr = new int[20];
        for (int i = 0; i < 20; i++) {
        anstr[i] = str[i];
        }
        int flag = 1; //比较两个方法结果和预期结果，通过flag进行标记
        for (int i = 0; i < 20; i++) {
        if (temstr[i] != anstr[i]) {
        flag = 0;
        }
        }
        System.out.println(flag);
        }
        }
 */



/*
import java.util.Arrays;
public class MyArrayutilTest {
    public static void main(String[] args) {
//测试用例：一个1-20的整型数组
        int []arr = new int [20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }
/**
 测试结果：
 2. JUnit 进行测试
 采用 JUnit 工具进行测试，生成测试集：
 * 测试方法： reverse
 * 功能：调转数组

//构造目标数组
int []reArr = new int[20];
        for (int i = 0; i < 20; i++) {
        reArr[i] = 20 - i;
        }
        org.apache.commons.lang3.ArrayUtils.reverse(arr);
        int flag = 1;
        for (int i = 0; i < 20; i++) {
        if(arr[i] != reArr[i]){
        flag = 0;
        }
        }
        if(flag == 1){
        System.out.println("测试成功！");
        }else if(flag == 0){
        System.out.println("测试失败！");
        System.out.print("目标数组为： " + " ");
        System.out.println(Arrays.toString(reArr));
        System.out.print("实际方法得到数组为：");
        System.out.println(Arrays.toString(arr));
        }
        }
        }
 */


import java.util.Arrays;
public class MyArrayutilTest {
    public static void main(String[] args) {
//测试用例：一个1-20的整型数组
        int []str = new int [20];
        for (int i = 0; i < 20; i++) {
            str[i] = i + 1;
        }
/**
 * 测试方法：subarray
 测试结果：
 测试方法： reverse() :
 * 功能：截取子数组（输入两个位置，数组下标，包头不包尾）
 */
        int [] temstr = org.apache.commons.lang3.ArrayUtils.subarray(str, 5, 15);
//定义目标结果
        int [] restr = {6,7,8,9,10,11,12,13,14,15};
        int flag = 1;
        for (int i = 0; i < 10; i++) {
            if(temstr != restr){
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println("方法运行成功");
            System.out.println("结果数组为");
            System.out.println(Arrays.toString(temstr));
        }
        else if(flag == 0){
            System.out.println("方法运行失败");
            System.out.print("目标结果为：" + " ");
            System.out.println(Arrays.toString(restr));
            System.out.print("实际方法得到结果为：");
            System.out.println(Arrays.toString(temstr));
        }
    }
}