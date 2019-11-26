package Chap2;

public class SequenceStudent implements IStudentOperation {
	final int MaxLength = 100;
	StudScore stud[] = new StudScore[MaxLength];// 顺序表数组，存放学生记录
	int Length=0;// 顺序表长度，当前顺序表中的记录个数

	@Override
	public int GetLength() { // 求顺序表的长度
		// TODO Auto-generated method stub
		return Length;
	}

	@Override
	public StudScore GetNode(int i) {// 取第i个元素结点
		// TODO Auto-generated method stub
		if (i < 0 || i > Length - 1)
			return null;
		else
			return stud[i];
	}

	@Override
	public int Location(String name) {// 查找姓名，返回所在数组序号，没有返回-1
		// TODO Auto-generated method stub
		int result = -1;
		for (int i = 0; i < Length; i++) {
			if (stud[i].name.equals(name)) {
				result = i;
				break;
			}
		}
		return result;
	}

	@Override
	public boolean Append(StudScore s) {
		// TODO Auto-generated method stub
		if (Length >= MaxLength) {
			System.out.println("线性表已满，不能再插入");
			return false;
		} else {
			stud[Length] = s;
			Length++;
			return true;
		}
	}

	@Override
	public boolean Insert(StudScore s, int i) {
		// TODO Auto-generated method stub
		if (Length > MaxLength) {
			System.out.println("线性表已满，不能再插入");
			return false;
		} else if (i < 0 || i > Length) {
			System.out.println("插入位置不合适");
			return false;
		} else {
			if (i != Length) {  //i==Length时，是插在线性表尾，元素不用后移；i!=Length时元素要后移
				for (int k = Length - 1; k >= i; k--) {
					stud[k + 1] = stud[k];
				}
			}
			stud[i] = s;
			Length++;
			return true;
		}
	}

	@Override
	public boolean Delete(int i) {
		// TODO Auto-generated method stub
		if (i < 0 || i >= Length) {
			return false;
		} else {
			for (int k = i + 1; k < Length; k++) {
				stud[k - 1] = stud[k];
			Length--;
			}
			return true;
		}
	}

	@Override
	public boolean Empty() {
		// TODO Auto-generated method stub
		return Length > 0 ? false : true;
	}

	@Override
	public String VisitAll() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < Length; i++) {
			sb.append(stud[i].studentNo + "\t" + stud[i].name + "\t"
					+ stud[i].score + "\n");
		}
		return sb.toString();
	}

}
