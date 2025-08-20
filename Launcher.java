import java.util.Scanner;

class NodeString {
    String data;
    NodeString next;
    NodeString(String data) {
        this.data = data;
        this.next = null;
    }
}

class NodeFloat {
    float data;
    NodeFloat next;
    NodeFloat(float data) {
        this.data = data;
        this.next = null;
    }
}

class NodeInt {
    int data;
    NodeInt next;
    NodeInt(int data) {
        this.data = data;
        this.next = null;
    }
}

class DoubleNodeString {
    String data;
    DoubleNodeString next;
    DoubleNodeString prev;
    DoubleNodeString(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class CircularNodeString {
    String data;
    CircularNodeString next;
    CircularNodeString(String data) {
        this.data = data;
        this.next = this; // al inicio se apunta a sí mismo
    }
}

class CircularNodeFloat {
    float data;
    CircularNodeFloat next;
    CircularNodeFloat(float data) {
        this.data = data;
        this.next = this;
    }
}

class CircularNodeInt {
    int data;
    CircularNodeInt next;
    CircularNodeInt(int data) {
        this.data = data;
        this.next = this;
    }
}

class SimplyLinkedListString {
    NodeString head;

    public void insertString_at_last_P(String data) {
        NodeString newdata = new NodeString(data);
        if (head == null) {
            head = newdata;
        } else {
            NodeString actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = newdata;
        }
    }

    public void showList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        NodeString actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }

    public void removeString(String data) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            System.out.println("Removed: " + data);
            return;
        }

        NodeString actual = head;
        while (actual.next != null && !actual.next.data.equals(data)) {
            actual = actual.next;
        }

        if (actual.next == null) {
            System.out.println("Value not found: " + data);
        } else {
            actual.next = actual.next.next;
            System.out.println("Removed: " + data);
        }
    }
}

class SimplyLinkedListFloat {
    NodeFloat head;

    public void insertFloat_at_last_P(float data) {
        NodeFloat newdata = new NodeFloat(data);
        if (head == null) {
            head = newdata;
        } else {
            NodeFloat actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = newdata;
        }
    }

    public void showList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        NodeFloat actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }

    public void removeFloat(float data) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (Float.compare(head.data, data) == 0) {
            head = head.next;
            System.out.println("Removed: " + data);
            return;
        }

        NodeFloat actual = head;
        while (actual.next != null && Float.compare(actual.next.data, data) != 0) {
            actual = actual.next;
        }

        if (actual.next == null) {
            System.out.println("Value not found: " + data);
        } else {
            actual.next = actual.next.next;
            System.out.println("Removed: " + data);
        }
    }
}

class SimplyLinkedListInt {
    NodeInt head;

    public void insertInt_at_last_P(int data) {
        NodeInt newdata = new NodeInt(data);
        if (head == null) {
            head = newdata;
        } else {
            NodeInt actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = newdata;
        }
    }

    public void showList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        NodeInt actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");
    }

    public void removeInt(int data) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Removed: " + data);
            return;
        }

        NodeInt actual = head;
        while (actual.next != null && actual.next.data != data) {
            actual = actual.next;
        }

        if (actual.next == null) {
            System.out.println("Value not found: " + data);
        } else {
            actual.next = actual.next.next;
            System.out.println("Removed: " + data);
        }
    }
}
class DoublyLinkedListString {
    DoubleNodeString head;

    public void insertAtEnd(String data) {
        DoubleNodeString newNode = new DoubleNodeString(data);
        if (head == null) {
            head = newNode;
        } else {
            DoubleNodeString actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = newNode;
            newNode.prev = actual;
        }
    }

    public void showList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        DoubleNodeString actual = head;
        while (actual != null) {
            System.out.print(actual.data + " <-> ");
            actual = actual.next;
        }
        System.out.println("null");
    }

    public void remove(String data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        DoubleNodeString actual = head;
        while (actual != null && !actual.data.equals(data)) {
            actual = actual.next;
        }

        if (actual != null) {
            if (actual.next != null) actual.next.prev = actual.prev;
            if (actual.prev != null) actual.prev.next = actual.next;
        }
    }
}

