package YangHuiSanJiao;

public class IntQueue {
	IntNode front;
	IntNode rear;
	public IntQueue(){
		this.front= new IntNode();
		this.rear= this.front;
		this.front.next=null;
	}
	public boolean QueueEmpty() {
		return front==rear;
	}

	public IntNode GetFront() {
		if(QueueEmpty()){
			return null;
		}else{
			return front.next;
		}
	}
	public boolean EnQueue(IntNode e) {
		e.next=rear.next;
		rear.next=e;
		rear=e;
		return true;
	}
	public boolean OutQueue() {
		if(QueueEmpty()){
			return false;
		}else{
			front.next=front.next.next;
			if(front.next==null){
				rear=front;
			}
			return true;
		}		
	}
}
