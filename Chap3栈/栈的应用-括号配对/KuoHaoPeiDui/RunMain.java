package KuoHaoPeiDui;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		String bds = "";
		System.out.println("������һ�����ʽ�ַ���");
		bds = read.next();
		char[] ch = bds.toCharArray();//���ַ���ת��Ϊ�ַ�����
		KuoHaoPdLinkStack stack = new KuoHaoPdLinkStack();
		CharNode node = null;
		boolean flag = true;// ��־������ΪTRUE��ʾ������ԣ�ΪFALSE��ʾ�������
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
					outc = stack.GetTop().ch;// ȡջ��Ԫ��
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
			System.out.println("���������ȷ��");
		} else {
			System.out.println("������Բ���ȷ��");
		}
		/*
		 * 1�������������������ջ�����������������κδ��� 2�������������������ȼ��ջ�Ƿ�� ��ջ�գ�������á������������࣬������ƥ��
		 * �����ջ��Ԫ�رȽϣ� ����ƥ�䣬����������ջ�� �� ���������ƥ�䡣 3�����ʽ�������ʱ�� ��ջ�գ���������ʽ��ƥ����ȷ��
		 * ��������������������ࡣ
		 */

	}

}
