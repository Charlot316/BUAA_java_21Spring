class Phone{
	private String phonebrand;
	private String phonemodel;
	private String phoneuser;
	public String getPhonebrand() {
		return phonebrand;
	}

	public void setPhonebrand(String phonebrand) {
		this.phonebrand = phonebrand;
	}

	public String getPhonemodel() {
		return phonemodel;
	}

	public void setPhonemodel(String phonemodel) {
		this.phonemodel = phonemodel;
	}

	public String getPhoneuser() {
		return phoneuser;
	}

	public void setPhoneuser(String phoneuser) {
		this.phoneuser = phoneuser;
	}

	public String toString() {
		return "�ֻ�Ʒ��:"+phonebrand+"\n"+"�ֻ��ͺ�:"+phonemodel+"\n";
	}
}