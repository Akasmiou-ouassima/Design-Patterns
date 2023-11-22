package org.example;

import org.example.Util.JsonSerializerd;
import org.example.enums.AccountStatus;
import org.example.enums.AccountType;
import org.example.model.BankAccount;
import org.example.model.Customer;
import org.example.repository.AccountRepositoryImpl;

import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
         /*BankAccount account2=new BankAccount(3L,6500,"MAD",AccountType.SAVING_ACCOUNT,AccountState.CREATED);
        System.out.println(account2);

        BankAccount account= new BankAccount();
        account.setAccountId(2L);
        account.setCurrency("MAD");
        account.setStatus(AccountState.CREATED);
        account.setType(AccountType.SAVING_ACCOUNT);

        BankAccount account1= BankDirector.accountBuilder()
                .accountId(1L)
                .currency("MAD")
                .status(AccountState.CREATED)
                .type(AccountType.SAVING_ACCOUNT)
                .balance(7000)
                .build();
        System.out.println(account1.toString());
       */
        /* BankAccount bankAccount = BankAccount.builder()
                .accountId(1L)
                .currency("MAD")
                .status(AccountState.CREATED)
                .type(AccountType.SAVING_ACCOUNT)
                .balance(7000)
                .build();
        System.out.println(bankAccount.toString());


        AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
        accountRepository.populateData();
        List<BankAccount> bankAccounts = accountRepository.findAll();
        bankAccounts.forEach(System.out::println);*/

        /*JsonSerializerd<BankAccount> bankAccountJsonSerializerd=new JsonSerializerd<>();
        AccountRepositoryImpl accountRepository=new AccountRepositoryImpl();
        accountRepository.populateData();
       // List<BankAccount> bankAccounts=accountRepository.findAll();
        List<BankAccount> bankAccounts=accountRepository.searchAccount(new Predicate<BankAccount>() {
            @Override
            public boolean test(BankAccount bankAccount) {
                return bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT);
            }
        });
        bankAccounts.stream().map(bankAccountJsonSerializerd::toJson).forEach(System.out::println);

        System.out.println("===================");
        accountRepository.findById(1L).ifPresent(account -> System.out.println(bankAccountJsonSerializerd.toJson(account)));
         */
        // singleton chargé une seule fois dans la mémoire
        // AccountRepositoryImpl accountRepository=AccountRepositoryImpl.getInstance();

        System.out.println("===================================");
        BankAccount account1=new BankAccount();
        account1.setAccountId(1L);
        account1.setCurrency("MAD");
        account1.setType(AccountType.CURRENT_ACCOUNT);
        account1.setBalance(10000);
        account1.setStatus(AccountStatus.ACTIVATED);
        account1.setCustomer(new Customer(1L, "ouassima"));

        BankAccount account3=account1.clone();

        System.out.println(account1);

        System.out.println(account3);

        System.out.println("******************************");

        account1.setBalance(50000);
        System.out.println(account1.getBalance());
        System.out.println(account3.getBalance());

        account1.getCustomer().setName("mohamed");
        System.out.println(account1);

        System.out.println(account3);
    }
}
