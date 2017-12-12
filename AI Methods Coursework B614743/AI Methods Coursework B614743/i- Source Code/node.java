//Node is an object that stores our data, almost exactly like an integer array.
//Node stores the amount of water in jug a, b and c in the variables a, b and c. The index of a node's parent is stored in parent.
public class node {
	public int a;
	public int b;
	public int c;
	public int parent;
	
	public node(int a, int b, int c, int parent){
		this.a = a;
		this.b = b;
		this.c = c;
		this.parent = parent;
	}
}
