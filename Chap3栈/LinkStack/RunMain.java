package Chap3.LinkStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunMain {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		StudNodeLinkStack studsStack = new StudNodeLinkStack();
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		String sNo = "", sName = "";
		StudNode snode = null;
		double sScore = 0;
		boolean result;
		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ѧ����Ϣ��ջ");
			System.out.println("2 ��ʾ������Ϣ");
			System.out.println("3 ѧ����Ϣ��ջ");
			System.out.println("0 �˳�\n");
			System.out.println("���������ѡ��");
			int choice = Integer.parseInt(read.readLine());
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("������ѧ�ţ�");
				sNo = read.readLine();
				System.out.println("������������");
				sName = read.readLine();
				System.out.println("������ɼ���");
				sScore = Double.parseDouble(read.readLine());
				snode = new StudNode(sNo, sName, sScore);
				result = studsStack.Push(snode);
				if (result) {
					System.out.println("��ջ�ɹ�");
				} else {
					System.out.println("��ջʧ��,ջ�������������");
				}
				break;
			case 2:
				String visitresult = studsStack.VisitAll();
				System.out.println(visitresult);
				break;
			case 3:
				snode = studsStack.GetTop();
				result = studsStack.Pop();
				if (result) {
					System.out.println("��ջ�ɹ�����ջѧ����ϢΪ��");
					String strStudInfo;
					strStudInfo = snode.studentNo + "\t" + snode.name + "\t"
							+ snode.score;
					System.out.println(strStudInfo);
				} else {
					System.out.println("��ջʧ��,ջΪ��,�������");
				}
				break;
			default:
				System.out.println("ѡ���������ѡ");
				break;
			}
		}
	}
}
