public class Stack {
private Node top;

private class Node {
    student data;
    Node next;

    Node(student data) {
        this.data = data;
        this.next = null;
    }
}

// Add a deleted student to the top of the stack
public void push(student student) {
    Node newNode = new Node(student);
    newNode.next = top;
    top = newNode;
}

// Remove and return the most recently deleted student
public student pop() {
    if (top == null) {
        return null;
    }

    student student = top.data;
    top = top.next;
    return student;
}

// Display students stored in the undo stack
public void display() {
    if (top == null) {
        System.out.println("Undo stack is empty.");
        return;
    }

    Node current = top;

    System.out.println("Students available for undo:");

    while (current != null) {
        System.out.println(current.data);
        current = current.next;
    }
}
}
