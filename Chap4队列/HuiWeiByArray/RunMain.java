package HuiWeiByArray;

import java.util.Scanner;
public class RunMain {

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
		CharArrayQueue charqueue=new  CharArrayQueue();
		CharArrayStack charstack=new  CharArrayStack();
		CharNode nodes = null;
		CharNode nodeq = null;
		for (char c : ch) {
				nodes = new CharNode(c);
				nodeq = new CharNode(c);
				charstack.Push(nodes);
				charqueue.EnQueue(nodeq);
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
