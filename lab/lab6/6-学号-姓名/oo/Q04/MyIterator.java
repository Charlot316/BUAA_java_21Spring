public interface MyIterator {
    public int getIndex();
    public void setIndex(int index);
    public ShapeSequence getCurrent();
    public boolean isEnd();
    public Shape current();
    public void moveNext();
    public boolean equals(Object o);
}
