public class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time add(Time t) {
        int ns = this.seconds + t.seconds;
        int nm = this.minutes + t.minutes + ns / 60;
        int nh = this.hours + t.hours + nm / 60;

        this.hours = nh;
        this.minutes = nm % 60;
        this.seconds = ns % 60;
        return this;
    }

    public Time subtract(Time t) {
        int ns = this.seconds - t.seconds;
        int nm = this.minutes - t.minutes;
        int nh = this.hours - t.hours;
           

        if (ns < 0) {
            nm = (nm * 60) + this.seconds;
            ns = 60 + ns;
        }
      

        if (nm < 0) {
            nh = (nh * 60)  + this.minutes;
            nm = 60 + nm;
        }
  
        if (nh < 0) {
            System.out.println("Error: Negative time difference!");
            nh = this.hours;
            nm = this.minutes;
            ns = this.seconds;
        } 
        
        else {
            this.hours = nh;
            this.minutes = nm;
            this.seconds = ns;
        }
        System.out.println(nh);
        return this;
    }

    public String display() {
        return hours + ":" + minutes + ":" + seconds;
    }
}