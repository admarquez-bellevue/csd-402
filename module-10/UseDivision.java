// UseDivision.java
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intDiv1 = new InternationalDivision("Global Tech", 1001, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("World Solutions", 1002, "Japan", "Japanese");
        DomesticDivision domDiv1 = new DomesticDivision("Home Electronics", 2001, "California");
        DomesticDivision domDiv2 = new DomesticDivision("Auto Parts", 2002, "Texas");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}
