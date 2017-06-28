public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
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
      
    public int differenceInYears(MyDate comparedDate) {
        int laterDays;
        int earlierDays;
        
        if(year > comparedDate.year) {
            laterDays = (month - 1) * 30 + day;
            earlierDays = (comparedDate.month - 1) * 30 + comparedDate.day;
            if(earlierDays > laterDays) 
                return year - comparedDate.year - 1;
            else
                return year - comparedDate.year;
        } else {
            earlierDays = (month - 1) * 30 + day;
            laterDays = (comparedDate.month - 1) * 30 + comparedDate.day;
            if(earlierDays > laterDays) 
                return comparedDate.year - year - 1;
            else
                return comparedDate.year - year;
        }
        
        
    }
    
    

}
