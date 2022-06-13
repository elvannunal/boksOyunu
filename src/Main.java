public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("A",120,10,100,30);
        Fighter f2=new Fighter("B",86,5,85,30);

        Match match=new Match(f1,f2,85,100);
        match.startRun();
    }
}
