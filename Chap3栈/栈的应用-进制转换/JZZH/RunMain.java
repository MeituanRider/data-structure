package JZZH;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int x,xx,k;
		ZZZH zzzh= new ZZZH();  //实例化了一个栈
		System.out.println("输入一个数");
		x=read.nextInt();
		xx = x;
		while(x!=0){
			zzzh.push(x % 2);
			x = x / 2 ;
		}
		String result ="";
		while(!zzzh.stackEmpty()){
			k = zzzh.getTop();
			result += k;
			zzzh.pop();
		}
		System.out.println("10进制数："+xx+"对应的2进制数为："+result);

	}

}
