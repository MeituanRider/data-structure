package JZZH;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int x,xx,k;
		ZZZH zzzh= new ZZZH();  //ʵ������һ��ջ
		System.out.println("����һ����");
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
		System.out.println("10��������"+xx+"��Ӧ��2������Ϊ��"+result);

	}

}
