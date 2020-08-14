package collectionlistdemo;

import java.util.Scanner;

public class MyQueue implements IQueueOperations {
	
	int arr[];
	int front; 
	int rear;
	
	public MyQueue() {
		front =0 ;
		rear = 0;
		arr = new int[10];
	}


	@Override
	public void enqueue(int num) {
		if(rear < 10) {//it means ur queue is not full
			arr[rear] = num;
			rear++;
			return;
		}
		System.out.println("Queue is already full");
	}

	@Override
	public int dequeue() throws Exception {
		if(rear != 0) {//it means your  queue is not empty
			int num = arr[front];
			front ++;
			return num;
		}
		throw new Exception("Queue is empty");		
	}

	@Override
	public int size() {
		return rear-front;
	}

	@Override
	public int getFrontElement() {
		return arr[front];
	}

	@Override
	public int getRearElement() {
		return arr[rear-1];
	}
	
	public static void main(String[] args) throws Exception {
		MyQueue obj = new MyQueue();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Add element");
			System.out.println("2. Remove element");
			System.out.println("3. size of queue");
			System.out.println("4. Get front element");
			System.out.println("5. Get rear element");
			System.out.println("6. Exit");
			int num = 0;
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the number");
				 num = sc.nextInt();
				obj.enqueue(num);
				break;
			case 2:
				num = obj.dequeue();
				System.out.println("Removed element is " +num);
				break;
			case 3:
				System.out.println("Size is "+obj.size());
				break;
			case 4:
				System.out.println("Front element is: " +obj.getFrontElement());
				break;
			case 5:
				System.out.println("Rear element is: " +obj.getRearElement());
				break;
			case 6:
				break;
			default:
				break;
			}
			
		}while(choice != 6);

	}






}
