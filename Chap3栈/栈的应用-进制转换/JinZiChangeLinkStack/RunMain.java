package Chap3.JinZiChangeLinkStack;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n,nn;
		System.out.println("请输入一个正整数");
		n = read.nextInt();
		nn=n;
		JinZiChangeLinkStack stack = new JinZiChangeLinkStack();
		NumberNode node;
		while (n != 0) {
			 node = new NumberNode(n % 8);
			stack.Push(node);
			n = n / 8;
		}
		String result="";
		while(!stack.StackEmpty())
		{
			node=stack.GetTop();
			result+=node.number;
			stack.Pop();
		}
		System.out.println("十进制数"+nn+"对应的八进制数是："+result);
	}

}
