import javax.swing.JOptionPane;

public class LinkedListFunc {
	
	private node head;

	public void add(node newNode){
		
		if(isEmpty()){
			head = new node();
			head = newNode;
		}
		
		else{
			node tail = head;
			
			while(tail.next != null)
				tail = tail.next;
			
			tail.next = newNode;
			
			
		}
	}
	
	public void remove(int id){
		
		if(head.idNumber == id){
			head = head.next;
			JOptionPane.showMessageDialog(null, "Removed.");
		}
		else{
			node newNode = head;
			while(newNode.next != null){
				
				if(newNode.next.idNumber == id){
					node tempNode = newNode.next;
					newNode.next = tempNode.next;
					JOptionPane.showMessageDialog(null, "Removed.");
					
				}
				newNode = newNode.next;
			}
		}
		
		
		
	}
	
	public boolean search (int idNumber){
		
		node newNode = new node();
		newNode = head;
		
		while(newNode != null){
			if(idNumber == newNode.idNumber)
				return true;
			
			newNode = newNode.next;
		}
		
		return false;
		
	}
	
	public void print(){
		
		node newNode = head;
		if(isEmpty())
			System.out.println("List is Empty");
		
		else{
			newNode = head;
			
			while(newNode != null){
				
				JOptionPane.showMessageDialog(null, "User Name: " + newNode.name + "\n ID number: " + newNode.idNumber + "\n");
				newNode = newNode.next;
			}
			
		}
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;

	} // end of isEmpty

}


