package GovermentStructure;

public class Passport {
    private static int counterID =0;
    private final int passportID;
    private String surname;
    private String name;
    private String patronymic;
    private int birthYear;

    public Passport(String surname, String name, String patronymic, int birthYear) {
        passportID=counterID++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportID=" + passportID +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getPassportID() {
        return passportID;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

}
