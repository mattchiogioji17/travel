package com.chio.user.service;

import java.security.Principal;

import com.chio.user.domain.PrimaryAccount;
import com.chio.user.domain.PrimaryTransaction;
import com.chio.user.domain.SavingsAccount;
import com.chio.user.domain.SavingsTransaction;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
