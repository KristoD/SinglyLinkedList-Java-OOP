public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {

    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if(this.head == null) {
            System.out.println("SLL is empty");
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                if(runner.next.next == null) {
                    runner.next = null;
                    break;
                }
                runner = runner.next;
            }
            runner = null;
        }
    }

    public void printValues() {
        if(this.head == null) {
            System.out.println("SLL is empt y");
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
            System.out.println(runner.value);
        }
    }

    public int find(int value) {
        if(this.head == null) {
            System.out.println("SLL is empty");
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                if(runner.value == value) {
                    return runner.value;
                }
                runner = runner.next;
            }
        }
        return 0;
    }

    public void removeAt(int value) {
        if(this.head == null) {
            System.out.println("SLL is empty");
        } else {
            System.out.println("SLL is not empty");
            Node runner = this.head;
            for(int i = 1; i < value; i++) {
                if(runner.next == null) {
                    break; 
                }
                runner = runner.next;
            }
            if(runner.next != null && runner.next.next != null) {
                if(value == 0) {
                    this.head = this.head.next;
                } else {
                    runner.next = runner.next.next;
                }
                System.out.println("removed the node");
            } else {
                runner.next = null;
            }

        }
    }
}