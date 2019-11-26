package SingleLink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunMain {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		StudLinkList llist = new StudLinkList();
		BufferedReader read = new BufferedReader(new InputStreamReader(
				System.in));
		String sNo = "", sName = "";
		StudNode snode = null;
		double sScore = 0;
		int i = 0;
		while (true) {
			System.out.println("********ѧ���ɼ��������**********");
			System.out.println("1 ������ѭ������");
			System.out.println("2 ��ʾ������Ϣ");
			System.out.println("3 ��ѭ������ĳ���");
			System.out.println("4 ȡ��i��Ԫ�صĽ��");
			System.out.println("5 ���ҽ��");
			System.out.println("6 ��ָ��λ��i������һ�����");
			System.out.println("7 �ڵ�ѭ������β׷��һ��Ԫ��");
			System.out.println("8 ɾ����i�����");
			System.out.println("9 �б��Ƿ��");
			System.out.println("0 �˳�\n");
			System.out.println("���������ѡ��");
			int choice = Integer.parseInt(read.readLine());
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				llist.SetLinkList();
				break;
			case 2:
				String visitResult = llist.VisitAll();
				System.out.println(visitResult);
				break;
			case 3:
				int length = llist.GetLength();
				System.out.println("����ĳ���Ϊ��\t" + length);
				break;
			case 4:
				System.out.println("������ڵ��i");
				i = Integer.parseInt(read.readLine());
				if (i == 0) {
					System.out.println("0�Ž����ͷ��㣬����Ϊ�մ�");
				} else {
					snode = llist.GetNode(i);
					if (snode == null) {
						System.out.println("δ�ҵ��˽��");
					} else {
						System.out.println("�˽��Ϊ��\t" + snode.studentNo + "\t"
								+ snode.name + "\t" + snode.score);
					}
				}
				break;
			case 5:
				System.out.println("�������������");
				sName = read.readLine();
				snode = llist.Location(sName);
				if (snode == null) {
					System.out.println("���޴���");
				} else {
					System.out.println("�˽��Ϊ��\t" + snode.studentNo + "\t"
							+ snode.name + "\t" + snode.score);
				}
				break;
			case 6:
				System.out.println("������ѧ�ţ�");
				sNo = read.readLine();
				System.out.println("������������");
				sName = read.readLine();
				System.out.println("������ɼ���");
				sScore = Double.parseDouble(read.readLine());
				System.out.println("���������λ�ã�");
				i = Integer.parseInt(read.readLine());
				snode = new StudNode(sNo, sName, sScore);
				boolean iresult = llist.Insert(i, snode);
				if (iresult) {
					System.out.println("������ɹ�");
				} else {
					System.out.println("������ʧ��");
				}
				break;
			case 7:
				System.out.println("������ѧ�ţ�");
				sNo = read.readLine();
				System.out.println("������������");
				sName = read.readLine();
				System.out.println("������ɼ���");
				sScore = Double.parseDouble(read.readLine());				
				snode = new StudNode(sNo, sName, sScore);
				boolean aresult = llist.Append(snode);
				if (aresult) {
					System.out.println("���׷�ӳɹ�");
				} else {
					System.out.println("���׷��ʧ��");
				}
				break;
			case 8:
				System.out.println("�������ɾ�ڵ��i");
				i = Integer.parseInt(read.readLine());
				boolean dresult=llist.Delete(i);
				if (dresult) {
					System.out.println("���ɾ���ɹ�");
				} else {
					System.out.println("���ɾ��ʧ��");
				}
				break;
			case 9:
				boolean eresult;
				eresult=llist.Empty();
				if(eresult)
				{
					System.out.println("��ǰ����Ϊ��");
				}
				else
				{
					System.out.println("��ǰ������");
				}
			}
		}
	}

}
