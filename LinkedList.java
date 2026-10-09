public class LinkedList {

private class Node {
    student data;
    Node next;

    Node(student data) {
        this.data = data;
        this.next = null;
    }
}

private Node head;

// Add student to the end of the list
public void add(student student) {
    Node newNode = new Node(student);

    if (head == null) {
        head = newNode;
        return;
    }

    Node current = head;

    while (current.next != null) {
        current = current.next;
    }

    current.next = newNode;
}

// Display all students
public void display() {
    if (head == null) {
        System.out.println("No student records found.");
        return;
    }

    Node current = head;

    while (current != null) {
        System.out.println(current.data);
        current = current.next;
    }
}

// Check whether an ID already exists
public boolean idExists(int id) {
    Node current = head;

    while (current != null) {
        if (current.data.id == id) {
            return true;
        }
        current = current.next;
    }

    return false;
}

// Search for a student by ID
public student search(int id) {
    Node current = head;

    while (current != null) {
        if (current.data.id == id) {
            return current.data;
        }
        current = current.next;
    }

    return null;
}

// Delete a student by ID
public student delete(int id) {
    if (head == null) {
        return null;
    }

    if (head.data.id == id) {
        student deleted = head.data;
        head = head.next;
        return deleted;
    }

    Node current = head;

    while (current.next != null) {
        if (current.next.data.id == id) {
            student deleted = current.next.data;
            current.next = current.next.next;
            return deleted;
        }

        current = current.next;
    }

    return null;
}

// Sort students by GPA using Bubble Sort
public void sort() {
    if (head == null || head.next == null) {
        return;
    }

    boolean swapped;

    do {
        swapped = false;
        Node current = head;

        while (current.next != null) {
            if (current.data.gpa > current.next.data.gpa) {
                student temp = current.data;
                current.data = current.next.data;
                current.next.data = temp;
                swapped = true;
            }

            current = current.next;
        }
    } while (swapped);
}
}
