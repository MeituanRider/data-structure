package Chap2;

public interface IStudentOperation {
	int GetLength();//��ȡ˳�����

	StudScore GetNode(int i);//��ȡ˳����i��Ԫ�أ���û�з��ؿ�

	int Location(String name);//��˳����в���ĳ��������������ţ�û�ҵ�����-1

	boolean Append(StudScore s);//��˳���ı�β׷��һ��Ԫ��,���������׷��ʧ��
	boolean Insert(StudScore s,int i);//��˳���ĵ�i���λ�ò���һ��Ԫ��,������������ʧ��
	boolean Delete(int i);//ɾ��˳����е�I��Ԫ�أ����ɹ�����true��ʧ�ܷ���false

	boolean Empty();//�ж�˳����Ƿ�Ϊ��

	String VisitAll(); //����˳�����������
}
