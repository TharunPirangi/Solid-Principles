package solidprinciples.codewithoutsolid.transactions;

public class Transaction {
    private int transactionId;
    private String transactionType;
    private int amount;

    public Transaction(int transactionId, String transactionType, int amount){
        setTransactionId(transactionId);
        setTransactionType(transactionType);
        setAmount(amount);
    }
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
