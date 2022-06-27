package localClassExample;

public class sendMoney {
    public void sendByCard(double amount, Long cardNumber, Integer cvc, String expiryDate){

        class SwedBankData {
            double amount;
            Long cardNumber;
            Integer cvc;
            String expiryDate;
            String secretKey;
        }
        SwedBankData transactionData = new SwedBankData();
        transactionData.amount = amount;
        transactionData.cardNumber = cardNumber;
        transactionData.cvc = cvc;
        transactionData.expiryDate = expiryDate;
        transactionData.secretKey = "bjhgkj";

        //swedBankData response = swedBankLib.processTransaction(transactionData);
    }
}
