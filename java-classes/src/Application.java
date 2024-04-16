public class Application {

    public static void main(String[] args) {
        Contract newContract = new Implementation();
        printContract(newContract);
    }
    static  void printContract(Contract contract){
        contract.term1();
        contract.term2();
        contract.extendedTerm();
    }

}
