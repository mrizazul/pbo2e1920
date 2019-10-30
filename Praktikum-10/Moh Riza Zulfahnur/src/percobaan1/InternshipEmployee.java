/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author Riza Zulfah
 */
public class InternshipEmployee extends Employee{
    private int length;
    
    public InternshipEmployee(String nama, int length){
        this.length = length;
        this.nama = nama;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as intership employee for "+length+" month/s\n";
        return info;
    }
}
