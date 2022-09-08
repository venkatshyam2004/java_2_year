import java.util.Iterator;

public class NameRepository implements container {
    public String names[]={"Robert","john","Julie","lora"};
    @Override
    public Iterator getIterator(){
        return new NameItertor();

    }   
    private class NameItertor implements Iterator {
        int index;
        @Override
        public boolean hasnext(){
            if(index<names.length){
                return true;            
            }
            return false;

        }
        @Override
        public object next(){
            if(this.hasnext()){
                return names[index++];
            }
            return null;
        }
    }
    
}
