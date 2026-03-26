package cmo.hky.oops;

public class Bank {
        private String name;
        private String branch;
        private String ifscCode;

        static {
            System.out.println("Static block executed");
        }

    public Bank() {
    }

    public static void bankDetails(){
            System.out.println("Bank details method executed");
        }

    public void bankType(){
        System.out.println("BankType details method executed");
    }
        public Bank(String name, String branch, String ifscCode) {
            this.name = name;
            this.branch = branch;
            this.ifscCode = ifscCode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBranch() {
            return branch;
        }

        public void setBranch(String branch) {
            this.branch = branch;
        }

        public String getIfscCode() {
            return ifscCode;
        }

        public void setIfscCode(String ifscCode) {
            this.ifscCode = ifscCode;
        }
}
