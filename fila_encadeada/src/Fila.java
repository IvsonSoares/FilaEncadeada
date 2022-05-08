public class Fila {
    Node base = null;
    Node topo = null;

    public Fila() {}


    public void add(int element){
        Node elt = new Node(element);
        
        if(this.base == null){
            this.topo = elt;
            this.base = this.topo;
        }else {

            this.topo.proximo = elt;
            this.topo = this.topo.proximo;

        }

    }

    public Node remove(){
        Node element = this.base;
        this.base = this.base.proximo;
        return element;
    }

    public void clear(){
        this.base = null;
        this.topo = null;
    }

    public boolean isEmpty(){
        if(this.base == null && this.topo == null){
            return true;
        }
        return false;
    }

    public void printFila(){
        Node element = this.base;
        while(element != null){
            System.out.println(element.dado);
            element = element.proximo;
        }
    }
}
