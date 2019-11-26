package SingleLink;
import java.io.IOException;
import SingleLink.StudNode;

public interface ILinkListOperation {
//	(1) ����������SetLinkList() ������һ��������
	void SetLinkList() throws NumberFormatException, IOException;
//	(2) ������ĳ���GetLength()�����س���������
	int GetLength();
//	(3) ȡ��i��Ԫ�صĽ�� GetNode(i)���д˽ڵ㣬������ָ�룬���򷵻ؿ�null
	StudNode GetNode(int i);
//	(4) ���ҽ��Location(key)���ҵ����ش˽���ָ�룬�Ҳ��������ؿ�null
	StudNode Location(String key);
//	(5) ��ָ��λ��i������һ�����Insert(i��node) ������ɹ�����true��ʧ�ܷ���false
	boolean Insert(int i,StudNode node);
//	(6) ׷��Append(node) ��������β׷��һ��Ԫ�أ�����ɹ�����true��ʧ�ܷ���false
	boolean Append(StudNode node);
//	(7) ɾ����i�����Delete(i)�����ɹ�����true��ʧ�ܷ���false
	boolean Delete(int i);
//	(8) �б��Ƿ�� Empty()
	boolean Empty();
//	(9) ����������VisitAll()��������������������
	String VisitAll();
}
