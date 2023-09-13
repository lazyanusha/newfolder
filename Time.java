//create class Time
public class Time {
    int hours;
    int minutes;
    int seconds;

// create constructor
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // create add method
    public Time add(Time t) {
        int ns = this.seconds + t.seconds; // addition of two seconds
        int nm = this.minutes + t.minutes + ns / 60; // addition of two minutes + if seconds is more than 60
        int nh = this.hours + t.hours + nm / 60; // addition of two hours + if minutes is more than 60

        this.hours = nh;
        this.minutes = nm % 60;
        this.seconds = ns % 60;
        return this;
    }

    // create subtract method
    public Time subtract(Time t) {
        int ns = this.seconds - t.seconds; // subtraction of seconds
        int nm = this.minutes - t.minutes; // subtraction of minutes
        int nh = this.hours - t.hours; // subtraction of hours
           

        if (ns < 0) {
            nm = (nm * 60) + this.seconds; // minutes bata 60 sec ghatako
            ns = 60 + ns; // negative seconds laii add gareko 60 ma
        }
      

        if (nm < 0) {
            nh = (nh * 60)  + this.minutes; // hour bata 60 minutes ghatako
            nm = 60 + nm; // negative minute ma 60 add gareko
        }
  
        if (nh < 0) {
            System.out.println("Error: Negative time difference!");
            nh = this.hours;  // same as given time
            nm = this.minutes;
            ns = this.seconds;
        } 
        
        else {
            this.hours = nh; // new time
            this.minutes = nm; // new time
            this.seconds = ns; // new time
        }

        return this;
    }

    // create display method
    public String display() {
        return hours + ":" + minutes + ":" + seconds;
    }
}