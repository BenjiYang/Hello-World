public class BankDemp {
	public static void main(String[] args) {
		Bank bank = new Bank();
		for (int i = 0; i < Bank.accountNum; i++) {
			new TransferWork(bank, i).start();
		}
	}
}

class Bank {
	private long[] account;
	private long transferCounter = 0; 	// 计算器
	static int accountNum = 10;
	public Bank() {
		account = new long[accountNum];		
		for (int i = 0; i < accountNum; i++) {// 初始时，每个账户有存款500
			account[i] = 500;
		}
		showTotalDeposit();
	}
	public void transfer(int fromAccount, int toAccount, int amount) {		
		while (account[fromAccount] < amount) {// 如果账户余额不够，则等待
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		account[fromAccount] = account[fromAccount] - amount;
		account[toAccount] = account[toAccount] + amount;
		transferCounter++;
		if (transferCounter % 5000 == 0) {
			showTotalDeposit();
		}
	}
	public void showTotalDeposit() {
		long sum = 0;
		for (int i = 0; i < account.length; i++) {
			sum += account[i];
		}
		System.out.println("Total Deposit=" + sum);
		for (int i = 0; i < account.length; i++) {
			System.out.println("  " + account[i]);
		}
		System.out.println("\n-----------------------------");
	}
}

class TransferWork extends Thread {
	private Bank bank;
	private int fromAccount;
	public TransferWork(Bank bank, int fromAccount) {
		this.bank = bank;
		this.fromAccount = fromAccount;
	}
	public void run() {
		while (true) {
			// 产生一个0至accountNum-1的整数
			int toAccount = (int) ((Bank.accountNum - 1) * Math.random());
			// 不能转账至同一账户
			if (toAccount == fromAccount) {
				toAccount = (toAccount + 1) % Bank.accountNum;
			}
			int amount = 1 + (int) (500 * Math.random()) / 2;
			bank.transfer(fromAccount, toAccount, amount);
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

