package OOPConcepts.II;
public class Call{
     private String callPhoneNumber;
    public Call(String callPhoneNumber) {
        this.callPhoneNumber = callPhoneNumber;
    }

    public String getCallPhoneNumber() {
        return callPhoneNumber;
    }
    @Override
    public String toString() {
        return (callPhoneNumber);
    }
}

