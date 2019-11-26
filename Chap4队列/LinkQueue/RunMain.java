package LinkQueue;

import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudLinkQueue studqueue = new StudLinkQueue();
		String sno, sname;
		float score;
		StudNode s = null;
		int choice;
		boolean result;
		Scanner read = new Scanner(System.in);
		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ѧ����Ϣ���");
			System.out.println("2 ��ʾ��ͷ��Ϣ");
			System.out.println("3 ѧ����Ϣ����");
			System.out.println("0 �˳�\n");
			System.out.println("���������ѡ��");
			choice = read.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("������ѧ�ţ�");
				sno = read.next();
				System.out.println("������������");
				sname = read.next();
				System.out.println("������ɼ���");
				score = read.nextFloat();
				s = new StudNode(sno,sname,score);
				result = studqueue.EnQuery(s);
				if(result){
					System.out.println("��ӳɹ�");
				}else{
					System.out.println("���ʧ��");
				}
				break;
			case 2:
					s = studqueue.GetTop();
					if(s!=null){
						System.out.println(s.sno+" "+s.sname+" "+s.score);
					}else{
						System.out.println("�����ѿ�");
					}
				break;
			case 3:
				result = studqueue.OutQuery();
				if(result){
					System.out.println("���ӳɹ�");
				}else{
					System.out.println("����ʧ��");
				}
				break;
			}
		}
	}

}
