package Account;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    //Testowanie metod domyślnego konstruktora
    @Test
    public void accountDefaultGetIdGetNameGetBalanceTest(){
        Account account = new Account("1a", "KontoAAA");
        Assert.assertEquals("1a", account.getID());
        Assert.assertEquals("KontoAAA", account.getName());
        Assert.assertEquals(0, account.getBalance());
    }

    @Test
    public void accountDefaultCreditTest(){
        Account account = new Account("1a", "KontoAAA");
        Assert.assertEquals(1000, account.credit(1000));
        Assert.assertEquals(1000, account.getBalance());

    }

    @Test
    public void accountDefaultDebitTest(){
        Account account = new Account("1a", "KontoAAA");
        Assert.assertEquals(0, account.debit(100));
    }

    @Test
    public void accountDefaultTransferTest(){
        Account account = new Account("1a", "KontoAAA");
        Account secondAccount = new Account("1b", "Konto");
        Assert.assertEquals(0, account.transfer(secondAccount, 1000));
    }
    @Test
    public void accountDefaultStringTest(){
        Account account = new Account("1a", "KontoAAA");
        Assert.assertEquals("Account[id=1a,name=KontoAAA,balance=0]", account.toString());
    }

    //Testowanie metod konstruktora z saldem
    @Test
    public void accountBalance1500GetIdGetNameGetBalanceTest(){
        Account account = new Account("2a", "KontoBBB", 1500);
        Assert.assertEquals("2a", account.getID());
        Assert.assertEquals("KontoBBB", account.getName());
        Assert.assertEquals(1500, account.getBalance());
    }

    @Test
    public void accountBalance1500CreditTest(){
        Account account = new Account("2a", "KontoBBB", 1500);
        Assert.assertEquals(2500, account.credit(1000));
        Assert.assertEquals(2500, account.getBalance());
    }

    @Test
    public void accountBalance1500DebitTest(){
        Account account = new Account("2a", "KontoBBB", 1500);
        Assert.assertEquals(500, account.debit(1000));
        Assert.assertEquals(500, account.getBalance());
    }

    @Test
    public void accountBalance1500TransferTest(){
        Account account = new Account("2a", "KontoBBB", 1500);
        Account secondAccount = new Account("1b", "Konto");
        Assert.assertEquals(500, account.transfer(secondAccount, 1000));
        Assert.assertEquals(500, account.getBalance());
        Assert.assertEquals(1000, secondAccount.getBalance());
    }

    @Test
    public void accountBalance1500tStringTest(){
        Account account = new Account("2a", "KontoBBB", 1500);
        Assert.assertEquals("Account[id=2a,name=KontoBBB,balance=1500]", account.toString());
    }
}
