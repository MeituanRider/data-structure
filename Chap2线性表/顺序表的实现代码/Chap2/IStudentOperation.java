package Chap2;

public interface IStudentOperation {
	int GetLength();//获取顺序表长度

	StudScore GetNode(int i);//获取顺序表第i号元素，若没有返回空

	int Location(String name);//在顺序表中查找某姓名，返回其序号，没找到返回-1

	boolean Append(StudScore s);//在顺序表的表尾追加一个元素,如果已满则追加失败
	boolean Insert(StudScore s,int i);//在顺序表的第i序号位置插入一个元素,如果已满则插入失败
	boolean Delete(int i);//删除顺序表中第I号元素，若成功返回true，失败返回false

	boolean Empty();//判断顺序表是否为空

	String VisitAll(); //遍历顺序表，返回数据
}
