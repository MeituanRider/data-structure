package ArrayQueue;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudNodeArrarQueue studsQueue = new StudNodeArrarQueue();
		Scanner read = new Scanner(System.in);
		String sno = "", sname = "";
		StudNode s=null;
		double score = 0;
		boolean result;
		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ѧ����Ϣ���");
			System.out.println("2 ��ʾ��ͷԪ��");
			System.out.println("3 ѧ����Ϣ����");
			System.out.println("0 �˳�\n");
			System.out.println("���������ѡ��");
			int choice = read.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("������ѧ�ţ�");
				sno = read.next();
				System.out.println("������������");
				sname = read.next();
				System.out.println("������ɼ���");
				score = read.nextDouble();
				s = new StudNode(sno,sname,score);
				result = studsQueue.EnQueue(s);
				if (result) {
					System.out.println("��ӳɹ�");
				} else {
					System.out.println("���ʧ��,ջ�������������");
				}
				break;
			case 2:
				s = studsQueue.GetFront();
				System.out.println(s.studentNo+"\t"+s.name+"\t"+s.score);
				break;
			case 3:
				s = studsQueue.GetFront();
				result =studsQueue.OutQueue();
				if(result)
				{
					System.out.println("���ӳɹ�������ѧ����ϢΪ��");
				}
				else
				{
					System.out.println("����ʧ��,��Ϊ��,�������");
				}
				break;
			default:
				System.out.println("ѡ���������ѡ");
				break;
			}
		}
	}

}
