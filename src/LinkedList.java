import javax.swing.JOptionPane;

public class LinkedList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedListFunc access = new LinkedListFunc();

			while(true){
				
				String menu = JOptionPane.showInputDialog("Welcome to my linked List!\n\n"
															+"\t\tPlease make Selection: \n"
															+ "\t\tPress 1 - Add.\n"
															+ "\t\tPress 2 - Display.\n"
															+ "\t\tPress 3 - Search.\n"
															+ "\t\tPress 4 - Remove.\n"
															+ "\t\tPress 9 - Exit.\n");
				
				switch(menu){
					case"1":
						node newNode = new node();
						String name = JOptionPane.showInputDialog("Enter Name: ");
						int number = Integer.parseInt(JOptionPane.showInputDialog("Enter ID Number: "));
						
						
						newNode.name = name;
						newNode.idNumber = number;
						
						access.add(newNode);
						JOptionPane.showMessageDialog(null, "User Added.");
						break;
						
					case "2":
						access.print();
						break;
						
					case "3":
						boolean Success;
						int NumToFind = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to Search: "));
						Success = access.search(NumToFind);
						
						if(!Success)
							JOptionPane.showMessageDialog(null, "Id Number not found.");
						else
							JOptionPane.showMessageDialog(null, "Id Number found in list.\n");
						
						break;
						
					case "4":
						int id;
						id  = Integer.parseInt(JOptionPane.showInputDialog("Enter Id to be remove: "));
						JOptionPane.showConfirmDialog(null, "Are you sure you want to do this?.");
						if(true)
							access.remove(id);
						
						break;
						
					case "9":
						System.exit(0);
						
					default:
						JOptionPane.showMessageDialog(null, "Invalid Input");
						break;
						
				}
					
					
				}

		
	}
}

	

