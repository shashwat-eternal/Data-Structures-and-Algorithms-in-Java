class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement;
    private boolean hasPeeked;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        this.nextElement = null;
        this.hasPeeked = false;
    }

    
    public Integer peek() {
        if (!hasPeeked) {
            if (iterator.hasNext()) {
                nextElement = iterator.next();
                hasPeeked = true;
            } else {
                return null;
            }
        }
        return nextElement;
    }

    @Override
    public Integer next() {
        if (!hasPeeked) {
            return iterator.next();
        }
        Integer result = nextElement;
        hasPeeked = false;
        nextElement = null;
        return result;
    }

    @Override
    public boolean hasNext() {
        return hasPeeked || iterator.hasNext();
    }
}
