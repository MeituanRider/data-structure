package KuoHaoPeiDui;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		String bds = "";
		System.out.println("请输入一串表达式字符串");
		bds = read.next();
		char[] ch = bds.toCharArray();//将字符串转化为字符数组
		KuoHaoPdLinkStack stack = new KuoHaoPdLinkStack();
		CharNode node = null;
		boolean flag = true;// 标志变量，为TRUE表示可以配对，为FALSE表示不可配对
		char outc;
		for (char c : ch) {
			if (c == '{' || c == '[' || c == '(') {
				node = new CharNode(c);
				stack.Push(node);
			}
			if (c == '}' || c == ']' || c == ')') {
				if (stack.StackEmpty()) {
					flag = false;
					break;
				} else {
					outc = stack.GetTop().ch;// 取栈顶元素
					switch(c)
					{
					case '}':
						if (outc == '{') {
							stack.Pop();
						} else {
							flag = false;
							break;
						}
						break;
					case ']':
						if (outc == '[') {
							stack.Pop();
						} else {
							flag = false;
							break;
						}
						break;
					case ')':
						if (outc == '(') {
							stack.Pop();
						} else {
							flag = false;
							break;
						}
						break;
					}					
				}
			}
		}
		if (flag == true && stack.StackEmpty()) {
			System.out.println("括号配对正确。");
		} else {
			System.out.println("括号配对不正确。");
		}
		/*
		 * 1）凡出现左括弧，则进栈，凡不是括弧则不做任何处理； 2）凡出现右括弧，首先检查栈是否空 若栈空，则表明该“右括弧”多余，表明不匹配
		 * 否则和栈顶元素比较， 若相匹配，则“左括弧出栈” ， 否则表明不匹配。 3）表达式检验结束时， 若栈空，则表明表达式中匹配正确，
		 * 否则表明“左括弧”有余。
		 */

	}

}
