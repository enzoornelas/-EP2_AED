

public class PilhaIngenua{
    protected int capacity;
    public static final int CAPACITY=8;
    protected Integer[]pilha;
    protected int size;

    public PilhaIngenua(){
        capacity=CAPACITY;
        pilha = new Integer[capacity];
        size=0;
    }

    public void add(int newElement){
        if(size==capacity){
            capacity+=CAPACITY;
            Integer[]tmp=new Integer[capacity];
            for(int j=0;j<size;j++)
                tmp[j]=pilha[j];
            pilha=tmp;
        }
        pilha[size]=newElement;
        size++;
    }
    public int remove(){
        int tmp=pilha[size];
        size--;
        return tmp;
    }
}
