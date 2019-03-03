public class Scanner implements Scan{
    Sorter<String> wires = new WireSorter<>();
    Sorter<String> metals = new MetalSorter<>();
    Sorter<String> chips = new Chips<>();

    public void addElectronic(String[] elec){
        if (elec[0].equals("wires")){
            wires.addLast(elec[1]);
        }
        else if(elec[0].equals("metals")){
            metals.addLast(elec[1]);
        }
        else if(elec[0].equals("chips")){
            chips.addLast(elec[1]);
        }
        else{
            System.out.print("This aint an electronic bruh");
        }
    }
    public int currentSize(Sorter x){
        return x.size();
    }
}
