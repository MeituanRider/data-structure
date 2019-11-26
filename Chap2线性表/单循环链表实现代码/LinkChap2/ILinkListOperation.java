package SingleLink;
import java.io.IOException;
import SingleLink.StudNode;

public interface ILinkListOperation {
//	(1) 建立单链表SetLinkList() ：产生一个单链表。
	void SetLinkList() throws NumberFormatException, IOException;
//	(2) 求单链表的长度GetLength()，返回长度整数。
	int GetLength();
//	(3) 取第i个元素的结点 GetNode(i)：有此节点，返回其指针，否则返回空null
	StudNode GetNode(int i);
//	(4) 查找结点Location(key)：找到返回此结点的指针，找不到，返回空null
	StudNode Location(String key);
//	(5) 在指定位置i处插入一个结点Insert(i，node) ：插入成功返回true，失败返回false
	boolean Insert(int i,StudNode node);
//	(6) 追加Append(node) ：在链表尾追加一个元素，插入成功返回true，失败返回false
	boolean Append(StudNode node);
//	(7) 删除第i个结点Delete(i)：若成功返回true，失败返回false
	boolean Delete(int i);
//	(8) 判表是否空 Empty()
	boolean Empty();
//	(9) 遍历单链表VisitAll()：遍历单链表，返回数据
	String VisitAll();
}
