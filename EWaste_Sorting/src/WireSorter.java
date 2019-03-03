public class WireSorter<Tech> implements Sorter<Tech> {
    private Tech[] wires;
    private int size;
    public WireSorter(){
        wires = (Tech[]) new Object[8];
        size = 0;
    }
    @Override
    public void addLast(Tech wire){
        if(size == wires.length){
            upSize(size * 2);
        }
        wires[size] = wire;
        size++;
    }
    private void upSize(int capacity){
        Tech[] temp = (Tech[]) new Object[capacity];
        System.arraycopy(wires, 0, temp, 0, size);
        wires = temp;
    }
    @Override
    public int size(){
       return size;
    }
}
