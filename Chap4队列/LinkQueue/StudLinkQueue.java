package LinkQueue;

public class StudLinkQueue implements ILinkQueueMethod{
	StudNode front = null;
	StudNode rear = null;
	
	public StudLinkQueue() {
		super();
		this.front =  new StudNode();
		this.rear = this.front;
	}
	@Override
	public boolean EmptyQueue() {		
		return this.rear == this.front;
	}
	@Override
	public StudNode GetTop() {
		
		return this.front.next;
	}
	@Override
	public boolean EnQuery(StudNode s) {
		this.rear.next = s ;
		this.rear = s;
		return true;
	}
	@Override
	public boolean OutQuery() {
		if(EmptyQueue()){
			return false ;
		}else{
			this.front.next = this.front.next.next;
			if(this.front.next == null){
				this.rear = this.front;				
			}
			return true;
		}
	}
	
	

}
