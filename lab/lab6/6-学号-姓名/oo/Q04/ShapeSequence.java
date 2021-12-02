public class ShapeSequence {
    private Shape[] shapes;
    private int Count=0;
    private int Size;
    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    ShapeSequence(int size){
        if(size<0)size=0;
        Shape [] shapes = new Shape[size];
        Size=size;
        this.setShapes(shapes);
    }

    public void add(Shape shape){
        if(Count<Size){
            this.getShapes()[this.getCount()]=shape;
            this.setCount(this.getCount()+1);
        }
    }

    public String toString(){
        StringBuilder tempString= new StringBuilder("[");
        SequenceIterator tempIterator=this.iterator();
        while(!tempIterator.isEnd()){
            tempString.append(tempIterator.current().name);
            if(tempIterator.getIndex()+1< this.getCount()) tempString.append(", ");
            tempIterator.moveNext();
        }
        tempString.append("]");
        tempIterator.setIndex(0);
        return tempString.toString();
    }

    private class SequenceIterator implements MyIterator{
        private ShapeSequence current = ShapeSequence.this;
        private int index=0;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public ShapeSequence getCurrent() {
            return current;
        }

        public boolean isEnd(){
            return getIndex()==getCount();
        }
        public Shape current(){
            if(!isEnd()) {
                return getShapes()[getIndex()];
            }
            else return null;
        }
        public void moveNext(){
            if(!isEnd()){
                setIndex(getIndex()+1);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof SequenceIterator &&
                    ((SequenceIterator) o).getCurrent() == ShapeSequence.this &&
                    ((SequenceIterator) o).getIndex() == getIndex()) {
                return true;
            }
            return false;
        }
    }
    public SequenceIterator iterator() {return new SequenceIterator();}
}
