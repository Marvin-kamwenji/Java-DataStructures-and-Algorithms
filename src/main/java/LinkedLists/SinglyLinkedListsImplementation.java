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

    /*================================================================*/
    /*=============DISPLAYING ELEMENTS IN A LINKED LIST===============*/
    /*================================================================*/

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

    /*=============================================================*/
    /*=================FINDING LENGTH OF LINKED LIST===============*/
    /*=============================================================*/

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

    /*===============================================================*/
    /*==========INSERTING ELEMENTS IN A SINGLY LINKED LIST===========*/
    /*===============================================================*/

    //This method inserts elements at the beginning of the linked list
    public void insertAtTheBeginning(int value){
        LinkNode newNode = new LinkNode(value);
        newNode.next = head;
        head = newNode;
    }

    //This method inserts elements at the end of the linked list
    public void insertAtTheEnd(int value){
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

    //This method inserts elements at any given position of the linked list
    public void insertAtAnyPoint(int position, int value){
        LinkNode node = new LinkNode(value);

        if (position == 1){
            node.next = head;
            head = node;
        }
        else {
            LinkNode previous = head;
            int count = 1;

            while(count < position - 1){
                previous = previous.next;
                count ++;
            }

            LinkNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }


 /*========================================================================*/
 /*==============DELETING ELEMENTS FROM A SINGLY LINKED LIST===============*/
 /*========================================================================*/

 //Deleting first node of a singly linked list

    public LinkNode deleteFirstNodeElement(){
        if(head == null){
            return null;
        }

        LinkNode temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    //Deleting last node of a singly linked list

    public LinkNode deleteLastNodeElement(){
        if (head == null || head.next == null){
            return head;
        }

        //Create two pointers
        LinkNode current = head;
        LinkNode previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next =null;
        return  current;
    }

    //Deleting a node at any given position

    public void deleteAtAnyPoint(int position){
        if(position == 1){
            head = head.next;
        }
        else{
            LinkNode previous = head;
            int count = 0;
            while (count < position - 1){
                previous = previous.next;
                count++;
            }

            LinkNode current = previous.next;
            previous.next = current.next;

        }
    }


/*===================================================================*/
/*================SEARCHING THROUGH A LINKED LIST====================*/
/*===================================================================*/

public boolean findNode(LinkNode head, int searchKey){
    if(head == null){
        return false;
    }
    LinkNode current = head;
    while(current != null) {
        if(current.data == searchKey){
            return true;
        }
        current = current.next;
    }
    return  false;

}

/*===================================================================*/
/*============================MAIN METHOD============================*/
/*===================================================================*/

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


  /*============================================================*/
  /*================CALLING INSERTING METHODS===================*/
  /*============================================================*/

        //Calling the insertAtTheBeginning method
        //Inserting values at the beginning of the list
        node.insertAtTheBeginning(10);
        node.insertAtTheBeginning(12);


        //Calling the insertAtTheEnd method
        //Inserting values at the end of the list
        node.insertAtTheEnd(4);
        node.insertAtTheEnd(98);


        //Calling the insertAtAnyPoint method
        //Inserting values at any given position

        node.insertAtAnyPoint(3, 14);
        node.insertAtAnyPoint(1, 10);



 /*==============================================================*/
 /*==================CALLING DELETING METHODS====================*/
 /*==============================================================*/

        //Deleting the first node in singly linked list
        System.out.println(node.deleteFirstNodeElement().data);

        //Deleting the last node in singly linked list
        System.out.println(node.deleteLastNodeElement().data);

        //Deleting a node from a singly linked list from any point

        node.deleteAtAnyPoint(3);


 /*===================================================================*/
 /*===================CALLING THE SEARCH METHOD=======================*/
 /*===================================================================*/

        if(node.findNode(node.head, 10)){
            System.out.println("Element has been found");
        }
        else {
            System.out.println("Element not found");
        }

 /*==============================================================*/
 /*===================CALLING DISPLAY METHOD=====================*/
 /*==============================================================*/

        //Calling the display Method
        //It displays the elements in the linked list
        node.display();

 /*================================================================*/
 /*=============SHOW LENGTH OF LINKED LIST METHOD==================*/
 /*================================================================*/
        //Print the length of the list
        //Calling the lengthOfListMethod
        System.out.println("\n The length of the list is: " + node.lengthOfList());

    }
}
