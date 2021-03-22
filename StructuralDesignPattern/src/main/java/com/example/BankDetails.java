package com.example;

public class BankDetails 
{
private String bankname;
private String accholdername;
private long accountno;
public String getBankname() {
	return bankname;
}
public String getAccholdername() {
	return accholdername;
}
public long getAccountno() {
	return accountno;
}
public void setBankname(String bankname) {
	this.bankname = bankname;
}
public void setAccholdername(String accholdername) {
	this.accholdername = accholdername;
}
public void setAccountno(long accountno) {
	this.accountno = accountno;
}
@Override
public String toString() {
	return "BankDetails [bankname=" + bankname + ", accholdername=" + accholdername + ", accountno=" + accountno + "]";
}



}
