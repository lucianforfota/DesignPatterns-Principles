package solidempty.lsp.exercise.bankaccount.refactored;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private WIthdrawableAccount account;

    public BankingAppWithdrawalService(WIthdrawableAccount account) {
        this.account = account;
    }

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }
}
