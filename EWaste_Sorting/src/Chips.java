public class Chips<Tech> implements Sorter<Tech>{
    private Tech[] chips;
    private int size;
    public Chips(){
        chips = (Tech[]) new Object[8];
        size = 0;
    }
    @Override
    public void addLast(Tech metal){
        if(size == chips.length){
            upSize(size * 2);
        }
        chips[size] = metal;
        size++;
    }
    private void upSize(int capacity){
        Tech[] temp = (Tech[]) new Object[capacity];
        System.arraycopy(chips, 0, temp, 0, size);
        chips = temp;
    }
    @Override
    public int size(){
        return size;
    }
}
