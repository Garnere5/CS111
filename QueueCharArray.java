/*
 * QueueCharArray.java
 * fall 2025
 * Earl Garner
 * 
 * Queue approach has first and last point
 * to first and last elements in array.
 * The variable size is used to denote
 * an empty vs. full queue
 * so I don't really understand why it's not working.// 
 */
public class QueueCharArray {

	// data
	char data[];
	int front;
	int size;
	int MAX;

	// default constructor
	public QueueCharArray() {
        MAX = 5;
        data = new char[MAX];
        size = 0; 
        front = 0;



	}

	// alternate constructor
	public QueueCharArray(int m) {
        MAX = m;
        data = new char[m];
        size = 0;
        front = 0;




	}

	// delete all items in queue
	public void clear() {
        front = 0;
        size = 0;

	}

	// add to back of queue
	public void add(char v) {
		if (size != MAX) {
			// queue is full, do nothing or throw exception
            front = (front + 1) % MAX;
            data[front] = v;
            size++;
            return;
		}
	}

	// see if queue is empty
	public boolean empty() {
       if (size == MAX) {
            return true;
        } else {
            return false;
        }
        
       
       }

	// see if queue is full
	public boolean full() {
        return front == 0;
    }

	// return element from front of queue
	public char front() {
		if (empty()){
			return data[front]; // ? denotes empty
		} else {
            return '?';
        }
	}

	// remove element from front of queue
	public boolean remove() {
		if (empty()) {
            front ++;
            size--;
            return true;
        } else {
            return empty();
        }
	}

	public int size() {
		return size;
	}

	 /**
     * use with println to display queue
     * 
     * @return set as a String
     */
    public String toString() 
	{
		return "QUEUE";
    }
}// class
