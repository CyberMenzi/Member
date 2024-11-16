
package za.ac.tut.membership;
/**
 * @author Menzi
 */
public class Member {
    
    private String name;
    private String surname;
    private String idNo;
    private String gender;
    private String contractType;
    private Boolean isPersonalTrainerNeeded;

    public Member(String name, String surname, String idNo, String gender, String contractType, Boolean isPersonalTrainerNeeded) {
        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
        this.gender = gender;
        this.contractType = contractType;
        this.isPersonalTrainerNeeded = isPersonalTrainerNeeded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Boolean getIsPersonalTraineerNeeded() {
        return isPersonalTrainerNeeded;
    }

    public void setIsPersonalTraineerNeeded(Boolean isPersonalTraineerNeeded) {
        this.isPersonalTrainerNeeded = isPersonalTrainerNeeded;
    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", surname=" + surname + ", idNo=" + idNo + ", gender=" + gender + ", contractType=" + contractType + ", isPersonalTraineerNeeded=" + isPersonalTrainerNeeded + '}';
    }
    
    
    
    
}
