public class MetalSorter<Tech> implements Sorter<Tech>{
    private Tech[] metals;
    private int size;
    public MetalSorter(){
        metals = (Tech[]) new Object[8];
        size = 0;
    }
    @Override
    public void addLast(Tech metal){
        if(size == metals.length){
            upSize(size * 2);
        }
        metals[size] = metal;
        size++;
    }
    private void upSize(int capacity){
        Tech[] temp = (Tech[]) new Object[capacity];
        System.arraycopy(metals, 0, temp, 0, size);
        metals = temp;
    }
    @Override
    public int size(){
        return size;
    }
}
