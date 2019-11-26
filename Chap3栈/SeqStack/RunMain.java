package SeqStack;

import java.util.Scanner;

class RunMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sno,sname;
		float score;
		StudNode s = null;
		int choice ;
		boolean result;
		
		Scanner read = new Scanner(System.in);
		StudSeqStack stdstack =new StudSeqStack();
		while(true){
			System.out.println("*****ѧ���ɼ�ջ��ʾ*******");
			System.out.println("1��ѧ����Ϣ��ջ");
			System.out.println("2����ȡջ��Ԫ��");
			System.out.println("3��ѧ����Ϣ��ջ");
			System.out.println("0���˳�ϵͳ");
			System.out.println("������ѡ��(0~3)��");
			choice = read.nextInt();
			switch(choice)
			{
			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("����ѧ��");
				sno = read.next();
				System.out.println("��������");
				sname = read.next();
				System.out.println("�������");
				score = read.nextFloat();
				s = new StudNode(sno,sname,score);
				result = stdstack.Push(s);
				if(result){
					System.out.println("��ջ�ɹ�");					
				}else{
					System.out.println("��ջʧ��");
				}
				break;
			case 2:
				s = stdstack.GetTop();
				if(s!=null){
					System.out.print(s.sno+"  ");
					System.out.print(s.sname+"   ");
					System.out.println(s.score+"   ");
				}else{
					System.out.println("ջ�ѿ�");
				}
				break;
			case 3:
				result = stdstack.Pop();
				if(result){
					System.out.println("��ջ�ɹ�");
				}else{
					System.out.println("��ջʧ��");
				}
				break;			
			}
		}

	}

}
