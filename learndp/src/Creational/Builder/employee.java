package Creational.Builder;

import java.math.BigInteger;

public class employee {
    private String name;
    private BigInteger empid;
    private String email;
    private String password;
    private employee(employeebuilder builder){
        this.empid=builder.empid;
        this.name=builder.name;
        this.email=builder.email;
        this.password=builder.password;
    }
    public static employeebuilder getBuilder(BigInteger id, String name){
        return new employeebuilder( id, name);
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", empid=" + empid +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class employeebuilder{
        private String name;
        private BigInteger empid;
        private String email;
        private String password;
        //employee e; this will break if anyone creates/saves the employee builder class object and use it to set parametrs.


        public employeebuilder(BigInteger empid, String empname){
            this.empid=empid;
            this.name=empname;
        }



        public employeebuilder addemail(String email){
            this.email=email;
            return this;
        }
        public employeebuilder addPassword( String password){
            this.password=password;
            return this;
        }

        public employee build(){

            employee e=new employee(this);
            if(e.name.startsWith("s")){
                throw new customexception();
            }
            return e;
        }

    }
}

// validation