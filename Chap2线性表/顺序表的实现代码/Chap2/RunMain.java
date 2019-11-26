package Chap2;


import java.io.IOException;
import java.util.Scanner;

public class RunMain {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String sNo = "", sName = "";
		StudScore snode=null;
		double sScore = 0;
		int i = 0;
		SequenceStudent liststud=new SequenceStudent();
		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ׷�Ӽ�¼");
			System.out.println("2 ��ʾ������Ϣ");
			System.out.println("3 ��ѯ����");
			System.out.println("4 ��ʾ˳�����");
			System.out.println("5 ��ȡ��i��Ԫ��");
			System.out.println("6 ɾ����i��Ԫ��");
			System.out.println("7 �ж��Ƿ�Ϊ��");
			System.out.println("8 �����¼");
			System.out.println("0 �˳�\n");
			System.out.println("���������ѡ��");
			int choice = Integer.parseInt(read.next());
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.println("������ѧ�ţ�");
				sNo = read.next();
				System.out.println("������������");
				sName = read.next();
				System.out.println("������ɼ���");
				sScore = read.nextDouble();
				snode = new StudScore(sNo,sName,  sScore);
				liststud.Append(snode);
				System.out.println();
				break;
			case 2:
				String visitresult = liststud.VisitAll();
				System.out.println(visitresult);
				break;
			case 3:
				System.out.println("������������");
				sName = read.next();
				int result = liststud.Location(sName);
				if (result == -1) {
					System.out.println("���޴��ˣ�");
				} else {
					StudScore st = liststud.stud[result];
					System.out.println(st.studentNo + "\t" + st.name + "\t"
							+ st.score);
				}
				break;
			case 4:
				int length = liststud.GetLength();
				System.out.println("˳���ǰ����Ϊ" + length);
				break;
			case 5:
				System.out.println("����������ţ�");
				i = read.nextInt();
				StudScore stud = liststud.GetNode(i);
				if (stud == null) {
					System.out.println("û�д���Ž��");
				} else {
					StudScore st = liststud.GetNode(i);
					System.out.println(st.studentNo + "\t" + st.name + "\t"
							+ st.score);
				}
				break;
			case 6:
				System.out.println("�������ɾ�����ţ�");
				i = read.nextInt();
				boolean delresult = liststud.Delete(i);
				if (delresult) {
					System.out.println("ɾ���ɹ���");
				} else {
					System.out.println("ɾ��ʧ�ܣ�");
				}
				break;
			case 7:
				boolean isempty = liststud.Empty();
				if (isempty) {
					System.out.println("˳���ǰΪ�գ�");
				} else {
					System.out.println("˳���ǰ���գ�");
				}
				break;
			case 8:
				System.out.println("������ѧ�ţ�");
				sNo = read.next();
				System.out.println("������������");
				sName = read.next();
				System.out.println("������ɼ���");
				sScore = read.nextDouble();
				snode = new StudScore(sNo,sName,  sScore);
				System.out.println("���������λ�ã�");
				i =read.nextInt();
				liststud.Insert(snode,i);
				System.out.println();
				break;
			default:
				System.out.println("ѡ���������ѡ");
				break;
			}
		}
	}
}
