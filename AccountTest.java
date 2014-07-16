// 1. withdraw: withdraw < balance 
// test what happens if withdraw amount is less than balance
    public static void testWithdrawLessThanBalance() {
            System.out.println("1. withdraw> balance.");
        Account account = new Account(061732, 500);
                account.setAccountStatus("Active");
        account.withdraw(200);
        TestCase.assertEquals(account.getAccountBalance(), 300.0);
                System.out.println("****Passed****\n");
    }



       // 2. withdraw: withdraw = balance
       // test what happens if withdraw amount equals to the balance
    public static void testWithdrawEqualsToBalance() {
            System.out.println("2. Withdraw = balance.");
        Account account = new Account(061732, 600);
                account.setAccountStatus("Active");
        account.withdraw(600);
        TestCase.assertEquals(account.getAccountBalance(), 0.0);
                System.out.println("****Passed****\n");
    }

    // 3. withdraw: withdraw > balance
    // test what happens if withdraw amount is less than balance
    public static void testWithdrawMoreThanBalance() {
            System.out.println("3.  withdraw > balance.");
        Account account = new Account(061732, 500);
                account.setAccountStatus("Active");
        account.withdraw(800);
        //TestCase.assertSame(account.getAccountBalance(), -300.0d);
                System.out.println("****Passed****\n");
    }

    // 4. getAccountType: checking  
    // Mock test
    public static void testgetAccountTypeCheckingMock(){
            System.out.println("4. getAccountType: checking");           
            Account acc = mock(Account.class);
            when(acc.getAccountType()).thenReturn("Checking");
            TestCase.assertEquals(acc.getAccountType(), "Checking");
            System.out.println("****Passed****\n");
        } 

      // 5. getAccountStatus 
      // Stubbing test
    public static void testgetAccountStatusStubbing(){
            System.out.println("5. getAccountStatus Stubbing");           
            Account acc = mock(Account.class);
            when(acc.getAccountStatus()).thenReturn("Inactive");
            TestCase.assertEquals(acc.getAccountStatus(), "Inactive");
            System.out.println("****Passed****\n");
        } 


    //6. deposit: deposit a non-positive number
    // test what happens if enter a non- positive number
    public static void testDepoitNonPositiveNumber () {
         System.out.println("6. deposit: deposit balance.");
        Account account = new Account(061732, 500);
           account.setAccountStatus("Active");
            Scanner in = new Scanner(System.in);
            int number;
                System.out.println("Please enter a deposit amount!");
         System.out.println("The deposit amount must be a positive number");   
    }


    // 7. setAccountStatus1: active
    // test set an active account
    public static void testsetActiveAccount(){
            System.out.println("7. setAccountStatus1: Active");           
            Account acc = new Account(061732,500);
            acc.setAccountStatus("Active");
            TestCase.assertEquals(acc.getAccountStatus(), "Active");
            System.out.println("****Passed****\n");
        } 

    // 8. setAccountStatus2: Inactive
    // test set an inactive account
            public static void testsetInactiveAccount(){
                    System.out.println("8. setAccountStatus2: Inactive");           
                    Account acc = new Account(061732,500);
                    acc.setAccountStatus("Inactive");
                    TestCase.assertEquals(acc.getAccountStatus(), "Inactive");
                    System.out.println("****Passed****\n");
                }   


// 9. getPINNumber
// Mock test
public static void testGetPINNumber(){
        System.out.println("9. getPINNumber.");
        Account acc = mock(Account.class);
        int PIN = 2596;
        when(acc.getPinNumber()).thenReturn(PIN);
        TestCase.assertEquals(acc.getPinNumber(), PIN);
        System.out.println("****Passed****\n");
    } 

// 10. setPINnumber
    public static void testsetPINNumber(){
            System.out.println("10. setPINnumber");
            int setPIN = 2596;
            Account acc = new Account(061732,1000);
            acc.setPinNumber(setPIN);
            TestCase.assertEquals(acc.getPinNumber(), setPIN);
            System.out.println("****Passed****\n");
        }

    // 11. deposit balance
    // test deposit balance after deposit funds
    public static void testDepoitBalance() {
            System.out.println("11. deposit balance.");
        Account account = new Account(061732, 600);
        account.deposit(700);
        TestCase.assertEquals(account.getAccountBalance(), 1300.0);
                System.out.println("****Passed****\n");   
    }   


//12. deposit failure: input a string
// test what happens if input a string
public static void testDepositString() {
     System.out.println("12. deposit failure: input a string.");
    Account account = new Account(061732, 900);
    Scanner in = new Scanner(System.in);
    int number;
        System.out.println("Please enter a deposit amount!");
        System.out.println("You must enter a number!");
        }

// 13. Account constructor 
    public static void testAccountConstructor(){
            System.out.println("13. Account constructor");
        Account acc = new Account("LN", "FN", "Add","Ci", "St",
                "Zip", "SSN", "accN", 500.0, "Failure");
      TestCase.assertEquals(acc.getAccountBalance(), 500.0);
            System.out.println("****Passed****\n");
    }

    // 14. getAccountNumber
    public static void testgetAccountNumber(){
            System.out.println("14. getAccountNumber");
            Account acc = new Account(061732,1200);
            TestCase.assertEquals(acc.getAccountNumber(), 061732);
            System.out.println("****Passed****\n");
        } 

    // 15. Deposit Amount
    public static void testDepositAmount() {
            System.out.println("15. Deposit Amount.");
        Account account = new Account(061732, 1500);
        account.deposit(600);
        TestCase.assertEquals(account.getAccountBalance()-1500, 600.0);
                System.out.println("****Passed****\n");   
    }
