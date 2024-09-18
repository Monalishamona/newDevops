public class Customstack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    public Customstack(){
        this(DEFAULT_SIZE);
    }
    Customstack(int size){
        this.data = new int[size];
    }
    
}
