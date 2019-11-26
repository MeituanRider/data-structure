package JudgeHuiWei;

import java.util.Scanner;

public class JudgeHuiWeiRunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String str = "";
		System.out.println("������һ���ַ���");
		str = read.next();
		read.close();
		char[] ch = str.toCharArray();
		CharLinkQueue charqueue=new  CharLinkQueue();
		CharLinkStack charstack=new  CharLinkStack();
		CharNode node = null;
		for (char c : ch) {
				node = new CharNode(c);
				charstack.Push(node);
				charqueue.EnQueue(node);
		}

		boolean flag = true;// ��־������ΪTRUE��ʾ�ǻ��ģ�ΪFALSE��ʾ���ǻ���
		char qc,sc;
		while(!charstack.StackEmpty())
		{
			qc=charstack.GetTop().ch;
			charstack.Pop();
			sc=charqueue.GetFront().ch;
			charqueue.OutQueue();
			if(qc!=sc)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(str+"���ǻ��ġ�");
		}
		else
		{
			System.out.println(str+"�����ǻ��ġ�");
		}
		
	}

}
