
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        if(day == 30) {
            day = 1;
            // month++;
            if(month == 12) {
                month = 1;
                year++;              
            } else
                month++;
        } else
            day++;
    }
    
    public void advance(int numberOfDays) {
        for(int x = 0; x < numberOfDays; x++)
            advance();
    }
    
    public MyDate afterNumberOfDays(int days) {
        MyDate d = new MyDate(day, month, year);
        d.advance(days);
        return d;
    }

}