// Nodo Doble Float
class NodeDoublyFloat {
    float data;
    NodeDoublyFloat prev, next;
    NodeDoublyFloat(float data) { this.data = data; }
}

// Lista Doble Float
class DoublyLinkedListFloat {
    NodeDoublyFloat head;
    public void insert(float data) {
        NodeDoublyFloat newNode = new NodeDoublyFloat(data);
        if (head == null) head = newNode;
        else {
            NodeDoublyFloat actual = head;
            while (actual.next != null) actual = actual.next;
            actual.next = newNode;
            newNode.prev = actual;
        }
    }
    public void remove(float data) {
        if (head == null) { System.out.println("The list is empty."); return; }
        NodeDoublyFloat actual = head;
        while (actual != null && actual.data != data) actual = actual.next;
        if (actual == null) { System.out.println("Value not found: " + data); return; }
        if (actual.prev != null) actual.prev.next = actual.next; else head = actual.next;
        if (actual.next != null) actual.next.prev = actual.prev;
        System.out.println("Removed: " + data);
    }
    public void showList() {
        if (head == null) { System.out.println("The list is empty."); return; }
        NodeDoublyFloat actual = head;
        while (actual != null) { System.out.print(actual.data + " <-> "); actual = actual.next; }
        System.out.println("null");
    }
}


// Nodo Doble Int
class NodeDoublyInt {
    int data;
    NodeDoublyInt prev, next;
    NodeDoublyInt(int data) { this.data = data; }
}

// Lista Doble Int
class DoublyLinkedListInt {
    NodeDoublyInt head;
    public void insert(int data) {
        NodeDoublyInt newNode = new NodeDoublyInt(data);
        if (head == null) head = newNode;
        else {
            NodeDoublyInt actual = head;
            while (actual.next != null) actual = actual.next;
            actual.next = newNode;
            newNode.prev = actual;
        }
    }
    public void remove(int data) {
        if (head == null) { System.out.println("The list is empty."); return; }
        NodeDoublyInt actual = head;
        while (actual != null && actual.data != data) actual = actual.next;
        if (actual == null) { System.out.println("Value not found: " + data); return; }
        if (actual.prev != null) actual.prev.next = actual.next; else head = actual.next;
        if (actual.next != null) actual.next.prev = actual.prev;
        System.out.println("Removed: " + data);
    }
    public void showList() {
        if (head == null) { System.out.println("The list is empty."); return; }
        NodeDoublyInt actual = head;
        while (actual != null) { System.out.print(actual.data + " <-> "); actual = actual.next; }
        System.out.println("null");
    }
}

class CircularLinkedListString {
    CircularNodeString head;

    public void insertAtEnd(String data) {
        CircularNodeString newNode = new CircularNodeString(data);
        if (head == null) {
            head = newNode;
        } else {
            CircularNodeString actual = head;
            while (actual.next != head) {
                actual = actual.next;
            }
            actual.next = newNode;
            newNode.next = head;
        }
    }

