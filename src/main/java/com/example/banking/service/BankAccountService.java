package com.example.banking.service;

import com.example.banking.model.BankAccount;
import com.example.banking.repository.BankAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public List<BankAccount> getAllBankAccounts() {
        return bankAccountRepository.findAll();
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccountRepository.save(bankAccount);
    }

    public void replaceBankAccount(int accountid, BankAccount newBankAccount) {

        if (bankAccountRepository.existsById(accountid)) {

            BankAccount oldBankAccount =
                    bankAccountRepository.findById(accountid).get();

            oldBankAccount.setAccountnumber(
                    newBankAccount.getAccountnumber()
            );

            oldBankAccount.setBalance(
                    newBankAccount.getBalance()
            );

            bankAccountRepository.save(oldBankAccount);
        }
    }

    public void removeBankAccount(int accountid) {
        bankAccountRepository.deleteById(accountid);
    }
}