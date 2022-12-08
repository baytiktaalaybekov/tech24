public class Bankaccount {
    private String bank;
    private String numbers;
    private String password;

    public Bankaccount(String bank, String numbers, String password) {
        this.bank = bank;
        this.numbers = numbers;
        this.password = password;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Bankaccount{" +
                "bank='" + bank + '\'' +
                ", numbers='" + numbers + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
