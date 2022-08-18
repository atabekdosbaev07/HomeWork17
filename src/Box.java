public class Box<T,V> {

    private T height;
    private V wight;

    public Box(T height, V wight) {
        this.height = height;
        this.wight = wight;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public V getWight() {
        return wight;
    }

    public void setWight(V wight) {
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", wight=" + wight +
                '}';
    }

    public static <S> S met(S a){
        return a;
    }

    

}
