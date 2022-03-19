package Observer;

public interface subject {
    public interface Subject {
        public void registerObserver(Observer o);

        public void removeObserver(Observer o);

        public void notIfyObservers(double novoCredito);

    }
}
