public class ShapeSequence {
	private Shape[] shapes;
	//���췽��
	//size����ָ��shapes����󳤶ȣ����size�Ǹ�������ô����0������
	//���췽����Ӧ����shapes���г�ʼ����ֵ��������������shapes�Ĵ�С��Ӧ�ñ��ı�
	ShapeSequence(int size){
		if(size<0)
			shapes=new Shape[0];
		else shapes=new Shape[size];
	}
	//��shapes�����һ���µ�Ԫ��
	//��shapes������ʱ��ʲô������
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
	//��������������ַ�������ʽΪ[Type, Type,...]
	//��ʽ�е�Type����״���͵�ȫСдӢ�ĵ��ʣ�����rectangle��ellipse
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
	//�ڲ��࣬���������б����ĵ�����
	class SequenceIterator{
		int iter;
		//Ĭ�Ϲ��췽�����ڱ�����ʱ��������ָ���λ�ô��������±�0
		SequenceIterator(){
			iter=0;
		}
		//��������ɱ���ʱ������true
		//��ɱ��������������ָ�������һ��Ԫ�أ�����ָ�������һ��Ԫ�ص���һ��λ��
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
		//���ص�ǰ������ָ��λ�õ�Shape����
		//isEnd()��trueʱ������current�ǷǷ�����
		public Shape current() {
			if(isEnd()) return null;
			return shapes[iter];
		}
		//ʹ�������ƶ�����һ��Ԫ�ص�λ��
		//isEnd()��trueʱ��ʲô������
		public void moveNext() {
			if(!isEnd()) {
				iter++;
			}
		}
		public ShapeSequence outer(){
			return ShapeSequence.this;
		}

		//��o��SequenceItetator���͵ġ���o��this���ⲿ�������ͬ����o��this��λ����ͬʱ������true
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
