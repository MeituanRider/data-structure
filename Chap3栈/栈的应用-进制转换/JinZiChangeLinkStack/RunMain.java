package Chap3.JinZiChangeLinkStack;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n,nn;
		System.out.println("������һ��������");
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
		System.out.println("ʮ������"+nn+"��Ӧ�İ˽������ǣ�"+result);
	}

}
