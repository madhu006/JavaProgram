package developer;


import java.util.ArrayList;
import java.util.List;

public class Nodes<T> {
	private T data;
	private List<Nodes<T>> children;
	private Nodes<T> parent;

	public Nodes(T data) {
		this.data = data;
		this.children = new ArrayList<Nodes<T>>();
	}

	public Nodes(Nodes<T> node) {
		this.data = (T) node.getData();
		children = new ArrayList<Nodes<T>>();
	}

	public void addChild(Nodes<T> child) {
		child.setParent(this);
		children.add(child);
	}

	public void addChildAt(int index, Nodes<T> child) {
		child.setParent(this);
		this.children.add(index, child);
	}

	public void setChildren(List<Nodes<T>> children) {
		for (Nodes<T> child : children)
			child.setParent(this);

		this.children = children;
	}

	public void removeChildren() {
		this.children.clear();
	}

	public Nodes<T> removeChildAt(int index) {
		return children.remove(index);
	}
	
	
	public void removeThisIfItsAChild(Nodes<T> childToBeDeleted)
	{
		List <Nodes<T>> list = getChildren();
		list.remove(childToBeDeleted);
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Nodes<T> getParent() {
		return this.parent;
	}

	public void setParent(Nodes<T> parent) {
		this.parent = parent;
	}

	public List<Nodes<T>> getChildren() {
		return this.children;
	}

	public Nodes<T> getChildAt(int index) {
		return children.get(index);
	}

	@Override
	public boolean equals(Object obj) {
		if (null == obj)
			return false;

		if (obj instanceof Nodes) {
			if (((Nodes<?>) obj).getData().equals(this.data))
				return true;
		}

		return false;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}

}