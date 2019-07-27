interface Iterator {
    //数え上げの機能をAggregate(集合)に持たせないのがミソ
    abstract boolean hasNext();
    abstract Object next();
}