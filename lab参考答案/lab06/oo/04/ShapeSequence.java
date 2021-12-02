public class ShapeSequence {
	private Shape[] shapes;
	//构造方法
	//size用于指定shapes的最大长度，如果size是负数，那么按照0来处理
	//构造方法中应当对shapes进行初始化赋值，在其他过程中shapes的大小不应该被改变
	ShapeSequence(int size){
		if(size<0)
			shapes=new Shape[0];
		else shapes=new Shape[size];
	}
	//向shapes中添加一个新的元素
	//当shapes被填满时，什么都不做
	public void add(Shape shape) {
		int len=shapes.length;
		int i=0;
		for(i=0;i<len;i++) {
			if(shapes[i]==null)
				break;
		}
		if(i<=len-1) {
			shapes[i]=shape;
		}
	}
	//返回这个容器的字符串表达，格式为[Type, Type,...]
	//格式中的Type是形状类型的全小写英文单词，比如rectangle、ellipse
	public String toString() {
		String s="[";
		int len=shapes.length;
		int i=0;
		for(i=0;i<len;i++) {
			if(shapes[i]==null)
				break;
			else if(i<len-1&&shapes[i+1]==null) {
				s=s+getType(shapes[i])+"]";
			}
			else if(i==len-1) break;
			else s=s+getType(shapes[i])+",";
		}
		if(i==len-1)
			s=s+getType(shapes[i])+"]";
		if(len==0)
			s+="]";
		return s;
	}
	public static String getType(Object o){
		if(o instanceof Rectangle)
			return "rectangle";
		if(o instanceof Rhombus)
			return "rhombus";
		if(o instanceof Ellipse)
			return "ellipse";
		else return null;
	}
	public SequenceIterator iterator() {
		return new SequenceIterator();
	}
	//内部类，它用于序列遍历的迭代器
	class SequenceIterator{
		int iter;
		//默认构造方法，在被构造时，迭代器指向的位置代表数组下标0
		SequenceIterator(){
			iter=0;
		}
		//迭代器完成遍历时，返回true
		//完成遍历不代表迭代器指向了最后一个元素，而是指向了最后一个元素的下一个位置
		public boolean isEnd() {
			int len=shapes.length;
			int i=0;
			for(i=0;i<len;i++) {
				if(shapes[i]==null)
					break;
			}
			int mymin=i<len?i:len;
			if(iter==mymin)
				return true;
			return false;
		}
		//返回当前迭代器指向位置的Shape对象
		//isEnd()是true时，访问current是非法操作
		public Shape current() {
			if(isEnd()) return null;
			return shapes[iter];
		}
		//使迭代器移动到下一个元素的位置
		//isEnd()是true时，什么都不做
		public void moveNext() {
			if(!isEnd()) {
				iter++;
			}
		}
		public ShapeSequence outer(){
			return ShapeSequence.this;
		}

		//当o是SequenceItetator类型的、且o和this的外部类对象相同、且o和this的位置相同时，返回true
		public boolean equals(Object o) {
			if(o instanceof SequenceIterator) {
				if(((SequenceIterator) o).outer()==this.outer()&&
						((SequenceIterator) o).iter==this.iter)
					return true;
				//return true;
			}
			return false;
		}
	}
	
}
