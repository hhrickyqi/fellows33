/**
 * 打印100以内所有的奇数，偶数和3的倍数（不包括100）
 */
public class Test_16 {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100){

            if( i % 2 == 0){
                System.out.println(i +"是偶数");
            } else{
                System.out.println(i +"是奇数");
            }

            if(i % 3 ==0){
                System.out.println(i + "是3的倍数");
            }

            i ++;
        }
    }
}
