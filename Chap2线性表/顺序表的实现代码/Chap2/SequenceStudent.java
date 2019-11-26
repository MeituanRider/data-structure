package Chap2;

public class SequenceStudent implements IStudentOperation {
	final int MaxLength = 100;
	StudScore stud[] = new StudScore[MaxLength];// ˳������飬���ѧ����¼
	int Length=0;// ˳����ȣ���ǰ˳����еļ�¼����

	@Override
	public int GetLength() { // ��˳���ĳ���
		// TODO Auto-generated method stub
		return Length;
	}

	@Override
	public StudScore GetNode(int i) {// ȡ��i��Ԫ�ؽ��
		// TODO Auto-generated method stub
		if (i < 0 || i > Length - 1)
			return null;
		else
			return stud[i];
	}

	@Override
	public int Location(String name) {// ������������������������ţ�û�з���-1
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
			System.out.println("���Ա������������ٲ���");
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
			System.out.println("���Ա������������ٲ���");
			return false;
		} else if (i < 0 || i > Length) {
			System.out.println("����λ�ò�����");
			return false;
		} else {
			if (i != Length) {  //i==Lengthʱ���ǲ������Ա�β��Ԫ�ز��ú��ƣ�i!=LengthʱԪ��Ҫ����
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
