package com.example.banking.controller;

import com.example.banking.model.BankAccount;
import com.example.banking.service.BankAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bankaccounts")
public class BankAccountController {

    private final BankAccountService bankAccountService;

    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping
    public List<BankAccount> getAllBankAccounts() {
        return bankAccountService.getAllBankAccounts();
    }

    @PostMapping("/save")
    public void addBankAccount(@RequestBody BankAccount bankAccount) {
        bankAccountService.addBankAccount(bankAccount);
    }

    @PutMapping("/update/{accountid}")
    public void replaceBankAccount(
            @PathVariable int accountid,
            @RequestBody BankAccount bankAccount) {

        bankAccountService.replaceBankAccount(
                accountid,
                bankAccount
        );
    }

    @DeleteMapping("/delete/{accountid}")
    public void removeBankAccount(
            @PathVariable int accountid) {

        bankAccountService.removeBankAccount(accountid);
    }
}