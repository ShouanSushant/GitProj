package com.sheridancollege;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class BankAccountTest {
    @Test
    @DisplayName("WithdrawTest $400,initial $500, min $-1000")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(400);
        assertEquals(100, bankAccount.getBalance());
    }
@Test
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.deposit(200);
        assertEquals(700, bankAccount.getBalance());

    }
@Nested
    class WhenBalanceEqualsZero{
        @Test
        public void testWithdrawBelowMinimum(){
            BankAccount bankAccount = new BankAccount(0, 0);
            assertThrows(RuntimeException.class,()-> bankAccount.withdraw(100));
        }
    }

    
}