    public void showList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        CircularNodeString actual = head;
        do {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        } while (actual != head);
        System.out.println("(back to head)");
    }

    public void remove(String data) {
        if (head == null) return;

        if (head.data.equals(data) && head.next == head) {
            head = null; // único nodo
            return;
        }

        CircularNodeString actual = head;
        CircularNodeString prev = null;

        do {
            if (actual.data.equals(data)) {
                if (prev != null) {
                    prev.next = actual.next;
                } else { // si es head
                    CircularNodeString last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = actual;
            actual = actual.next;
        } while (actual != head);
    }
}

class NodeCircularFloat {
    float data;
    NodeCircularFloat next;
    NodeCircularFloat(float data) { this.data = data; }
}
class CircularLinkedListFloat {
    NodeCircularFloat head = null, tail = null;
    public void insert(float data) {
        NodeCircularFloat newNode = new NodeCircularFloat(data);
        if (head == null) { head = tail = newNode; newNode.next = head; }
        else { tail.next = newNode; tail = newNode; tail.next = head; }
    }
    public void remove(float data) {
        if (head == null) { System.out.println("The list is empty."); return; }
        NodeCircularFloat current = head, prev = tail;
        do {
            if (current.data == data) {
                if (current == head) head = head.next;
                if (current == tail) tail = prev;
                prev.next = current.next;
                if (head == tail && head.data == data) { head = tail = null; }
                System.out.println("Removed: " + data);
                return;
            }
            prev = current; current = current.next;
        } while (current != head);
        System.out.println("Value not found: " + data);
    }
    public void showList() {
        if (head == null) { System.out.println("The list is empty."); return; }
        NodeCircularFloat actual = head;
        do { System.out.print(actual.data + " -> "); actual = actual.next; }
        while (actual != head);
        System.out.println("(back to head)");
    }
}

class NodeCircularInt {
    int data;
    NodeCircularInt next;
    NodeCircularInt(int data) { this.data = data; }
}
class CircularLinkedListInt {
    NodeCircularInt head = null, tail = null;
    public void insert(int data) {
        NodeCircularInt newNode = new NodeCircularInt(data);
        if (head == null) { head = tail = newNode; newNode.next = head; }
        else { tail.next = newNode; tail = newNode; tail.next = head; }
    }
    public void remove(int data) {
        if (head == null) { System.out.println("The list is empty."); return; }
        NodeCircularInt current = head, prev = tail;
        do {
            if (current.data == data) {
                if (current == head) head = head.next;
                if (current == tail) tail = prev;
                prev.next = current.next;
                if (head == tail && head.data == data) { head = tail = null; }
                System.out.println("Removed: " + data);
                return;
            }
            prev = current; current = current.next;
        } while (current != head);
        System.out.println("Value not found: " + data);
    }
    public void showList() {
        if (head == null) { System.out.println("The list is empty."); return; }
        NodeCircularInt actual = head;
        do { System.out.print(actual.data + " -> "); actual = actual.next; }
        while (actual != head);
        System.out.println("(back to head)");
    }
}


public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condition = true;

        SimplyLinkedListString list = new SimplyLinkedListString();
        SimplyLinkedListFloat floatList = new SimplyLinkedListFloat();
        SimplyLinkedListInt intList = new SimplyLinkedListInt();

        DoublyLinkedListString doubleListString = new DoublyLinkedListString();
        DoublyLinkedListFloat doubleListFloat = new DoublyLinkedListFloat();
        DoublyLinkedListInt doubleListInt = new DoublyLinkedListInt();

        
        CircularLinkedListString circularListString = new CircularLinkedListString();
        CircularLinkedListFloat circularListFloat = new CircularLinkedListFloat();
        CircularLinkedListInt circularListInt = new CircularLinkedListInt();

        while (condition) {
            System.out.println("\n==== MAIN MENU ====");
            System.out.println("1. Singly linked list");
            System.out.println("2. Doubly linked list");
            System.out.println("3. Circular linked list");
            System.out.println("4. Exit");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("What type of value are you going to use? \n1.String\n2.Float\n3.Int");
                    int option2 = sc.nextInt();
                    sc.nextLine();

                    switch (option2) {
                        case 1:
                            boolean backToMenu = false;
                            while (!backToMenu) {
                                System.out.println("\n--- String Singly List Menu ---");
                                System.out.println("1. Insert");
                                System.out.println("2. Remove");
                                System.out.println("3. Display List");
                                System.out.println("4. Return");
                                int action = sc.nextInt();
                                sc.nextLine();

                                switch (action) {
                                    case 1:
                                        System.out.print("Enter the String to insert: ");
                                        String value = sc.nextLine();
                                        list.insertString_at_last_P(value);
                                        list.showList();
                                        break;
                                    case 2:
                                        System.out.print("Enter the String to remove: ");
                                        String toRemove = sc.nextLine();
                                        list.removeString(toRemove);
                                        list.showList();
                                        break;
                                    case 3:
                                        list.showList();
                                        break;
                                    case 4:
                                        backToMenu = true;
                                        break;
                                }
                            }
                            break;

                        case 2:
                            boolean backFloat = false;
                            while (!backFloat) {
                                System.out.println("\n--- Float Singly List Menu ---");
                                System.out.println("1. Insert");
                                System.out.println("2. Remove");
                                System.out.println("3. Display List");
                                System.out.println("4. Return");
                                int action = sc.nextInt();

                                switch (action) {
                                    case 1:
                                        System.out.print("Enter the Float to insert: ");
                                        float fvalue = sc.nextFloat();
                                        floatList.insertFloat_at_last_P(fvalue);
                                        floatList.showList();
                                        break;
                                    case 2:
                                        System.out.print("Enter the Float to remove: ");
                                        float frem = sc.nextFloat();
                                        floatList.removeFloat(frem);
                                        floatList.showList();
                                        break;
                                    case 3:
                                        floatList.showList();
                                        break;
                                    case 4:
                                        backFloat = true;
                                        break;
                                }
                            }
                            break;

                        case 3:
                            boolean backInt = false;
                            while (!backInt) {
                                System.out.println("\n--- Int Singly List Menu ---");
                                System.out.println("1. Insert");
                                System.out.println("2. Remove");
                                System.out.println("3. Display List");
                                System.out.println("4. Return");
                                int action = sc.nextInt();

                                switch (action) {
                                    case 1:
                                        System.out.print("Enter the Int to insert: ");
                                        int ivalue = sc.nextInt();
                                        intList.insertInt_at_last_P(ivalue);
                                        intList.showList();
                                        break;
                                    case 2:
                                        System.out.print("Enter the Int to remove: ");
                                        int irem = sc.nextInt();
                                        intList.removeInt(irem);
                                        intList.showList();
                                        break;
                                    case 3:
                                        intList.showList();
                                        break;
                                    case 4:
                                        backInt = true;
                                        break;
                                }
                            }
                            break;
                    }
                    break;


case 2: // Doubly linked list
    System.out.println("What type of value are you going to use? \n1.String\n2.Float\n3.Int");
    int doublyOption = sc.nextInt();
    sc.nextLine();

    switch (doublyOption) {
        case 1: // String
            boolean backDoublyString = false;
            while (!backDoublyString) {
                System.out.println("\n--- Doubly Linked String List Menu ---");
                System.out.println("1. Insert");
                System.out.println("2. Remove");
                System.out.println("3. Display List");
                System.out.println("4. Return");
                int action = sc.nextInt();
                sc.nextLine();

                switch (action) {
                    case 1:
                        System.out.print("Enter the String to insert: ");
                        String value = sc.nextLine();
                        doubleListString.insertAtEnd(value);
                        doubleListString.showList();
                        break;
                    case 2:
                        System.out.print("Enter the String to remove: ");
                        String toRemove = sc.nextLine();
                        doubleListString.remove(toRemove);
                        doubleListString.showList();
                        break;
                    case 3:
                        doubleListString.showList();
                        break;
                    case 4:
                        backDoublyString = true;
                        break;
                }
            }
            break;
            
        case 2: // Float
            boolean backDoublyFloat = false;
            while (!backDoublyFloat) {
                System.out.println("\n--- Doubly Linked Float List Menu ---");
                System.out.println("1. Insert");
                System.out.println("2. Remove");
                System.out.println("3. Display List");
                System.out.println("4. Return");
                int action = sc.nextInt();

                switch (action) {
                    case 1:
                        System.out.print("Enter the Float to insert: ");
                        float fvalue = sc.nextFloat();
                        doubleListFloat.insert(fvalue);
                        doubleListFloat.showList();
                        break;
                    case 2:
                        System.out.print("Enter the Float to remove: ");
                        float frem = sc.nextFloat();
                        doubleListFloat.remove(frem);
                        doubleListFloat.showList();
                        break;
                    case 3:
                        doubleListFloat.showList();
                        break;
                    case 4:
                        backDoublyFloat = true;
                        break;
                }
            }
            break;
            
        case 3: // Int
            boolean backDoublyInt = false;
            while (!backDoublyInt) {
                System.out.println("\n--- Doubly Linked Int List Menu ---");
                System.out.println("1. Insert");
                System.out.println("2. Remove");
                System.out.println("3. Display List");
                System.out.println("4. Return");
                int action = sc.nextInt();

                switch (action) {
                    case 1:
                        System.out.print("Enter the Int to insert: ");
                        int ivalue = sc.nextInt();
                        doubleListInt.insert(ivalue);
                        doubleListInt.showList();
                        break;
                    case 2:
                        System.out.print("Enter the Int to remove: ");
                        int irem = sc.nextInt();
                        doubleListInt.remove(irem);
                        doubleListInt.showList();
                        break;
                    case 3:
                        doubleListInt.showList();
                        break;
                    case 4:
                        backDoublyInt = true;
                        break;
                }
            }
            break;
    }
    break;

case 3: // Circular linked list
    System.out.println("What type of value are you going to use? \n1.String\n2.Float\n3.Int");
    int circularOption = sc.nextInt();
    sc.nextLine();

    switch (circularOption) {
        case 1: // String
            boolean backCircularString = false;
            while (!backCircularString) {
                System.out.println("\n--- Circular Linked String List Menu ---");
                System.out.println("1. Insert");
                System.out.println("2. Remove");
                System.out.println("3. Display List");
                System.out.println("4. Return");
                int action = sc.nextInt();
                sc.nextLine();

                switch (action) {
                    case 1:
                        System.out.print("Enter the String to insert: ");
                        String value = sc.nextLine();
                        circularListString.insertAtEnd(value);
                        circularListString.showList();
                        break;
                    case 2:
                        System.out.print("Enter the String to remove: ");
                        String toRemove = sc.nextLine();
                        circularListString.remove(toRemove);
                        circularListString.showList();
                        break;
                    case 3:
                        circularListString.showList();
                        break;
                    case 4:
                        backCircularString = true;
                        break;
                }
            }
            break;
            
        case 2: // Float
            boolean backCircularFloat = false;
            while (!backCircularFloat) {
                System.out.println("\n--- Circular Linked Float List Menu ---");
                System.out.println("1. Insert");
                System.out.println("2. Remove");
                System.out.println("3. Display List");
                System.out.println("4. Return");
                int action = sc.nextInt();

                switch (action) {
                    case 1:
                        System.out.print("Enter the Float to insert: ");
                        float fvalue = sc.nextFloat();
                        circularListFloat.insert(fvalue);
                        circularListFloat.showList();
                        break;
                    case 2:
                        System.out.print("Enter the Float to remove: ");
                        float frem = sc.nextFloat();
                        circularListFloat.remove(frem);
                        circularListFloat.showList();
                        break;
                    case 3:
                        circularListFloat.showList();
                        break;
                    case 4:
                        backCircularFloat = true;
                        break;
                }
            }
            break;
            
        case 3: // Int
            boolean backCircularInt = false;
            while (!backCircularInt) {
                System.out.println("\n--- Circular Linked Int List Menu ---");
                System.out.println("1. Insert");
                System.out.println("2. Remove");
                System.out.println("3. Display List");
                System.out.println("4. Return");
                int action = sc.nextInt();

                switch (action) {
                    case 1:
                        System.out.print("Enter the Int to insert: ");
                        int ivalue = sc.nextInt();
                        circularListInt.insert(ivalue);
                        circularListInt.showList();
                        break;
                    case 2:
                        System.out.print("Enter the Int to remove: ");
                        int irem = sc.nextInt();
                        circularListInt.remove(irem);
                        circularListInt.showList();
                        break;
                    case 3:
                        circularListInt.showList();
                        break;
                    case 4:
                        backCircularInt = true;
                        break;
                }
            }
            break;
    }
    break;
                case 4: 
                    condition = false;
                    System.out.println("Exiting program...");
                    break;
            }
        }
        sc.close();
    }
}