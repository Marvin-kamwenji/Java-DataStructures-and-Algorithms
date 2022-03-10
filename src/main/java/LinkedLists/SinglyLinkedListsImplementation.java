package LinkedLists;


public class SinglyLinkedListsImplementation {
    //Linked list always start from head
    //Initialize a head

    private LinkNode head;

    // A static class that represents the link nodes
    // Will contain data of type integer
    // every node will be linked to a next node
    // example:
    // head --> 1 --> 2 --> 3 --> 4 --> null

    public static class LinkNode{
        private final int data;
        private LinkNode next;

        public LinkNode(int data){
            this.data = data;
            this.next = null;
        }

    }

    // Create a display Method that will display all the linked nodes

    public void display(){

        //We start from the head element
        //We set it to current

        LinkNode current = head;

        while(current != null){
            // print current element
            System.out.print(current.data + "--->");
            // Move current pointer to the next node
            current = current.next;
        }

          System.out.print("null");
    }



    //A method that returns the length of the list
    public int lengthOfList(){
        LinkNode current = head;
        if (head == null){
            return 0;
        }

        int count = 0;
        while(current != null){
            count ++;
            current = current.next;
        }
    return count;
    }

    //This method inserts elements at the beginning of the linked list
    public void insertAtTheBeginning(int value){
        LinkNode newNode = new LinkNode(value);
        newNode.next = head;
        head = newNode;
    }

    //This method inserts elements at the end of the linked list
    public void inserAtTheEnd(int value){
        LinkNode newNode = new LinkNode(value);
        if(head == null){
            head = newNode;
        }
        LinkNode current = head;
        while(null != current.next){
          current = current.next;
        }
        current.next = newNode;
    }

    //The main method
    public static void main(String [] args) {

       // Giving our head element data
       SinglyLinkedListsImplementation node = new SinglyLinkedListsImplementation();
        node.head = new LinkNode(10);

        //Giving the rest of our nodes data
        LinkNode second = new LinkNode(2);
        LinkNode third = new LinkNode(67);
        LinkNode fourth = new LinkNode(80);

        //Now we connect them together to form a chain
        node.head.next = second; // 10 --> 2
        second.next = third;  // 2 --> 67
        third.next = fourth;  // 67 --> 80



        //Calling the insertAtTheBeginning method
        //Inserting values at the beginning of the list
        node.insertAtTheBeginning(10);
        node.insertAtTheBeginning(12);


        //Calling the insertAtTheEnd method
        //Inserting values at the end of the list
        node.inserAtTheEnd(4);
        node.inserAtTheEnd(98);


        //Calling the display Method
        //It displays the elements in the linked list
        node.display();

        //Print the length of the list
        //Calling the lengthOfListMethod
        System.out.println("\n The length of the list is: " + node.lengthOfList());

    }
}
