package solidempty.lsp.exercise.bankaccount.refactored;

import java.math.BigDecimal;

public abstract class WIthdrawableAccount extends Account {


    protected abstract void withdraw(BigDecimal amount);
}
