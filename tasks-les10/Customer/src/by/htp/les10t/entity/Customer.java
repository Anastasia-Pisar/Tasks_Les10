package by.htp.les10t.entity;

public class Customer {

	private int id;
	private String fullName;
	private String address;
	private int creditCardNumber;
	private int bankAccountNumber;

	public Customer() {

		this.id = 1;
		this.fullName = "Сидоров Семен Семенович";
		this.address = "Украина, Киев";
		this.creditCardNumber = 111;
		this.bankAccountNumber = 1;
	}

	public Customer(int id, String fullName, String address, int creditCardNumber, int bankAccountNumber) {

		this.id = id;
		this.fullName = fullName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bankAccountNumber;
		result = prime * result + creditCardNumber;
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNumber != other.bankAccountNumber)
			return false;
		if (creditCardNumber != other.creditCardNumber)
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id = " + id + ", fullName = " + fullName + ", address = " + address + ", creditCardNumber = "
				+ creditCardNumber + ", bankAccountNumber = " + bankAccountNumber + "]";
	}
}
